
import java.util.Scanner;

public class LiquidContainers2 {
    
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        Container container1 = new Container();
        Container container2 = new Container();
        boolean stopLoop = false;
        
        while (!stopLoop) {
            System.out.println("First: " + container1.toString());
            System.out.println("Second: " + container2.toString());
            
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
                    container1.add(amount);
                    break;
                case "move":
                    if (amount > container1.contains()) {
                        container2.add(container1.contains());
                        container1.remove(container1.contains());
                    } else {
                        container1.remove(amount);
                        container2.add(amount);
                    }
                    break;
                case "remove":
                    container2.remove(amount);
                    break;
                
            }
            System.out.print("\n");
            
        }
    }
}
