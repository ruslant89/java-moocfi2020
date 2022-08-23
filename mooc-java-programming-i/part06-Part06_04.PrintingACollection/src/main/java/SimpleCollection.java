
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

        if (this.elements.isEmpty()) {
            return "The collection " + this.name + " is empty.";
        }

        String plural = " element:";
        String lineBreak = "";

        if (this.elements.size() > 1) {
            plural = " elements:";
            lineBreak = "\n";
        }

        String response = "The collection " + this.name + " has " + this.elements.size() + plural;
        String collection = "";
        for (String element : getElements()) {
            collection = collection + element + lineBreak;
        }
        return response + "\n" + collection;
    }
}
