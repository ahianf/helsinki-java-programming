import java.util.ArrayList;
import java.util.List;

public class ShoppingCart {

    private List<Item> list = new ArrayList<>();

    public void add(String product, int price) {
        Item item = new Item(product, 1, price);
        if (!list.contains(item)) {
            list.add(item);
        } else {
            int i = list.indexOf(item);
            Item item1 = list.get(i);
            item1.increaseQuantity();
        }
    }

    public int price() {
        int sum = list.stream().mapToInt(Item::price).sum();
        return sum;
    }

    public void print() {
        for (Item i : list) {
            System.out.println(i);
        }
    }
}
