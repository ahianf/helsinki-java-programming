
import java.util.Scanner;

public class LineByLine {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] array;
        String texto = " ";
        
        while (!texto.equals("")) {
            texto = scanner.nextLine();
            array = texto.split(" ");
            for (String i : array) {
                System.out.println(i);
            }
        }
    }
}
