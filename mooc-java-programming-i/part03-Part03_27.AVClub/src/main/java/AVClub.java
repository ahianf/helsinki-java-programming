
import java.util.Scanner;

public class AVClub {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] array;
        String texto = " ";
        
        while (!texto.equals("")) {
            texto = scanner.nextLine();
            array = texto.split(" ");
            for (String i : array) {
                if (i.contains("av")){
                    System.out.println(i);
                }
            }
        }
    }
}
