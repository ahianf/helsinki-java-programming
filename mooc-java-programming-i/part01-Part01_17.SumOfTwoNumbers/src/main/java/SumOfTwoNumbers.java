
import java.util.Scanner;

public class SumOfTwoNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Give the first number:");
        int primer = Integer.valueOf(scanner.nextLine());
        System.out.println("Give the second number:");
        int segundo = Integer.valueOf(scanner.nextLine());
        
        System.out.println("The sum of the numbers is " + (primer + segundo));

    }
}
