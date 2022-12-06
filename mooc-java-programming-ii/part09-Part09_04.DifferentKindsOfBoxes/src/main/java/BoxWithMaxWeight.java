import java.util.HashSet;
import java.util.Set;

public class BoxWithMaxWeight extends Box{

    private final int maxCapacity;
    private final Set<Item> set;

    public BoxWithMaxWeight(int capacity){
        this.maxCapacity = capacity;
        set = new HashSet<>();
    }

    @Override
    public void add(Item item) {
        int currentWeight = 0;
        for (Item i : set){
            currentWeight += i.getWeight();
        }
        if (item.getWeight() + currentWeight <= maxCapacity) {
            set.add(item);
        }

    }

    @Override
    public boolean isInBox(Item item) {
        return set.contains(item);
    }
}
