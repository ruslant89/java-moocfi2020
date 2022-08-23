import java.util.ArrayList;
import java.util.List;

public class ShoppingCart {

    private List<Item> shoppingCart;

    public ShoppingCart() {
        this.shoppingCart = new ArrayList<>();
    }

    public void add(String product, int price) {
        if (this.shoppingCart.contains(new Item(product, 1, price))) {
            for (Item i : this.shoppingCart) {
                if (i.getProduct().equals(product)) {
                    i.increaseQuantity();
                }
            }
        } else {
            this.shoppingCart.add(new Item(product, 1, price));
        }
    }

    public int price() {
        int total = 0;
        for (Item i : this.shoppingCart) {
            total += i.price();
        }
        return total;
    }

    public void print() {
        for (Item i : this.shoppingCart) {
            System.out.println(i);
        }
    }
}
