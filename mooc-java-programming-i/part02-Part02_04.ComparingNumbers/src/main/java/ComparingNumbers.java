import java.util.Scanner;

public class ComparingNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int primero = Integer.valueOf(scanner.nextLine());
        int segundo = Integer.valueOf(scanner.nextLine());
        if (primero > segundo) {
            System.out.println(primero +" is greater than "+segundo+".");
        }else if (primero < segundo) {
            System.out.println(primero +" is smaller than "+segundo+".");
        } else {
            System.out.println(primero +" is equal to "+segundo+".");
        }


    }
}