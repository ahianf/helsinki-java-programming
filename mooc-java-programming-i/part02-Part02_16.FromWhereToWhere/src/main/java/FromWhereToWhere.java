
import java.util.Scanner;

public class FromWhereToWhere {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Where to? ");
        int numeroFinal = (Integer.valueOf(scanner.nextInt()));
        System.out.print("Where from? ");
        int numeroInicial = (Integer.valueOf(scanner.nextInt()));

        for (int i = numeroInicial; i <= numeroFinal; i++) {
            System.out.println(i);

        }
    }
}
