
import java.util.Scanner;

public class LeapYear {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Give a year: ");
        int numero = Integer.valueOf(scan.nextLine());
        if (numero % 4 == 0 && numero % 100 == 0 && numero % 400 == 0) {
            System.out.print("The year is a leap year.");
        } else if (numero % 4 == 0 && numero % 100 == 0) {
            System.out.print("The year is not a leap year.");
        } else if (numero % 4 == 0) {
            System.out.print("The year is a leap year.");
        } else {
            System.out.print("The year is not a leap year.");
        }
    }
}
