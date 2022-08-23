import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;

public class UserInterface {

    private RecipesManager recipesManager;
    private Scanner scanner;
    private ArrayList<String> recipes;

    public UserInterface(RecipesManager recipesManager, Scanner scanner) {
        this.recipesManager = recipesManager;
        this.scanner = scanner;
        this.recipes = new ArrayList<>();
    }

    public void start() {
        readFile();
        createRecipesFromFile();
        printCommands();
        executeCommands();
    }

    private void readFile() {
        System.out.print("File to read: ");
        String fileName = scanner.nextLine();

        try (Scanner fileInput = new Scanner(Paths.get(fileName))) {
            while (fileInput.hasNextLine()) {
                String row = fileInput.nextLine();
                recipes.add(row);
            }
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }

    private void createRecipesFromFile() {
        for (int i = 0; i < recipes.size(); i++) {
            if (recipes.get(i).isEmpty()) {
                continue;
            }

            String recipeName = recipes.get(i++);
            int cookingTime = Integer.valueOf(recipes.get(i++));
            ArrayList<String> ingredients = new ArrayList<>();

            while (i < recipes.size() && !recipes.get(i).isEmpty()) {
                ingredients.add(recipes.get(i));
                i++;
            }

            Recipe recipe = new Recipe(recipeName, cookingTime, ingredients);
            recipesManager.addRecipe(recipe);
        }
    }

    private void printCommands() {
        System.out.println();
        System.out.println("Commands: ");
        System.out.println("list - lists the recipes");
        System.out.println("stop - stops the program");
        System.out.println("find name - searches recipes by name");
        System.out.println("find cooking time - searches recipes by cooking time");
        System.out.println("find ingredient - searches recipes by ingredient");
    }

    private void executeCommands() {
        while (true) {
            System.out.println();
            System.out.print("Enter command: ");
            String command = scanner.nextLine();

            if ("stop".equals(command)) {
                break;
            }

            if ("list".equals(command)) {
                System.out.println();
                System.out.println("Recipes: ");
                for (Recipe recipe : recipesManager.getAllRecipes()) {
                    System.out.println(recipe.getRecipeName() + ", cooking time: " + recipe.getCookingTime());
                }
            }

            if ("find name".equals(command)) {
                System.out.print("Searched word: ");
                String searchWord = scanner.nextLine();
                System.out.println();
                System.out.println("Recipes: ");
                for (Recipe recipe : recipesManager.getAllRecipes()) {
                    if (recipe.getRecipeName().contains(searchWord)) {
                        System.out.println(recipe.getRecipeName() + ", cooking time: " + recipe.getCookingTime());
                    }
                }
            }

            if ("find cooking time".equals(command)) {
                System.out.print("Max cooking time: ");
                int cookingTime = Integer.valueOf(scanner.nextLine());
                System.out.println();
                System.out.println("Recipes: ");
                for (Recipe recipe : recipesManager.getAllRecipes()) {
                    if (recipe.getCookingTime() <= cookingTime) {
                        System.out.println(recipe.getRecipeName() + ", cooking time: " + recipe.getCookingTime());
                    }
                }
            }

            if ("find ingredient".equals(command)) {
                System.out.print("Ingredient: ");
                String ingredient = scanner.nextLine();
                System.out.println();
                System.out.println("Recipes: ");
                for (int i = 0; i < recipesManager.getAllRecipes().size(); i++) {
                    for (String ingr : recipesManager.getAllRecipes().get(i).getIngredients()) {
                        if (ingr.equals(ingredient)) {
                            System.out.println(recipesManager.getAllRecipes().get(i).getRecipeName() + ", cooking time: " + recipesManager.getAllRecipes().get(i).getCookingTime());
                        }
                    }
                }
            }
        }
    }
}
