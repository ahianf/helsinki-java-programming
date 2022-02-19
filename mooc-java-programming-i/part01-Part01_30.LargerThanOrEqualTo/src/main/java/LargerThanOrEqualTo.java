
import java.util.Scanner;

public class LargerThanOrEqualTo {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Give the first number:");
        int primer = Integer.valueOf(scan.nextLine());
        System.out.println("Give the second number:");
        int segundo = Integer.valueOf(scan.nextLine());
        if (primer > segundo) {
            System.out.println("Greater number is: " + primer);
        } else if (segundo > primer) {
            System.out.println("Greater number is: " + segundo);
        } else if (primer == segundo) {
            System.out.println("The numbers are equal!");
        }

    }
}
