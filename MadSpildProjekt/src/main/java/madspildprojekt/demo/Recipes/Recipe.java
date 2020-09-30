package madspildprojekt.demo.Recipes;

import java.util.ArrayList;

public class Recipe {

    private String fremgangsmåde;
    private ArrayList<String> ingredienser = new ArrayList<>();

    public Recipe(String fremgangsmåde, String ... ingredienser){
        this.fremgangsmåde = fremgangsmåde;
        for (String ingrediens: ingredienser) {
            this.ingredienser.add(ingrediens);
        }
    }

    //evt her vi kan indlæse opskifter fra filer eller et andet sted :)
}
