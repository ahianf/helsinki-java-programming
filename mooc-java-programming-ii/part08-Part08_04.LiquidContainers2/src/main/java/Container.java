
/**
 *
 * @author ahian
 */
public class Container {

    private final int CONTAINER_SIZE = 100;
    private int container;

    public Container() {
        container = 0;
    }

    public int contains() {
        return container;
    }

    public void add(int amount) {

        if (amount <= 0) {
            return;
        }

        container = amount + container;
        if (container > CONTAINER_SIZE) {
            container = CONTAINER_SIZE;
        }

    }

    public void remove(int amount) {

        if (amount <= 0) {
            return;
        }

        container = container - amount;
        if (container < 0) {
            container = 0;
        }
    }

    public String toString() {
        return container + "/" + CONTAINER_SIZE;
    }

}
