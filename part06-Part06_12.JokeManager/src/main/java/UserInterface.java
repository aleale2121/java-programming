
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author alefew
 */
public class UserInterface {

    private final JokeManager jokeManager;
    private final Scanner scanner;

    public UserInterface(JokeManager jokeManager, Scanner scanner) {
        this.jokeManager = jokeManager;
        this.scanner = scanner;
    }

    public void start() {
        System.out.println("Commands:");
        System.out.println("1 - add a joke");
        System.out.println("2 - draw a joke");
        System.out.println("3 - list jokes");
        System.out.println("X - stop");

        String command;
        do {
            System.out.print("\n> ");
            command = scanner.nextLine().toUpperCase();
            handleCommand(command);
        } while (!command.equals("X"));
    }

    private void handleCommand(String command) {
        switch (command) {
            case "1":
                addJoke();
                break;
            case "2":
                drawJoke();
                break;
            case "3":
                jokeManager.printJokes();
                break;
            case "X":
                System.out.println("Exiting...");
                break;
            default:
                System.out.println("Invalid command!");
        }
    }

    private void addJoke() {
        System.out.print("Write the joke to be added: ");
        String joke = scanner.nextLine();
        jokeManager.addJoke(joke);
        System.out.println("Joke added!");
    }

    private void drawJoke() {
        String joke = jokeManager.drawJoke();
        System.out.println(joke);
    }
}
