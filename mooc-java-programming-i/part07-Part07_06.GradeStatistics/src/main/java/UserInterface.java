
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
    private Points puntos;

    public UserInterface() {
    }

    public UserInterface(Scanner scanner, Points puntos) {
        this.scanner = scanner;
        this.puntos = puntos;
    }

    public void start() {
        boolean loopCondition = true;
        System.out.println("Enter point totals, -1 stops:");
        while (loopCondition) {
            String word = scanner.nextLine();
            switch (word) {
                case "-1":
                    loopCondition = !loopCondition;
                    break;

                default:
                    puntos.add(word);
                    break;
            }
        }
        System.out.println("Point average (all): " + puntos.promedio());
        System.out.println("Point average (passing): " + puntos.promedioPassing());
        System.out.println("Pass percentage: " + puntos.porcentaje());
        puntos.distribucion();
    }
}
