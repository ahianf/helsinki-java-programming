
import java.util.Scanner;

public class AverageOfNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numero = 1;
        int contador = -1;
        int suma = 0;
        while (numero != 0) {
            System.out.println("Give a number:");
            numero = (Integer.valueOf(scanner.nextInt()));
            contador = 1 + contador;
            suma = numero + suma;
        }
        double promedio = (double) suma / contador;
        System.out.println("Average of the numbers: " + promedio);

    }
}
