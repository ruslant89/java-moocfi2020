
public class Statistics {

    private int count;
    private int sum;

    public Statistics() {
        this.count = 0;
        this.sum = 0;
    }

    public void addNumber(int number) {
        sum += number;
        this.count++;
    }

    public int getCount() {
        return this.count;
    }

    public int sum() {
        return this.sum;
    }

    public double average() {
        if (getCount() > 0) {
            return (double) this.sum / getCount();
        }
        return 0.0;
    }
}
