
import java.util.Scanner;

public class GiftTax {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Value of the gift?");
        int numero = Integer.valueOf(scan.nextLine());
        int lower, starting;
        double tax, rate;
        if (numero < 5000) {
            System.out.print("No tax!");
        } else if (numero <= 25000) {
            starting = 5000;
            lower = 100;
            rate = 0.08;

            tax = (lower + (numero - starting) * rate);
            System.out.print(tax);
        } else if (numero <= 55000) {
            starting = 25000;
            lower = 1700;
            rate = 0.1;

            tax = (lower + (numero - starting) * rate);
            System.out.print(tax);
        } else if (numero <= 200000) {
            starting = 55000;
            lower = 4700;
            rate = 0.12;

            tax = (lower + (numero - starting) * rate);
            System.out.print(tax);
        } else if (numero <= 1000000) {
            starting = 200000;
            lower = 22100;
            rate = 0.15;

            tax = (lower + (numero - starting) * rate);
            System.out.print(tax);
        } else if (numero > 1000000) {
            starting = 1000000;
            lower = 142100;
            rate = 0.17;

            tax = (lower + (numero - starting) * rate);
            System.out.print(tax);

        }
    }
}
