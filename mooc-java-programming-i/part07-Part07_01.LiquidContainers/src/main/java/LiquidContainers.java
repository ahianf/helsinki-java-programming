
import java.util.Scanner;

public class LiquidContainers {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int first = 0;
        int second = 0;

        while (true) {
            System.out.print("> ");
            System.out.println("First: " + first + "/100");
            System.out.println("Second: " + second + "/100");
            String input = scan.nextLine();
            String[] parts = input.split(" ");

            if (input.startsWith("add")) {
                if (Integer.valueOf(parts[1]) < 0) {
                } else if (first + Integer.valueOf(parts[1]) > 100) {
                    first = 100;
                } else {
                    first = first + Integer.valueOf(parts[1]);
                }

            } else if (input.startsWith("move")) {
                if (Integer.valueOf(parts[1]) > first) {
                    second = second + first;
                    first = 0;
                    if (second > 100) {
                        second = 100;
                    }
                } else if (Integer.valueOf(parts[1]) < 0) {
                } else {
                    first = first - Integer.valueOf(parts[1]);
                    second = second + Integer.valueOf(parts[1]);
                    if (second > 100) {
                        second = 100;
                    }
                }
            } else if (input.startsWith("remove")) {
                if (second - Integer.valueOf(parts[1]) < 0) {
                    second = 0;
                } else if (Integer.valueOf(parts[1]) < 0) {
                } else {
                    second = second - Integer.valueOf(parts[1]);
                }

            } else if (input.contains("quit")) {
                break;
            }
        }
    }
}
