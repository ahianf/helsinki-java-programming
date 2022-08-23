
import java.util.Scanner;

public class AverageOfPositiveNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int contador = 0;
        int total = 0;

        while (true) {
            int numero = Integer.parseInt(scanner.nextLine());
            if (numero == 0 && contador == 0) {
                System.out.println("Cannot calculate the average");
                break;
            } else if (numero == 0) {
                break;
            } else {
                if (numero > 0) {
                    total = numero + total;
                    contador++;
                }
            }
        }

        System.out.println((total * 1.0) / contador);
    }
}
