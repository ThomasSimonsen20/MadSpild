package madspildprojekt.demo.Recipes;

import java.util.ArrayList;

public class Recipe {

    private String navn;
    private String fremgangsmåde;
    private ArrayList<String> ingredienser = new ArrayList<>();

    public Recipe(String navn, String fremgangsmåde, ArrayList<String> ingredienser){
        this.navn = navn;
        this.fremgangsmåde = fremgangsmåde;
        this.ingredienser = ingredienser;
    }


    ///////////////////////////////////////////////////////////////
    ///Settere/////////////////////////////////////////////////////
    ///////////////////////////////////////////////////////////////


    public void setNavn(String navn) {
        this.navn = navn;
    }

    public void setFremgangsmåde(String fremgangsmåde) {
        this.fremgangsmåde = fremgangsmåde;
    }

    public void setIngredienser(String ... ingredienser) {
        for (String ingrediens: ingredienser) {
            this.ingredienser.add(ingrediens);
        }
    }

    ///////////////////////////////////////////////////////////////
    ///Gettere/////////////////////////////////////////////////////
    ///////////////////////////////////////////////////////////////


    public String getNavn() {
        return navn;
    }

    public String getFremgangsmåde() {
        return fremgangsmåde;
    }

    public ArrayList<String> getIngredienser() {
        return ingredienser;
    }
}
