
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
        String prueba = "";
        if (elements.size() == 0) {
            return "The collection " + this.name + " is empty.";
        } else if (elements.size() == 1) {
            prueba = "The collection " + this.name + " has 1 element:";
            prueba = prueba + "\n" + elements.get(0);
            return prueba;
        } else {
            for (String i : elements) {
                prueba = prueba + i + "\n";
            }
            return "The collection " + this.name + " has " + elements.size() + " elements:" + "\n" + prueba;
        }

    }

}
