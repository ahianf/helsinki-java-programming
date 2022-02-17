
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author ahian
 */
public class UserInterface {

    private Scanner scanner;
    private JokeManager manager;

    public UserInterface(){
    }

    public UserInterface(JokeManager manager, Scanner scanner) {
        this.scanner = scanner;
        this.manager = manager;
    }

    public void start() {
        boolean uwu = true;
        while (uwu) {
            System.out.println("Commands:");
            System.out.println(" 1 - add a joke");
            System.out.println(" 2 - draw a joke");
            System.out.println(" 3 - list jokes");
            System.out.println(" X - stop");
            String word = scanner.nextLine();
            switch (word) {
                case "1":
                    System.out.println("Write the joke to be added: ");
                    word = scanner.nextLine();
                    manager.addJoke(word);
                    break;

                case "X":
                    uwu ^= true;
                    break;

                case "2":
                    System.out.println(manager.drawJoke());
                    break;

                case "3":
                    manager.printJokes();
                    break;
            }
        }
    }
}
