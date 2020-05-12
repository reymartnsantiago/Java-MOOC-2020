
import java.util.HashMap;
import java.util.Map;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Cavitecity
 */
public class ShoppingCart {

    private Map<String, Item> map;

    public ShoppingCart() {
        map = new HashMap<>();
    }

    public void add(String product, int price) {
        if (!map.containsKey(product)) {
            map.put(product, new Item(product, 1, price));
        }else{
            map.get(product).increaseQuantity();
        }

    }

    public int price() {
        int total = 0;
        for (Item i : map.values()) {
            total += i.price();
        }
        return total;
    }

    public void print() {
        for (Item i : map.values()) {
            System.out.println(i.toString());
        }
    }
}
