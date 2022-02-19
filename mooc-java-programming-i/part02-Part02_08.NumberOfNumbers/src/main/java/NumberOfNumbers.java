
import java.util.Scanner;

public class NumberOfNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numero = 1;
        int contador = -1;
        while (numero != 0) {
            System.out.println("Give a number:");
            numero = (Integer.valueOf(scanner.nextInt()));
            contador = 1 + contador;

        }
        System.out.println("Number of numbers: " + contador);

    }
}
