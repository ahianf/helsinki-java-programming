
import java.util.Scanner;

public class GradesAndPoints {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Give points [0-100]:");
        int grado = Integer.valueOf(scan.nextLine());
        if (grado < 0) {
            System.out.println("impossible!");
        } else if (grado <= 49) {
            System.out.println("failed");
        } else if (grado <= 59) {
            System.out.println("1");
        } else if (grado <= 69) {
            System.out.println("2");
        } else if (grado <= 79) {
            System.out.println("3");
        } else if (grado <= 89) {
            System.out.println("4");
        } else if (grado <= 100) {
            System.out.println("5");
        } else if (grado > 100) {
            System.out.println("incredible!");
        }
    }
}
