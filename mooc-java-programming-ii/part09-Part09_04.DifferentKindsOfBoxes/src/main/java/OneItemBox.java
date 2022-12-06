import java.util.HashSet;
import java.util.Set;

public class OneItemBox extends Box {

    private final Set<Item> set;

    public OneItemBox() {
        set = new HashSet<>(1);
    }

    @Override
    public void add(Item item) {
        if (set.size() < 1) {
            set.add(item);
        }

    }

    @Override
    public boolean isInBox(Item item) {
        return set.contains(item);
    }
}
