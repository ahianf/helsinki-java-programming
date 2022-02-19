
import java.util.Scanner;

public class RepeatingBreakingAndRemembering {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Give numbers:");
        int numero = 0;
        int sumaNumeros = 0;
        int contadorNumeros = 0;
        int pares = 0;
        int impares = 0;
        while (numero != -1) {
            numero = (Integer.valueOf(scanner.nextLine()));

            if (numero == -1) {
                System.out.println("Thx! Bye!");
                System.out.println("Sum: " + sumaNumeros);
                System.out.println("Numbers: " + contadorNumeros);
                System.out.println("Average: " + ((double) sumaNumeros / contadorNumeros));
                System.out.println("Even: " + pares);
                System.out.println("Odd: " + impares);
                break;
            }
            
            contadorNumeros++;
            sumaNumeros += numero;
            switch (numero % 2) {
                case 0:
                    pares++;
                    break;
                case 1:
                    impares++;
                    break;
            }

        }

    }
}
