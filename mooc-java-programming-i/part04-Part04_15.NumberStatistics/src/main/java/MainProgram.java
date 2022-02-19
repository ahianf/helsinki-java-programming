
import java.util.Scanner;

public class MainProgram {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Statistics statisticsAll = new Statistics();
        Statistics statisticsEven = new Statistics();
        Statistics statisticsOdd = new Statistics();

        System.out.println("Enter numbers:");
        while (true) {
            int input = Integer.valueOf(scanner.nextLine());
            if (input == -1) {
                break;
            } else if (input % 2 == 1) {
                statisticsOdd.addNumber(input);
                statisticsAll.addNumber(input);
            } else if (input % 2 == 0) {
                statisticsEven.addNumber(input);
                statisticsAll.addNumber(input);
            }
        }
        System.out.println("Sum: " + statisticsAll.sum());
        System.out.println("Sum of even numbers: " + statisticsEven.sum());
        System.out.println("Sum of odd numbers: " + statisticsOdd.sum());

    }
}
