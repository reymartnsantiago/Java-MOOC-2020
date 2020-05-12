
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
public class Package {

    private ArrayList<Gift> database;

    public Package() {
        database = new ArrayList<>();
    }

    public void addGift(Gift gift) {
        database.add(gift);
    }

    public int totalWeight() {
        int total=0;
     return  database.stream().map((obj) -> obj.getWeight()).reduce(total, Integer::sum);
    }
}
