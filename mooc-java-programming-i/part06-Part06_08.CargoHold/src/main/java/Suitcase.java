
import java.util.ArrayList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author ahian
 */
public class Suitcase {

    private int max;
    private ArrayList<Item> items;

    public Suitcase(int max) {
        this.max = max;
        this.items = new ArrayList<>();
    }

    public void addItem(Item item) {
        if (item.getWeight() + totalWeight() <= max) {
            items.add(item);
        }
    }

    public void printItems() {
        for (Item i : this.items) {
            System.out.println(i.toString());
        }
    }

    public int totalWeight() {
        int peso = 0;
        for (Item i : this.items) {
            peso = peso + i.getWeight();
        }
        return peso;
    }

    public Item heaviestItem() {
        Item heaviest;
        if (items.isEmpty()) {
            return null;
        } else {
            heaviest = items.get(0);
            for (Item i : items) {
                if (heaviest.getWeight() < i.getWeight()) {
                    heaviest = i;
                }
            }
        }
        return heaviest;
    }

    public String toString() {
        switch (items.size()) {
            case 0:
                return "no items (" + totalWeight() + " kg)";
            case 1:
                return "1 item (" + totalWeight() + " kg)";
            default:
                return items.size() + " items (" + totalWeight() + " kg)";
        }
    }
}
