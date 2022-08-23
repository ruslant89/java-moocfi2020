import java.util.ArrayList;

public class Hold {

    private ArrayList<Suitcase> suitcases;
    private int maxWeight;

    public Hold(int maxWeight) {
        this.suitcases = new ArrayList<>();
        this.maxWeight = maxWeight;
    }

    public void addSuitcase(Suitcase suitcase) {
        int total = suitcase.totalWeight();

        for (Suitcase sc : this.suitcases) {
            total += sc.totalWeight();
        }

        if (total <= this.maxWeight) {
            this.suitcases.add(suitcase);
        }
    }

    public String toString() {
        int weight = 0;
        for (Suitcase suitcase : this.suitcases) {
            weight += suitcase.totalWeight();
        }
        return this.suitcases.size() + " suitcases (" + weight + " kg)";
    }

    public void printItems() {
        for (Suitcase suitcase : this.suitcases) {
            suitcase.printItems();
        }
    }
}
