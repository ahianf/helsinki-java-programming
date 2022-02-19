
import java.nio.file.Paths;
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
public class UserInterface {

    private Scanner scanner;

    public UserInterface(Scanner scanner) {
        this.scanner = scanner;
    }

    public void start() {
        ArrayList<Bird> lista = new ArrayList<>();
        boolean loopBoolean = true;
        while (loopBoolean) {

            System.out.print("? ");
            String word = scanner.nextLine();
            switch (word) {
                case "Add":
                    Bird bird = new Bird();

                    System.out.print("Name: ");
                    bird.setName(scanner.nextLine());
                    System.out.print("Name in Latin: ");
                    bird.setLatinName(scanner.nextLine());
                    lista.add(bird);
                    break;

                case "Observation":
                    System.out.print("Bird? ");
                    word = scanner.nextLine();
                    for (Bird i : lista) {
                        if (i.getName().equalsIgnoreCase(word)) {
                            i.setObservation();
                            break;
                        } else {
                            System.out.println("Not a bird!");
                        }
                    }
                    break;

                case "All":
                    for (Bird i : lista) {
                        System.out.println(i.toString());;
                    }
                    break;

                case "One":
                    System.out.print("Bird? ");
                    word = scanner.nextLine();
                    for (Bird i : lista) {
                        if (i.getName().equalsIgnoreCase(word)) {
                            System.out.println(i.toString());
                        } else {
                            System.out.println("Not a bird!");
                        };
                    }

                    break;

                case "Quit":
                    loopBoolean ^= true;
                    break;

            }
        }
    }

}
