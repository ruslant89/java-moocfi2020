import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Warehouse {

    private Map<String, Integer> productsPrice;
    private Map<String, Integer> productsStock;

    public Warehouse() {
        this.productsPrice = new HashMap<>();
        this.productsStock = new HashMap<>();
    }

    public void addProduct(String product, int price, int stock) {
        this.productsPrice.put(product, price);
        this.productsStock.put(product, stock);
    }

    public int price(String product) {
        if (this.productsPrice.containsKey(product)) {
            return this.productsPrice.get(product);
        }
        return -99;
    }

    public int stock(String product) {
        return this.productsStock.get(product) != null ? this.productsStock.get(product) : 0;
    }

    public boolean take(String product) {
        if (this.productsStock.containsKey(product)) {
            if (this.productsStock.get(product) > 0) {
                int stock = this.productsStock.get(product);
                stock--;
                this.productsStock.put(product, stock);
                return true;
            }
        }

        return false;
    }

    public Set<String> products() {
        return this.productsStock.keySet();
    }
}
