import java.sql.Connection;

public class Container {

    private int container;
    private int maxCapacity;

    public Container() {
        this.container = 0;
        this.maxCapacity = 100;
    }

    public Container(int container) {
        this.container = container;
        this.maxCapacity = 100;
    }

    public int contains() {
        return this.container;
    }

    public void add(int amount) {
        int tempCapacity = this.container + amount;
        if (amount > 0 && tempCapacity < this.maxCapacity) {
            this.container += amount;
        } else {
            this.container = maxCapacity;
        }
    }

    public void remove(int amount) {
        int tempCapacity = this.container - amount;
        if (amount > 0 && !(tempCapacity < 0)) {
            this.container -= amount;
        } else {
            this.container = 0;
        }
    }

    public String toString() {
        return this.container + "/" + this.maxCapacity;
    }

}
