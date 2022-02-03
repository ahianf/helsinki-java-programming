
import java.util.Scanner;

public class LastWords {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] array;
        String texto = " ";
        
        while (!texto.equals("")) {
            texto = scanner.nextLine();
            array = texto.split(" ");
            System.out.println(array[array.length - 1]);
        }
    }
}
