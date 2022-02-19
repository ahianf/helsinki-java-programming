
import java.util.Scanner;

public class Same {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the first string:");
        String primera = String.valueOf(scan.nextLine());
        System.out.println("Enter the second string:");
        String segunda = String.valueOf(scan.nextLine());
        if (primera.equals(segunda)) {
            System.out.println("Same");
        } else {
            System.out.println("Different");
        }
    }
}
