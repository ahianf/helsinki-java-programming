
import java.util.Scanner;

public class Factorial {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Give a number: ");
        int numero = (Integer.valueOf(scanner.nextInt()));
        int contador = 1;

        for (int i = numero; i > 0; i--) {
            contador *= i;
        }
        System.out.print("Factorial: " + contador);
    }
}
