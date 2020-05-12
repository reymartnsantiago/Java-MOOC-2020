
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
public class IOU {

    private HashMap<String, Double> database;

    public IOU() {
        database = new HashMap<>();
    }

    public void setSum(String toWhom, double amount) {
        database.put(toWhom, amount);
    }

    public double howMuchDoIOweTo(String toWhom) {
        return database.getOrDefault(toWhom, 0.0);
    }

}
