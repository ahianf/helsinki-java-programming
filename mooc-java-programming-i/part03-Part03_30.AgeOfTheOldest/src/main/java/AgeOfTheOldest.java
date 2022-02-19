
import java.util.Scanner;

public class AgeOfTheOldest {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] array;
        String texto = " ";
        int edad = 0;
        int mayor = 0;

        while (true) {
            texto = scanner.nextLine();
            if (texto.equals("")) {
                break;
            }
            array = texto.split(",");
            edad = Integer.valueOf(array[1]);
            if (edad > mayor) {
                mayor = edad;
            }
        }

        System.out.println("Age of the oldest: " + mayor);
    }
}
