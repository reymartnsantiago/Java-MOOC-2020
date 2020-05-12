
import java.util.ArrayList;
import java.util.List;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Cavitecity
 */
public class Hold {

    private int maximumWeight;
    private List<Suitcase> database;

    public Hold(int maximumWeight) {
        this.maximumWeight = maximumWeight;
        database = new ArrayList<Suitcase>();
    }

    public void addSuitcase(Suitcase suitcase) {
        if (maximumWeight >= (suitcase.getMaximumWeight() + totalWeight())) {
            database.add(suitcase);
        }
    }

    public void printItems() {
        for (Suitcase obj : database) {
            obj.printItems();
        }
    }

    public int totalWeight() {
        int total = 0;
        for (Suitcase obj : database) {
            total += obj.totalWeight();
        }
        return total;
    }

    @Override
    public String toString() {
        return this.database.size() + " suitcases" + "(" + totalWeight() + " kg)";
        //To change body of generated methods, choose Tools | Templates.
    }

}
