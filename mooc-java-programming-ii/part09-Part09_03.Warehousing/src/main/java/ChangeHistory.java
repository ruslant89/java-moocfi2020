import java.util.ArrayList;

public class ChangeHistory {

    private ArrayList<Double> amounts;

    public ChangeHistory() {
        this.amounts = new ArrayList<>();
    }

    public void add(double status) {
        this.amounts.add(status);
    }

    public void clear() {
        this.amounts.clear();
    }

    public double maxValue() {
        if (this.amounts.isEmpty()) {
            return 0.0;
        }

        double max = 0.0;
        for (Double d : this.amounts) {
            if (d > max) {
                max = d;
            }
        }
        return max;
    }

    public double minValue() {
        if (this.amounts.isEmpty()) {
            return 0.0;
        }

        double min = this.amounts.get(0);
        for (Double d : this.amounts) {
            if (d < min) {
                min = d;
            }
        }
        return min;
    }

    public double average() {
        if (this.amounts.isEmpty()) {
            return 0.0;
        }

        int numberOfItems = this.amounts.size();
        double sum = 0.0;
        for (Double d : this.amounts) {
            sum += d;
        }
        return sum / numberOfItems;
    }

    @Override
    public String toString() {
        return this.amounts.toString();
    }
}

