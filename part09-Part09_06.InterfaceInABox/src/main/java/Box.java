
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
public class Box implements Packable {

    private final double maxCapacity;
    private final ArrayList<Packable> array;

    public Box(double maxCapacity) {
        array = new ArrayList<>();
        this.maxCapacity = maxCapacity;
    }

    public void add(Packable obj) {
        if (weight() + obj.weight() <= maxCapacity) {
            array.add(obj);
        }
    }

    public double weight() {
        double total = 0;
        for (Packable obj : array) {
            total += obj.weight();
        }
        return total;
    }

    @Override
    public String toString() {
        return "Box: " + array.size() + " items, total weight " + weight() + " kg";
    }

}
