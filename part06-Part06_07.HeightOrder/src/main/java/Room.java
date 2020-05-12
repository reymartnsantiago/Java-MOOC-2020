
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
public class Room {

    private ArrayList<Person> database;

    public Room() {
        database = new ArrayList<>();
    }

    public void add(Person person) {
        database.add(person);
    }

    public boolean isEmpty() {
        return database.isEmpty();
    }

    public ArrayList<Person> getPersons() {
        return database;
    }

    public Person shortest() {

        if (database.isEmpty()) {
            return null;
        }
        Person shortest = database.get(0);
        for (int i = 1; i <= database.size() - 1; i++) {
            if (shortest.getHeight() > database.get(i).getHeight()) {
                shortest = database.get(i);
            }
        }
        return shortest;
    }

    public Person take() {
        if (database.isEmpty()) {
            return null;
        }
        Person copy = shortest();
        database.remove(shortest());
        return copy;
    }
}
