
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
        boolean loopBoolean = true;
        System.out.print("File to read: ");
        String file = scanner.nextLine();
        //String file = "recipes.txt";
        ArrayList<Recipe> recetas = parseFile(file);
        while (loopBoolean) {

            System.out.println("Commands:");
            System.out.println("list - lists the recipes");
            System.out.println("stop - stops the program");
            System.out.println("find name - searches recipes by name");
            System.out.println("find cooking time - searches recipes by cooking time");
            System.out.println("find ingredient - searches recipes by ingredient");
            String word = scanner.nextLine();
            switch (word) {
                case "list":
                    for (Recipe i : recetas) {
                        System.out.println(i.toString());
                    }
                    break;

                case "stop":
                    loopBoolean ^= true;
                    break;

                case "find name":
                    System.out.print("Searched word: ");
                    word = scanner.nextLine();
                    System.out.println("Recipes:");
                    for (Recipe i : recetas) {
                        if (i.getNombre().contains(word)) {
                            System.out.println(i.toString());
                        }
                    }
                    break;

                case "find cooking time":
                    System.out.print("Max cooking time: ");
                    int maxTime = Integer.parseInt(scanner.nextLine());
                    System.out.println("Recipes:");
                    for (Recipe i : recetas) {
                        if (i.getTiempo() <= maxTime) {
                            System.out.println(i.toString());
                        }
                    }
                    break;
                case "find ingredient":
                    System.out.print("Ingredient: ");
                    word = scanner.nextLine();
                    System.out.println("Recipes:");
                    for (Recipe i : recetas) {
                        if (i.getIngrediente().getLista().contains(word)) {
                            System.out.println(i.toString());
                        }
                    }
                    break;

            }
        }
    }

    public ArrayList<Recipe> parseFile(String path) {
        ArrayList<Recipe> recetas = new ArrayList<>();

        try (Scanner scanner = new Scanner(Paths.get(path))) {
            while (scanner.hasNextLine()) {
                Ingredient ingredientes = new Ingredient();

                String nombre = scanner.nextLine();
                int tiempo = Integer.parseInt(scanner.nextLine());

                while (scanner.hasNextLine()) {
                    String ingrediente = scanner.nextLine();
                    if (ingrediente.isEmpty()) {
                        break;
                    } else {
                        ingredientes.add(ingrediente);
                    }
                }
                recetas.add(new Recipe(nombre, tiempo, ingredientes));
            }
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
        return recetas;
    }
}
