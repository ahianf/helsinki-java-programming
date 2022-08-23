
import java.util.Scanner;

public class LiquidContainers {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int container1 = 0;
        int container2 = 0;
        final int CONTAINER_SIZE = 100;
        boolean stopLoop = false;
        while (!stopLoop) {
            System.out.println("First: " + container1 + "/" + CONTAINER_SIZE);
            System.out.println("Second: " + container2 + "/" + CONTAINER_SIZE);

            String input = scan.nextLine();
            if (input.equals("quit")) {
                break;
            }

            String[] parts = input.split(" ");

            String command = parts[0];
            int amount = Integer.parseInt(parts[1]);
            if (amount <= 0) {
                continue;
            }

            switch (command) {
                case "add":
                    container1 = amount + container1;
                    if (container1 > CONTAINER_SIZE) {
                        container1 = CONTAINER_SIZE;
                    }
                    break;
                case "move":
                    if (amount > container1) {
                        container2 = container2 + container1;
                        container1 = 0;
                    } else {
                        container1 = container1 - amount;
                        container2 = container2 + amount;
                    }

                    if (container2 > CONTAINER_SIZE) {
                        container2 = CONTAINER_SIZE;
                    }
                    break;
                case "remove":
                    container2 = container2 - amount;
                    if (container2 < 0) {
                        container2 = 0;
                    }

            }
            System.out.print("\n");

        }
    }

}
