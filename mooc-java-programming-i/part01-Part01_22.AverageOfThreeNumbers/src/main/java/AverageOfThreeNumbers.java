
import java.util.Scanner;

public class AverageOfThreeNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Give the first number:");
        int primer = Integer.valueOf(scanner.nextLine());
        System.out.println("Give the second number:");
        int segundo = Integer.valueOf(scanner.nextLine());
                System.out.println("Give the third number:");
        int tercero = Integer.valueOf(scanner.nextLine());
        
        System.out.println("The average is " + ((double) (primer + segundo + tercero) / 3));
    }
}
