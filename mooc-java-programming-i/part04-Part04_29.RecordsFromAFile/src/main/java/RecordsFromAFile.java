
import java.nio.file.Paths;
import java.util.Scanner;

public class RecordsFromAFile {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Name of the file: ");
        String file = scanner.nextLine();

        try (Scanner fileScanner = new Scanner(Paths.get(file))) {
            while (fileScanner.hasNextLine()) {
                String linea = fileScanner.nextLine();
                String[] dividido = linea.split(",");
                if (dividido[1].equals("1")) {
                    System.out.println(dividido[0] + ", age: " + dividido[1] + " year");
                } else {
                    System.out.println(dividido[0] + ", age: " + dividido[1] + " years");
                }

            }
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }

    }

}
