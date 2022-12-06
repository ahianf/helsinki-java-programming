import java.util.HashMap;
import java.util.Map;

public class Item {

    private String product;
    private int qty;
    private int unitPrice;

    public Item(String product, int qty, int unitPrice) {
        this.product = product;
        this.qty = qty;
        this.unitPrice = unitPrice;
    }

    public int price() {
        return qty * unitPrice;
    }

    public void increaseQuantity() {
        qty++;
    }

    public String toString() {
        return product + ": " + qty;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Item item = (Item) o;

        if (unitPrice != item.unitPrice) return false;
        return product.equals(item.product);
    }

    @Override
    public int hashCode() {
        int result = product.hashCode();
        result = 31 * result + unitPrice;
        return result;
    }
}
