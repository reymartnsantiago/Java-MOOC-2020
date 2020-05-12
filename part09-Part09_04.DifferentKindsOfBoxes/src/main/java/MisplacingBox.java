
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
public class MisplacingBox extends Box {

    private HashMap<String, Item> database;

    public MisplacingBox() {
        database = new HashMap<>();
    }

    @Override
    public void add(Item item) {
        database.put(item.getName(), item);
    }

    @Override
    public boolean isInBox(Item item) {
        return false;
    }
}
