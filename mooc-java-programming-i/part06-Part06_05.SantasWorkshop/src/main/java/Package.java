
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
public class Package {

    private ArrayList<Gift> lista;

    public Package() {
        this.lista = new ArrayList<>();
    }

    public void addGift(Gift gift) {
        lista.add(gift);
    }

    public int totalWeight() {
        int contador = 0;
        for (Gift i : lista) {
            contador = contador + i.getWeight();
        }
        return contador;
    }

}
