
import java.util.Scanner;

public class Cubes {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            String entrada = scanner.nextLine();
            if (entrada.equals("end")) {
                break;
            }
            int valor = Integer.valueOf(entrada);
            System.out.println(valor * valor * valor);
        }
    }
}
