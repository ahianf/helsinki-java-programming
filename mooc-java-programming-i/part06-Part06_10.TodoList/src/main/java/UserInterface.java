
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
    private TodoList todo;

    public UserInterface(TodoList todo, Scanner scanner) {
        this.scanner = scanner;
        this.todo = todo;
    }

    public void start() {
        boolean uwu = true;
        while (uwu) {
            System.out.print("Command: ");
            String word = scanner.nextLine();
            String translation;
            switch (word) {
                case "add":
                    System.out.print("To add: ");
                    word = scanner.nextLine();
                    todo.add(word);
                    break;

                case "stop":
                    uwu ^= true;
                    break;

                case "list":
                    todo.print();
                    break;

                case "remove":
                    System.out.print("Which one is removed? ");
                    word = scanner.nextLine();
                    todo.remove(Integer.valueOf(word));
                    break;

                default:
                    System.out.println("Unknown command");
                    break;
            }
        }
    }
}
