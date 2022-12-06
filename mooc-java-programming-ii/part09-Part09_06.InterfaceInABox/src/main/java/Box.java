import java.util.HashSet;
import java.util.Set;

public class Box implements Packable {

    private final double maxCapacity;
    private final Set<Packable> contents;

    public Box(double maxCapacity) {
        this.maxCapacity = maxCapacity;
        contents = new HashSet<>();
    }

    public void add(Packable item) {
        if (weight() + item.weight() <= maxCapacity) {
            contents.add(item);
        }
    }

    public double weight() {
        return contents.stream().mapToDouble(Packable::weight).sum();
    }

    @Override
    public String toString() {
        return "Box: " + contents.size() + " items, total weight " + weight() + " kg";
    }
}
