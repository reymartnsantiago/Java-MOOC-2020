
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
public class OneItemBox extends Box {

    private int capacity;
    private HashMap<String, Item> database;

    public OneItemBox() {
        this.capacity = 1;
        database = new HashMap<>();
    }

    @Override
    public void add(Item item) {
        if (database.isEmpty()) {
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
