
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;

public class SportStatistics {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("File:");
        String file = scanner.nextLine();

        System.out.println("Team:");
        String team = scanner.nextLine();

        int contadorJuegos = 0;
        int contadorGanados = 0;
        int contadorPerdidos = 0;

        try (Scanner fileScanner = new Scanner(Paths.get(file))) {
            while (fileScanner.hasNextLine()) {
                String linea = fileScanner.nextLine();
                String[] dividido = linea.split(",");
                if (dividido[0].equals(team)) {
                    contadorJuegos++;
                    if (Integer.valueOf(dividido[2]) > Integer.valueOf(dividido[3])) {
                        contadorGanados++;
                    } else {
                        contadorPerdidos++;
                    }
                }
                if (dividido[1].equals(team)) {
                    contadorJuegos++;
                    if (Integer.valueOf(dividido[2]) < Integer.valueOf(dividido[3])) {
                        contadorGanados++;
                    } else {
                        contadorPerdidos++;
                    }
                }

            }
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
        System.out.println("Games: " + contadorJuegos);
        System.out.println("Wins: " + contadorGanados);
        System.out.println("Losses: " + contadorPerdidos);

    }

}
