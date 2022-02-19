
import java.util.Scanner;

public class AbsoluteValue {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numero = Integer.valueOf(scanner.nextLine());
        
        if (numero < 0){
            System.out.println(numero * -1);
        
        } else {
            System.out.println(numero);
        }

    }
}
