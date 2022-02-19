
import java.util.Scanner;

public class CarryOn {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String texto = "yes";
        while (!texto.equals("no")){
            System.out.println("Shall we carry on?");
            texto = scanner.nextLine();
        
        }
    

    }
}



