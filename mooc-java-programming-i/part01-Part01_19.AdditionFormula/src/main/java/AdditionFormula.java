
import java.util.Scanner;

public class AdditionFormula {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Give the first number:");
        int primer = Integer.valueOf(scanner.nextLine());
        System.out.println("Give the second number:");
        int segundo = Integer.valueOf(scanner.nextLine());
        
        System.out.println(String.valueOf(primer) + " + " + String.valueOf(segundo) + " = " + (primer + segundo));

    }
}
