
import java.util.ArrayList;
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
public class StorageFacility {

    HashMap<String, ArrayList<String>> database;

    public StorageFacility() {
        database = new HashMap<>();
    }

    public void add(String unit, String item) {
        if (!database.containsKey(unit)) {
            database.put(unit, new ArrayList<>());
            database.get(unit).add(item);
        } else {
            database.get(unit).add(item);
        }
    }

    public ArrayList<String> contents(String storageUnit) {
        return database.getOrDefault(storageUnit, new ArrayList<>());
    }

    public void remove(String storageUnit, String item) {
        if (database.containsKey(storageUnit)) {
            database.get(storageUnit).remove(item);
        }
    }

    public ArrayList<String> storageUnits() {
        ArrayList<String> test = new ArrayList<>();
        for (String x : database.keySet()) {
            if (!database.get(x).isEmpty()) {
                test.add(x);
            }
        }

        return test;
    }

}
