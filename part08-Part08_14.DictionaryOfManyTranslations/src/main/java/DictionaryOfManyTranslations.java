
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
public class DictionaryOfManyTranslations {

    private HashMap<String, ArrayList<String>> database;

    public DictionaryOfManyTranslations() {
        this.database = new HashMap<>();
    }

    public void add(String word, String translation) {
        if (!database.containsKey(word)) {
            database.put(word, new ArrayList<>());
            database.get(word).add(translation);
        } else {
            database.get(word).add(translation);
        }
    }

    public ArrayList<String> translate(String word) {

        return database.getOrDefault(word, new ArrayList<>());
    }

    public void remove(String word) {
        if (database.containsKey(word)) {
            database.remove(word);
        }
    }
}
