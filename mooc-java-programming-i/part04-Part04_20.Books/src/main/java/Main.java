
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // implement here your program that uses the TelevisionProgram class

        ArrayList<Book> books = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.print("Title: ");
            String title = scanner.nextLine();

            if (title.isEmpty()) {
                break;
            }
            System.out.println("Pages: ");
            int pages = Integer.valueOf(scanner.nextLine());

            System.out.print("Publication year: ");
            int year = Integer.valueOf(scanner.nextLine());

            books.add(new Book(title, pages, year));
        }
        System.out.println("");
        System.out.print("What information will be printed? ");
        String selection = scanner.nextLine();

        if (selection.equals("everything")) {
            for (Book i : books) {
                System.out.println(i.toString());
            }
        } else if (selection.equals("name")) {
            for (Book i : books) {
                System.out.println(i.getTitle());
            }
        }

    }
}
