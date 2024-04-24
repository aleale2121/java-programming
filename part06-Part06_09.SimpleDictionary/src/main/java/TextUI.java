
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
public class TextUI {

    private Scanner scanner;
    private SimpleDictionary dictionary;

    public TextUI(Scanner scanner, SimpleDictionary dictionary) {
        this.scanner = scanner;
        this.dictionary = dictionary;
    }

    public void start() {

        while (true) {
            System.out.print("Command:");
            String command = scanner.nextLine();

            if (command.equals("end")) {
                System.out.println("Bye bye!");
                break;
            } else if (command.equals("add")) {
                System.out.print("Word:");
                String word = scanner.nextLine();
                System.out.print("Translation:");
                String translation = scanner.nextLine();
                dictionary.add(word, translation);
                continue;
            } else if (command.equals("search")) {
                System.out.print("To be translated:");
                String word = scanner.nextLine();
                System.out.print("Translation:");
                if (dictionary.translate(word) != null) {
                    System.out.print(dictionary.translate(word));
                } else {
                    System.out.println("Word " + word + " was not found");
                }
                continue;
            }

            System.out.println("Unknown command");

        }

    }
}
