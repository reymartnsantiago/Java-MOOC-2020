
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
public class Abbreviations {

    private HashMap<String, String> database;

    public Abbreviations() {
        database = new HashMap<String, String>();
    }

    public void addAbbreviation(String abbreviation, String explanation) {
        database.put(abbreviation, explanation);
    }

    public boolean hasAbbreviation(String abbreviation) {
        return database.containsKey(abbreviation);
    }

    public String findExplanationFor(String abbreviation) {
        return database.get(abbreviation);
    }
}
