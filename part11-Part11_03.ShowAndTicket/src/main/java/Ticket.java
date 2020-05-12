
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
public class Ticket {

    private int seat;
    private int code;
    private Show show;
    private ArrayList<Show> arr;

    public void add(Show show) {
        arr.add(show);
    }
}
