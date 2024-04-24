
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
public class JokeManager {

    private ArrayList<String> jokes;

    public JokeManager() {
        jokes = new ArrayList<>();
    }

    public void addJoke(String joke) {
        jokes.add(joke);
    }

    public String drawJoke() {
        if (jokes.isEmpty()) {
            return "Jokes are in short supply.";
        }
        int randomIndex = (int) (Math.random() * jokes.size());
        return jokes.get(randomIndex);
    }

    public void printJokes() {
        if (jokes.isEmpty()) {
            System.out.println("No jokes stored yet.");
            return;
        }
        System.out.println("Printing jokes:");
        for (String joke : jokes) {
            System.out.println(joke);
        }
    }
}
