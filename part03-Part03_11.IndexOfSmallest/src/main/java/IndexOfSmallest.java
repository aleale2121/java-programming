
import java.util.ArrayList;
import java.util.Scanner;

public class IndexOfSmallest {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // implement here a program that reads user input
        // until the user enters 9999
        // after that, the program prints the smallest number
        // and its index -- the smallest number
        // might appear multiple times
        ArrayList<Integer> list = new ArrayList<>();
        while (true) {
            int input = Integer.valueOf(scanner.nextLine());
            if (input == 9999) {
                break;
            }

            list.add(input);
        }

        System.out.println("");

        // implement finding the greatest number in the list here
        int small = 0;

        for (int i = 0; i < list.size(); i++) {
            int number = list.get(i);
            if (list.get(small) > number) {
                small = i;
            }
        }

        int searchNumber = list.get(small);
        System.out.println("Smallest number: " + searchNumber);
        for (int index = 0; index < list.size(); index++) {
            if (list.get(index) == searchNumber) {
                System.out.println("Found at index: " + index);
            }
        }
    }
}
