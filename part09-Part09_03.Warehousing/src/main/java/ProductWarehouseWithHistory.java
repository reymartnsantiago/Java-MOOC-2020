/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Cavitecity
 */
public class ProductWarehouseWithHistory extends ProductWarehouse {

    private ChangeHistory historyObj;

    public ProductWarehouseWithHistory(String productName, double capacity, double initialBalance) {
        super(productName, capacity);
        super.addToWarehouse(initialBalance);
        historyObj = new ChangeHistory();
        historyObj.add(initialBalance);
    }

    @Override
    public void addToWarehouse(double amount) {
        super.addToWarehouse(amount); //To change body of generated methods, choose Tools | Templates.
        historyObj.add(amount);
    }

    @Override
    public double takeFromWarehouse(double amount) {
        double value = super.takeFromWarehouse(amount);
        historyObj.add(super.getBalance());
        return value; //To change body of generated methods, choose Tools | Templates.
    }

    public void printAnalysis() {
        System.out.println("Product: " + super.getName());
        System.out.println("History: " + historyObj.toString());
        System.out.println("Largest amount of product: " + historyObj.maxValue());
        System.out.println("Smallest amount of product: " + historyObj.minValue());
        System.out.println("Average: " + historyObj.average());
    }

    public String history() {
        return historyObj.toString();
    }

}
