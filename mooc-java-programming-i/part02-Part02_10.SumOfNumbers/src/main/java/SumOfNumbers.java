
import java.util.Scanner;

public class SumOfNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numero = 1;
        int suma = 0;
        int contador = -1;
        while (numero != 0) {
            System.out.println("Give a number:");
            numero = (Integer.valueOf(scanner.nextInt()));
            contador = contador + 1;
            suma = numero + suma;
        }
        System.out.println("Number of numbers: " + contador);
        System.out.println("Sum of the numbers: " + suma);
    }
}
