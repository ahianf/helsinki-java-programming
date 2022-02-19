
import java.util.Scanner;

public class NumberOfNegativeNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numero = 1;
        int contador = 0;
        while (numero != 0) {
            System.out.println("Give a number:");
            numero = (Integer.valueOf(scanner.nextInt()));
            if (numero < 0) {
                contador = 1 + contador;
            }

        }
        System.out.println("Number of negative numbers: " + contador);

    }
}
