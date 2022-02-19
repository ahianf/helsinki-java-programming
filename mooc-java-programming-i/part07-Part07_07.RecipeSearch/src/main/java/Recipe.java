
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author ahian
 */
public class Recipe {

    private ArrayList<String> lista;
    private String nombre;
    private int tiempo;
    private Ingredient ingrediente;

    public Recipe(String nombre, int tiempo, Ingredient ingrediente) {
        this.lista = new ArrayList<String>();
        this.nombre = nombre;
        this.tiempo = tiempo;
        this.ingrediente = ingrediente;
    }

    public Recipe() {
        this.lista = new ArrayList<String>();
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getTiempo() {
        return tiempo;
    }

    public void setTiempo(int tiempo) {
        this.tiempo = tiempo;
    }

    public Ingredient getIngrediente() {
        return ingrediente;
    }

    public void setIngrediente(Ingredient ingrediente) {
        this.ingrediente = ingrediente;
    }

    public String toString() {
        return this.nombre + ", cooking time: " + this.tiempo;
    }

}
