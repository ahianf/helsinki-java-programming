
import java.util.Scanner;

public class DifferentTypesOfInput {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Give a string:");
        String cadena = scan.nextLine();
        System.out.println("Give an integer:");
        int entero = Integer.valueOf(scan.nextLine());
        System.out.println("Give a double:");
        Double doble = Double.valueOf(scan.nextLine());
        System.out.println("Give a boolean:");
        Boolean booleano = Boolean.valueOf(scan.nextLine());
        System.out.println("You gave the string " + cadena);
        System.out.println("You gave the integer " + entero);
        System.out.println("You gave the double " + doble);
        System.out.println("You gave the boolean " + booleano);

    }
}
