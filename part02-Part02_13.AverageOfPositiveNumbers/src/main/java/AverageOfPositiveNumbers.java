
import java.util.Scanner;

public class AverageOfPositiveNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int count = 0;
        int sum = 0;
        boolean hasPositiveNumber = false;

        while (true) {
            System.out.println("Give a number:");
            int number = scanner.nextInt();

            if (number == 0) {
                break;
            }

            if (number > 0) {
                count++;
                sum += number;
                hasPositiveNumber = true;
            }
        }

        if (hasPositiveNumber) {
            double average = (double) sum / count;
            System.out.println(average);
        } else {
            System.out.println("Cannot calculate the average");
        }

        scanner.close();
    }
}
