
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
    private TodoList lista;

    public UserInterface(TodoList lista, Scanner scanner) {
        this.scanner = scanner;
        this.lista = lista;
    }

    public void start() {

        while (true) {
            System.out.print("Command: ");

            String command = scanner.nextLine();
            if (command.equals("stop")) {
                break;
            }

            switch (command) {
                case "add":
                    System.out.print("To add: ");
                    lista.add(scanner.nextLine());
                    break;
                case "list":
                    lista.print();
                    break;
                case "remove":
                    System.out.print("Which one is removed? ");
                    lista.remove(Integer.parseInt(scanner.nextLine()));
                    break;

            }
        }
    }

}
