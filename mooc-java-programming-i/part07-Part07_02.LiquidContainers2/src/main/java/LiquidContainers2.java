
import java.util.Scanner;

public class LiquidContainers2 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        Container first = new Container();
        Container second = new Container();

        while (true) {
            System.out.println("First: " + first.toString());
            System.out.println("Second: " + second.toString());

            String input = scan.nextLine();
            if (input.startsWith("quit")) {
                break;
            }
            String[] parts = input.split(" ");
            int value = Integer.valueOf(parts[1]);

            if (input.startsWith("add")) {
                first.add(value);
            } else if (input.startsWith("move")) {
                if (value > first.contains()) {
                    second.add(first.contains());
                    first.remove(first.contains());
                } else {
                    first.remove(value);
                    second.add(value);
                }
            } else if (input.startsWith("remove")) {
                second.remove(value);
            }
        }
    }
}
