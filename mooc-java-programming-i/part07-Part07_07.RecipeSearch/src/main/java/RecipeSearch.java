
import java.util.Scanner;

public class RecipeSearch {

    public static void main(String[] args) {
        RecipesManager recipesManager = new RecipesManager();
        Scanner scanner = new Scanner(System.in);

        UserInterface userInterface = new UserInterface(recipesManager, scanner);
        userInterface.start();
    }

}
