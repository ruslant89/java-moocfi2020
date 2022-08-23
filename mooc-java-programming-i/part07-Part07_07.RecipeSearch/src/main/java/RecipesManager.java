import java.util.ArrayList;

public class RecipesManager {

    private ArrayList<Recipe> recipes;

    public RecipesManager() {
        this.recipes = new ArrayList<>();
    }

    public ArrayList<Recipe> getAllRecipes() {
        return this.recipes;
    }

    public void addRecipe(Recipe recipe) {
        this.recipes.add(recipe);
    }

    public void addMultipleRecipes(ArrayList<Recipe> recipes) {
        this.recipes.addAll(recipes);
    }

    public void removeRecipe(Recipe recipe) {
        this.recipes.remove(recipe);
    }

    public void removeMultipleRecipes(ArrayList<Recipe> recipes) {
        this.recipes.removeAll(recipes);
    }

    public void clearAllRecipes() {
        this.recipes.clear();
    }
}
