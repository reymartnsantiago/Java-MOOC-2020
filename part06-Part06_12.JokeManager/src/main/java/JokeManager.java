
import java.util.ArrayList;
import java.util.Random;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Cavitecity
 */
public class JokeManager {

    private ArrayList<String> database;

    public JokeManager() {
        database = new ArrayList<>();
    }

    public void addJoke(String joke) {
        database.add(joke);
    }

    public void printJokes() {
        for (String x : database) {
            System.out.println(x);
        }
    }

    public String drawJoke() {

        Random r = new Random();

        if (database.isEmpty()) {
            return "Jokes are in short supply.";
        }
        if(database.size()==1){
             return database.get(0);
        }

        return database.get(r.nextInt(database.size()));
    }
}
