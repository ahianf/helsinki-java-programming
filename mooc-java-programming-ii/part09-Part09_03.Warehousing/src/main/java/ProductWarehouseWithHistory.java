public class ProductWarehouseWithHistory extends ProductWarehouse {

    private final ChangeHistory changeHistory = new ChangeHistory();

    public ProductWarehouseWithHistory(String productName, double capacity, double initialBalance) {
        super(productName, capacity);
        changeHistory.add(initialBalance);
        super.addToWarehouse(initialBalance);
    }

    public String history() {
        return changeHistory.toString();
    }

    public void addToWarehouse(double amount) {
        super.addToWarehouse(amount);
        changeHistory.add(super.getBalance());
    }

    public double takeFromWarehouse(double amount) {
        if (amount > super.getBalance()) {
            return super.getBalance();
        }
        super.takeFromWarehouse(amount);
        changeHistory.add(super.getBalance());
        return super.getBalance();
    }

    public void printAnalysis() {
        String text = String.format("Product: %s\n" +
                                    "History: %s\n" +
                                    "Largest amount of product: %s\n" +
                                    "Smallest amount of product: %s\n" +
                                    "Average: %s",
                this.getName(), this.history(), changeHistory.maxValue(), changeHistory.minValue(), changeHistory.average());

        System.out.println(text);
    }

}
