
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
public class TodoList {

    private ArrayList<String> lista;

    public TodoList() {
        this.lista = new ArrayList<>();
    }

    public void add(String task) {
        lista.add(task);
    }

    public void print() {
        for (int i = 0; i < lista.size(); i++) {
            System.out.println(i + 1 + ": " + lista.get(i));
        }
    }

    public void remove(int number) {
        lista.remove(number - 1);
    }
}
