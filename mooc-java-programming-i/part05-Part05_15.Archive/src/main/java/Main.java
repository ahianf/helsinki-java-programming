
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ArrayList<Archive> listaArticulos = new ArrayList<>();

        while (true) {
            System.out.println("Identifier? (empty will stop)");
            String identifier = scanner.nextLine();
            if (identifier.isEmpty()) {
                break;
            }

            System.out.println("Name? (empty will stop)");
            String name = scanner.nextLine();
            if (name.isEmpty()) {
                break;
            }

            Archive nuevoArticulo = new Archive(identifier, name);
            System.out.println(listaArticulos.contains(nuevoArticulo));

            if (!listaArticulos.contains(nuevoArticulo)) {
                listaArticulos.add(nuevoArticulo);
            }
        }
        System.out.println("==Items==");
        for (Archive i : listaArticulos) {
            System.out.println(i);
        }

    }
}
