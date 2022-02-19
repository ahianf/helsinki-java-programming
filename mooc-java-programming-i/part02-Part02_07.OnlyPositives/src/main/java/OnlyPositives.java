
import java.util.Scanner;

public class OnlyPositives {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numero;
        while (true) {
            System.out.println("Give a number");
            numero = (Integer.valueOf(scanner.nextInt()));
            if (numero <= -1) {
                System.out.println("Unsuitable number");

            } else if (numero == 0) {
                break;
            } else if (numero > 0) {
                System.out.println(numero * numero);
            }

        }

    }
}
