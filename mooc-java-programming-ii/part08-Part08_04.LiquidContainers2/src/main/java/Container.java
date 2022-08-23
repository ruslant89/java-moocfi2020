public class Container {

    private int amountLiquid;
    private final int maxLiquid;

    public Container () {
        this.amountLiquid = 0;
        this.maxLiquid = 100;
    }

    public Container (int amountLiquid) {
        this.amountLiquid = amountLiquid;
        this.maxLiquid = 100;
    }

    public int contains() {
        return this.amountLiquid;
    }

    public void add(int amount) {
        if (amount > 0 && !(this.amountLiquid + amount > maxLiquid)) {
            this.amountLiquid += amount;
        } else {
            this.amountLiquid = maxLiquid;
        }
    }

    public void remove(int amount) {
        if (amount > 0 && amount < this.amountLiquid) {
            this.amountLiquid -= amount;
        } else {
            this.amountLiquid = 0;
        }
    }

    public String toString() {
        return this.amountLiquid + "/" + maxLiquid;
    }
}
