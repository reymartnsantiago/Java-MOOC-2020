
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
public class Herd implements Movable {

    private List<Movable> arr;

    public Herd() {
        arr = new ArrayList<>();
    }

    public void addToHerd(Movable movable) {
        arr.add(movable);
    }

    @Override
    public String toString() {
        String buffer = "";
        for (Movable m : arr) {
            buffer += m.toString() + "\n";
        }
        return buffer; //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void move(int dx, int dy) {
        for(Movable m: arr){
            m.move(dx, dy);
        }
    }

}
