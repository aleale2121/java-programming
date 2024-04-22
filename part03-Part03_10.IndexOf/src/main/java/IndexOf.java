
import java.util.ArrayList;
import java.util.Scanner;

public class IndexOf {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ArrayList<Integer> list = new ArrayList<>();
        while (true) {
            int input = Integer.valueOf(scanner.nextLine());
            if (input == -1) {
                break;
            }

            list.add(input);
        }

        System.out.println("");

        // implement here finding the indices of a number
        System.out.print("Search for? ");
        int searchNumber = Integer.parseInt(scanner.nextLine());
        for (int index = 0; index < list.size(); index++) {
            if (list.get(index) == searchNumber) {
                System.out.println(searchNumber + " is at index " + index);
            }
        }

        // If the number is not found, do not print anything


        scanner.close();
    }
}
