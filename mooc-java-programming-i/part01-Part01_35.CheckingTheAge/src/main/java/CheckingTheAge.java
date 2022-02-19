
import java.util.Scanner;

public class CheckingTheAge {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("How old are you?");
        int numero = Integer.valueOf(scan.nextLine());
        if (numero >= 0 && numero <= 120) {

            System.out.println("OK");
        } else {
            System.out.println("Impossible!");
        }

    }
}
