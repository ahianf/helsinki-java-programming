
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
public class Bird {

    private ArrayList<String> lista;
    private int observation;
    private String name;
    private String latinName;

    public Bird() {
        this.lista = new ArrayList<String>();
        this.observation = 0;
    }

    public int getObservation() {
        return observation;
    }

    public void setObservation() {
        observation++;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLatinName() {
        return latinName;
    }

    public void setLatinName(String latinName) {
        this.latinName = latinName;
    }

    public String toString() {
        return this.name + " (" + this.latinName + "): " + this.observation + " obervations";
    }

}
