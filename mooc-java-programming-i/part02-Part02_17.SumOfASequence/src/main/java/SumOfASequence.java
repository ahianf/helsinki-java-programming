
import java.util.Scanner;

public class SumOfASequence {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Last number? ");
        int numero = (Integer.valueOf(scanner.nextInt()));
        int contador = 0;

        for (int i = numero; i >= 0; i--) {
            contador += i;
        }
        System.out.println("The sum is " + contador);
    }
}
