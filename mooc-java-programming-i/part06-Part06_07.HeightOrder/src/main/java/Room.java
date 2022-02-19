
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
public class Room {

    private ArrayList<Person> lista;

    public Room() {
        this.lista = new ArrayList<>();
    }

    public void add(Person person) {
        lista.add(person);
    }

    public boolean isEmpty() {
        return lista.isEmpty();
    }

    public ArrayList<Person> getPersons() {
        return lista;
    }

    public Person shortest() {
        if (lista.isEmpty()) {
            return null;
        }
        Person personaCorta = lista.get(0);

        for (Person i : lista) {
            if (i.getHeight() < personaCorta.getHeight()) {
                personaCorta = i;
            }
        }
        return personaCorta;
    }

    public Person take() {
        Person temp = shortest();
        lista.remove(shortest());
        return temp;
    }

}
