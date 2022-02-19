
import java.util.Scanner;

public class OddOrEven {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Give a number:");
        int numero = Integer.valueOf(scan.nextLine());
        if (numero % 2 == 0) {
            System.out.println("Number " + numero + "is even.");
        } else {
            System.out.println("Number " + numero + "is odd.");
        }

    }
}
