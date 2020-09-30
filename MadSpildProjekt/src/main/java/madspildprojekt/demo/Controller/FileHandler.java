package madspildprojekt.demo.Controller;

import madspildprojekt.demo.Recipes.Recipe;
import madspildprojekt.demo.Recipes.RecipeLibrary;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Scanner;

public class FileHandler {

    RecipeLibrary recipeLibrary = new RecipeLibrary();

    public void indlæsOpskrifterFraFil() {
        try (BufferedReader br = new BufferedReader(new FileReader("Opskrifter.txt"))) {

            String line;
            String navn;
            String fremgangsmåde;
            ArrayList<String> ingredienser = new ArrayList<>();

            while ((line = br.readLine()) != null) {
                Scanner scan = new Scanner(line);
                scan.useDelimiter("//");
                navn = scan.next();
                fremgangsmåde = scan.next();
                for (int i = 0; i <ingredienser.size() ; i++) {
                    ingredienser.add(scan.next());
                }

                recipeLibrary.add(new Recipe(navn, fremgangsmåde, ingredienser));

            }

        } catch (FileNotFoundException e) {
            System.out.println("Kan ikke finde fil.");
        } catch (IOException e) {
            System.out.println("Kan ikke læse fil");
        }



    }

    //evt her vi kan indlæse opskifter fra filer eller et andet sted :)


}
