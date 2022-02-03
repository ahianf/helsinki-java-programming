
import java.util.ArrayList;
import java.util.Scanner;

public class ThirdElement {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ArrayList<String> frases = new ArrayList<>();
        while (true) {
            String palabra = scanner.nextLine();
            if (palabra.isBlank()){
                break;
            }
            frases.add(palabra);
        }
        System.out.println(frases.get(2));
    }
}