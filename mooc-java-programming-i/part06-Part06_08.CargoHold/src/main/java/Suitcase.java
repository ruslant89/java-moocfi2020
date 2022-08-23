import java.util.ArrayList;

public class Suitcase {

    private ArrayList<Item> items;
    private int maximumWeight;

    public Suitcase(int maximumWeight) {
        this.items = new ArrayList<>();
        this.maximumWeight = maximumWeight;
    }

    public void addItem(Item item) {
        int total = item.getWeight() + totalWeight();
        if (total <= this.maximumWeight) {
            this.items.add(item);
        }
    }

    public String toString() {
        String response = "" + this.items.size();
        String item = "";

        if (this.items.size() > 1 || this.items.size() == 0) {
            item = " items";
        } else {
            item = " item";
        }

        if (this.items.isEmpty()) {
            response = "no";
        }

        return response + item + " (" + totalWeight() + " kg)";
    }

    public int totalWeight() {
        int total = 0;
        for (Item item : items) {
            total += item.getWeight();
        }
        return total;
    }

    public void printItems() {
        for (Item item : this.items) {
            System.out.println(item);
        }
    }

    public Item heaviestItem() {
        if (this.items.isEmpty()) {
            return null;
        }

        int heaviest = this.items.get(0).getWeight();
        Item heaviestItem = this.items.get(0);

        for (Item item : this.items) {
            if (item.getWeight() > heaviest) {
                heaviest = item.getWeight();
                heaviestItem = item;
            }
        }

        return heaviestItem;
    }
}
