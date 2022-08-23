
import java.util.ArrayList;

public class Box implements Packable {

    private ArrayList<Packable> items;
    private double maxCapacity;

    public Box(double maxCapacity) {
        this.maxCapacity = maxCapacity;
        this.items = new ArrayList<>();
    }

    public void add(Packable item) {
        if (weight() < maxCapacity && (item.weight() + weight() <= maxCapacity)) {
            this.items.add(item);
        }
    }

    @Override
    public double weight() {
        double weight = 0;
        // calculate the total weight of the items in the box
        for (Packable i : this.items) {
            weight += i.weight();
        }
        return weight;
    }

    @Override
    public String toString() {
        return "Box: " + this.items.size() + " items, total weight " + weight() + " kg";
    }
}
