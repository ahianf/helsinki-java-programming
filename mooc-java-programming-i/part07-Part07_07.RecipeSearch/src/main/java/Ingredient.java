
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
public class Ingredient {

    public ArrayList<String> getLista() {
        return lista;
    }

    private ArrayList<String> lista;

    public Ingredient() {
        this.lista = new ArrayList<String>();
    }

    public void add(String ingrediente) {
        lista.add(ingrediente);
    }

    public void listar() {
        for (String i : lista) {
            System.out.println(i);
        }
    }

}
