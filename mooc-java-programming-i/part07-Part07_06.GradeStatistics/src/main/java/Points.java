
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
public class Points {

    private ArrayList<Integer> lista;

    public Points() {
        this.lista = new ArrayList<Integer>();
    }

    public void add(int punto) {
        if (punto >= 0 && punto <= 100) {
            lista.add(punto);
        }
    }

    public void add(String punto) {
        this.add(Integer.valueOf(punto));
    }

    public double promedio() {
        int contador = 0;
        for (int i : lista) {
            contador = contador + i;
        }
        return (double) contador / lista.size();
    }

    public String promedioPassing() {
        int total = 0;
        int contador = 0;
        for (int i : lista) {
            if (i >= 50) {
                total = total + i;
                contador++;
            }
        }
        if (contador == 0) {
            return "-";
        } else {
            return String.valueOf((double) total / contador);
        }
    }

    public int passing() {
        int contador = 0;
        for (int i : lista) {
            if (i >= 50) {
                contador++;
            }
        }
        return contador;
    }

    public double porcentaje() {
        return ((double) 100 * passing()) / lista.size();
    }

    public void distribucion() {
        int[] array = new int[6];
        for (int i : lista) {
            if (i < 50) {
                array[0]++;
            } else if (i < 60) {
                array[1]++;
            } else if (i < 70) {
                array[2]++;
            } else if (i < 80) {
                array[3]++;
            } else if (i < 90) {
                array[4]++;
            } else if (i >= 90) {
                array[5]++;
            }
        }
        System.out.println("Grade distribution:");
        for (int i = array.length - 1; i >= 0; i--) {
            System.out.print(i + ": ");
            for (int j = array[i]; j > 0; j--) {
                System.out.print("*");
            }
            System.out.println("");
        }

    }

}
