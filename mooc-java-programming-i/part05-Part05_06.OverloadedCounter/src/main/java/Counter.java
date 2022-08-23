public class Counter {

    private int number;

    public Counter() {
        this(0);
    }

    public Counter(int startValue) {
        this.number = startValue;
    }

    public int value() {
        return this.number;
    }

    public void increase() {
        this.increase(1);
    }

    public void increase(int increaseBy) {
        if (increaseBy > 0) {
            this.number = this.number + increaseBy;
        }
    }

    public void decrease() {
        this.decrease(1);
    }

    public void decrease(int decreaseBy) {
        if (decreaseBy > 0) {
            this.number = this.number - decreaseBy;
        }
    }

    public String toString() {
        return "Value of counter is: " + this.number;
    }
 }
