
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
public class Hold {

    private int max;
    private ArrayList<Suitcase> paquete;

    public Hold(int max) {
        this.max = max;
        this.paquete = new ArrayList<>();
    }

    public void addSuitcase(Suitcase suitcase) {
        if (suitcase.totalWeight() + this.pesoPaquete() <= max) {
            paquete.add(suitcase);
        }
    }

    public String toString() {
        return paquete.size() + " suitcases (" + this.pesoPaquete() + " kg)";
    }

    public int pesoPaquete() {
        int peso = 0;
        for (Suitcase i : paquete) {
            peso = peso + i.totalWeight();
        }
        return peso;

    }

    public void printItems() {
        for (Suitcase i : paquete) {
            i.printItems();
        }

    }

}
