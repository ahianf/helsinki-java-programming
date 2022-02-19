import java.util.Scanner;

public class AreWeThereYet {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numero = 0;
        while (!(numero == 4)) {
            System.out.println("Give a number:");
            numero = Integer.valueOf(scanner.nextLine());

        }

    }
}
