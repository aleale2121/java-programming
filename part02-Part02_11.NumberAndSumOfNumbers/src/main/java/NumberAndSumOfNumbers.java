
import java.util.Scanner;

public class NumberAndSumOfNumbers {

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

            count++;       
            sum += number; 
        }

        System.out.println("Number of numbers: " + count);
        System.out.println("Sum of the numbers: " + sum);

        scanner.close();
    }
}
