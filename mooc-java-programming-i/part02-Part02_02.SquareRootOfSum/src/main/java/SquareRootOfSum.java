
import java.util.Scanner;

public class SquareRootOfSum {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int primera = Integer.valueOf(scan.nextLine());
        int segunda = Integer.valueOf(scan.nextLine());
        int resultado = (int)(Math.sqrt(primera + segunda));
        System.out.println(resultado);

    }
}

