
import java.util.ArrayList;
import java.util.Scanner;

public class NumberOfStrings {

    public static void main(String[] args) {
        ArrayList<String> lista = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            String text = scanner.nextLine();
            if (text.equals("end")) {
                break;
            }
            lista.add(text);
        }
        int count = 0;
        for (String i : lista) {
            count++;
        }
        System.out.println(count);

    }
}
