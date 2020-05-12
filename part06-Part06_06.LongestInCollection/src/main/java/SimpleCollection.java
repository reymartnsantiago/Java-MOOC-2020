
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

    public String longest() {
        if (elements.isEmpty()) {
            return null;
        }
        int firstLength = elements.get(0).length();
        String text = "";
        for (int i = 1; i <= elements.size()-1; i++) {
            if (firstLength < elements.get(i).length()) {
                firstLength = elements.get(i).length();
                text = elements.get(i);
            }
        }
        return text;
    }

}
