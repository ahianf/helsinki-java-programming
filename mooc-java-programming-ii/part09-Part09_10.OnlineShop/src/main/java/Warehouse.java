import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Warehouse {

    private Map<String, Integer> productPriceMap = new HashMap<>();
    private Map<String, Integer> productStockMap = new HashMap<>();

    public void addProduct(String product, int price, int stock) {
        productPriceMap.put(product, price);
        productStockMap.put(product, stock);
    }

    public int price(String product) {
        Integer price = productPriceMap.get(product);
        if (price == null) {
            return -99;
        }
        return price;
    }

    public int stock(String product) {
        Integer stock = productStockMap.get(product);
        if (stock == null) {
            return 0;
        }
        return stock;
    }

    public boolean take(String product) {
        Integer integer = productStockMap.get(product);
        if (integer == null || integer == 0) {
            return false;
        } else {
            productStockMap.put(product, integer - 1);
            return true;
        }
    }

    public Set<String> products(){
        return productStockMap.keySet();
    }
}
