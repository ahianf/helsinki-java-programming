
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Points puntos = new Points();
        
        UserInterface ui = new UserInterface(scanner, puntos);

        ui.start();
    }
}
