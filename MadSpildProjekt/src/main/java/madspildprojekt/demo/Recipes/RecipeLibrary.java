package madspildprojekt.demo.Recipes;

import java.util.ArrayList;

public class RecipeLibrary {

    ArrayList<Recipe> recipeLibrary = new ArrayList<>();

    public void add(Recipe r){
        recipeLibrary.add(r);
    }


    public ArrayList<Recipe> getRecipeLibrary() {

        return recipeLibrary;
    }

    @Override
    public String toString() {
        return "RecipeLibrary{" +
                "recipeLibrary=" + recipeLibrary +
                '}';
    }
}