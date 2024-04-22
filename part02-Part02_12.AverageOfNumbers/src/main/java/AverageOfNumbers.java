
import java.util.Scanner;

public class AverageOfNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int count = 0; // Variable to count numbers entered
        int sum = 0;   // Variable to store the sum of entered numbers

        while (true) {
            System.out.println("Give a number:");
            int number = scanner.nextInt();

            if (number == 0) {
                break; // Exit the loop if the number is zero
            }

            count++;       // Increment the count for each valid input number
            sum += number; // Add the number to the sum
        }

        // Calculate the average of the numbers (excluding 0)
        double average = (double) sum / count;

        System.out.println("Average of the numbers: " + average);

        scanner.close();
    }
}
