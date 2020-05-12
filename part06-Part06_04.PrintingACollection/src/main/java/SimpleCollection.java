
import java.util.ArrayList;

public class SimpleCollection {

    private String name;
    private ArrayList<String> elements;

    public SimpleCollection(String name) {
        this.name = name;
        this.elements = new ArrayList<>();
    }

    public void add(String element) {
        this.elements.add(element);
    }

    public ArrayList<String> getElements() {
        return this.elements;
    }

    public String toString() {
        String buffer = "";
        int counter = 0;
        if (elements.isEmpty()) {
            return "The collection " + this.name + " is empty.";
        } else {
            if (elements.size() == 1) {
                counter++;
                buffer += elements.get(0);
            } else {
                for (String x : elements) {
                    counter++;
                    buffer += x;
                    buffer += "\n";
                }
            }
        }
        return counter > 1 ? "The collection " + this.name + " has " + counter + " elements:" + "\n" + buffer
                : "The collection " + this.name + " has " + counter + " element:" + "\n" + buffer;
    }
}
