
public class Main {

    public static void main(String[] args) {
// the usual:
        ProductWarehouseWithHistory pwh = new ProductWarehouseWithHistory("coffee", 10, 2);
        pwh.addToWarehouse(4);
        pwh.takeFromWarehouse(2);
        pwh.printAnalysis(); // Juice: balance = 989.7, space left 10.3
        // etc
        // and now we have the history:

    }

}
