
import java.util.ArrayList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author alefew
 */
public class Recipes {

    private String name;
    private String cookingTime;
    private ArrayList<String> ingredients;

    public Recipes(String name, String cookingTime, ArrayList<String> ingredients) {
        this.name = name;
        this.cookingTime = cookingTime;
        this.ingredients = ingredients;
    }

    public String getName() {
        return this.name;
    }

    public String getCookingTime() {
        return cookingTime;
    }

    public ArrayList<String> getIngredients() {
        ArrayList<String> ingredients = new ArrayList<>();
        for (String line : this.ingredients) {
            ingredients.add(line);
        }
        return ingredients;
    }

    public String toString() {
        return this.name + ", cooking time: " + this.cookingTime;
    }
}
