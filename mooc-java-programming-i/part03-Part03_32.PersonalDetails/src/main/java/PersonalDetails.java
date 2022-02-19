
import java.util.ArrayList;
import java.util.Scanner;

public class PersonalDetails {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] array;
        String texto = " ";
        int edad = 0;
        int contador = 0;
        String nombreMayor = "";

        while (true) {
            texto = scanner.nextLine();
            if (texto.equals("")) {
                break;
            }
            array = texto.split(",");
            edad = edad + Integer.valueOf(array[1]);
            if (array[0].length() > nombreMayor.length()) {
                nombreMayor = array[0];
            }
            contador++;
        }

        System.out.println("Longest name: " + nombreMayor);
        System.out.println("Average of the birth years: " + (double)edad / contador);
    }
}
