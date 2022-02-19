
import java.util.Scanner;

public class SumOfASequenceTheSequel {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("First number? ");
        int primero = (Integer.valueOf(scanner.nextLine()));

        System.out.print("Last number? ");
        int ultimo = (Integer.valueOf(scanner.nextLine()));

        int contador = 0;

        for (int i = ultimo; i >= primero; i--) {
            contador += i;
        }
        System.out.print("The sum is " + contador);
    }
}
