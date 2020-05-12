
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
public class TodoList {

    private ArrayList<String> database;

    public TodoList() {
        database = new ArrayList<>();
    }

    public void add(String task) {
        database.add(task);
    }

    public void print() {
       int counter = 0;
        for (String string : this.database) {
            counter++;
            System.out.println(counter + ": " + string);
        }
    }

    public void remove(int number) {
        database.remove(number - 1);
    }

}
