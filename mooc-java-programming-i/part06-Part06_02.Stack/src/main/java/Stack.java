
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
public class Stack {

    private ArrayList<String> lista;

    public Stack() {
        this.lista = new ArrayList<>();
    }

    public boolean isEmpty() {
        return lista.isEmpty();
    }

    public void add(String value) {
        this.lista.add(value);
    }

    public ArrayList<String> values() {
        return lista;
    }

    public String take() {
        String valor = lista.get(lista.size() - 1);
        lista.remove(lista.size() - 1);
        return valor;

    }

}
