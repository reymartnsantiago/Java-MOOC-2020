
import java.util.ArrayList;
import java.util.Collections;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Cavitecity
 */
public class ChangeHistory {

    private ArrayList<Double> history;

    public ChangeHistory() {
        history = new ArrayList<>();
    }

    public void add(double status) {
        history.add(status);
    }

    public void clear() {
        history.clear();
    }

    @Override
    public String toString() {
        return history.toString();
    }

    public double maxValue() {
        if (!history.isEmpty()) {
            return Collections.max(history);
        }
        return 0;
    }

    public double minValue() {
        if (!history.isEmpty()) {
            return Collections.min(history);
        }
        return 0;
    }

    public double average() {
        int total = 0;
        int average = 0;
        if (!history.isEmpty()) {
            for (Double x : history) {
                total += x;
                average = total / history.size();
            }
            return average;

        }
        return 0;
    }
}
