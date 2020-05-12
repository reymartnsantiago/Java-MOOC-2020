
import java.util.ArrayList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Cavitecity
 */
public class Stack {

    ArrayList<String> database;

    public Stack() {
        database = new ArrayList<>();
    }

    public boolean isEmpty() {
        return database.isEmpty();
    }

    public void add(String value) {
        database.add(value);
    }

    public ArrayList<String> values() {
        ArrayList<String> newObj = new ArrayList<>();
        database.forEach((obj) -> {
            newObj.add(obj);
        });
        return newObj;
    }

    public String take() {
        String buffer = "";
        if (database.size() > 0) {
            buffer += database.get(database.size() - 1);
            database.remove(database.size()-1);
            return buffer;
        }
        return null;
    }
}
