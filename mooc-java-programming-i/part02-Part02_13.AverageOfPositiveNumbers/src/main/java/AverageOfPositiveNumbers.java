
import java.util.Scanner;

public class AverageOfPositiveNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numero = 1;
        int contador = 0;
        int suma = 0;
        while (numero != 0) {
            numero = (Integer.valueOf(scanner.nextInt()));
            if (numero > 0) {
                contador = 1 + contador;
                suma = numero + suma;
            }

        }
        if (contador == 0 && suma == 0) {
            System.out.println("Cannot calculate the average");
        } else {

            double promedio = (double) suma / contador;
            System.out.println(promedio);
        }

    }

}
