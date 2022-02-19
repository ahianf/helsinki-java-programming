
import java.util.ArrayList;
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
public class TextUI {

    private Scanner scanner;
    private SimpleDictionary dict;

    public TextUI(Scanner scanner, SimpleDictionary dict) {
        this.scanner = scanner;
        this.dict = dict;
    }

    public void start() {
        boolean uwu = true;
        while (uwu) {
            System.out.print("Command: ");
            String word = scanner.nextLine();
            String translation;
            switch (word) {
                case "add":
                    System.out.print("Word: ");
                    word = scanner.nextLine();
                    System.out.print("Translation: ");
                    translation = scanner.nextLine();
                    dict.add(word, translation);
                    break;

                case "end":
                    System.out.println("Bye bye!");
                    uwu ^= true;
                    break;

                case "search":
                    System.out.print("To be translated: ");
                    word = scanner.nextLine();
                    if (dict.translate(word) == null) {
                        System.out.println("Word " + word + " was not found");
                    } else {
                        System.out.println("Translation: " + dict.translate(word));
                    }
                    break;

                default:
                    System.out.println("Unknown command");
                    break;
            }
        }
    }
}
