
import java.util.Scanner;

public class IsItTrue {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Give a string: ");
        String userInput = scanner.nextLine().toLowerCase(); // Convert input to lowercase

        if (userInput.equals("true")) {
            System.out.println("You got it right!");
        } else {
            System.out.println("Try again!");
        }
        scanner.close();
    }
}
