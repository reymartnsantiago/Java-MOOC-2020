
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Cavitecity
 */
public class Warehouse {

    private Map<String, Integer> productsAndStock;
    private Map<String, Integer> productsAndPrice;

    public Warehouse() {
        productsAndStock = new HashMap<>();
        productsAndPrice = new HashMap<>();
    }

    public void addProduct(String product, int price, int stock) {
        productsAndPrice.put(product, price);
        productsAndStock.put(product, stock);

    }

    public int stock(String product) {
        return productsAndStock.containsKey(product) ? productsAndStock.get(product) : 0;
    }

    public int price(String product) {
        return productsAndPrice.containsKey(product) ? productsAndPrice.get(product) : -99;
    }

    public boolean take(String product) {
        if (productsAndStock.containsKey(product)) {
            if (productsAndStock.get(product) > 0) {
                productsAndStock.replace(product, productsAndStock.get(product) - 1);
                return true;
            } else {
                return false;
            }
        }
        return false;
    }

    public Set<String> products() {
        return productsAndStock.keySet();
    }
}
