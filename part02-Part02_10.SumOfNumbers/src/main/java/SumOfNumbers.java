
import java.util.Scanner;

public class SumOfNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int sum = 0;

        while (true) {
            System.out.println("Give a number:");
            int number = scanner.nextInt();

            if (number == 0) {
                break; // Exit the loop if the number is zero
            }

            sum += number; // Add the number to the sum
        }

        System.out.println("Sum of the numbers: " + sum);

        scanner.close();
    }
}
