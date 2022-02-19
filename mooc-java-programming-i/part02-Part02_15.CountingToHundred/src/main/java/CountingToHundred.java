
import java.util.Scanner;

public class CountingToHundred {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numero = (Integer.valueOf(scanner.nextInt()));

        for (int i = numero; i <= 100; i++) {
            System.out.println(i);

        }
    }
}
