
import java.util.HashMap;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Cavitecity
 */
public class BoxWithMaxWeight extends Box {

    private int capacity;
    private HashMap<String, Item> database;

    public BoxWithMaxWeight(int capacity) {
        this.capacity = capacity;
        database = new HashMap<>();
    }

    public int totalWeight() {
        int total = 0;
        for (Item x : database.values()) {
            total += x.getWeight();
        }
        return total;
    }

    @Override
    public void add(Item item) {
        if (item.getWeight() + totalWeight() <= capacity) {
            database.put(item.getName(), item);
        }
    }

    @Override
    public boolean isInBox(Item item) {
        for (Item x : database.values()) {
            if (item.getName().equals(x.getName())) {
                return true;
            }
        }
        return false;
    }

}
