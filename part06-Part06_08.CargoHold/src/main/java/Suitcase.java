
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
public class Suitcase {

    private int maximumWeight;
    private ArrayList<Item> items;

    public Suitcase(int maximumWeight) {
        items = new ArrayList<>();
        this.maximumWeight = maximumWeight;
    }

    public void addItem(Item item) {
        if (this.maximumWeight >= totalWeight() + item.getWeight()) {
            items.add(item);
        }
    }

    public int getMaximumWeight() {
        return maximumWeight;
    }

    public Item heaviestItem() {
        if(items.isEmpty()){
            return null;
        }
        Item heaviest = items.get(0);
        for (Item item : items) {
            if (heaviest.getWeight() < item.getWeight()) {
                heaviest = item;
            }
        }
        return heaviest;
    }

    public int totalWeight() {
        int total = 0;
        try {
            for (Item item : items) {
                total += item.getWeight();
            }
        } catch (Exception e) {
        }
        return total;
    }

    public void printItems() {
        for (Item item : items) {
            System.out.println(item.toString());
        }
    }

    @Override
    public String toString() {
        if (items.size() == 0) {
            return "no items (" + totalWeight() + " kg)";
        }
        if (items.size() == 1) {
            return this.items.size() + " item (" + totalWeight() + " kg)";
        }
        return this.items.size() + " items (" + totalWeight() + " kg)";
    }
}
