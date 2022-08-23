public class ProductWarehouseWithHistory extends ProductWarehouse {

    private ChangeHistory changeHistory;

    public ProductWarehouseWithHistory(String productName, double capacity, double initialBalance) {
        super(productName, capacity);
        super.addToWarehouse(initialBalance);
        changeHistory = new ChangeHistory();
        changeHistory.add(initialBalance);
    }

    public String history() {
        return changeHistory.toString();
    }

    public void addToWarehouse(double amount) {
        super.addToWarehouse(amount);
        this.changeHistory.add(super.getBalance());
    }

    public double takeFromWarehouse(double amount) {
        double balance = super.takeFromWarehouse(amount);
        this.changeHistory.add(balance);
        return balance;
    }

    public void printAnalysis() {
        String toPrint = "Product: " + super.getName() + "\n" + "History: " + history() + "\n" +
                "Largest amount of product: " + this.changeHistory.maxValue() + "\n" +
                "Smallest amount of product: " + this.changeHistory.minValue() + "\n" +
                "Average: " + this.changeHistory.average();
        System.out.println(toPrint);
    }
}
