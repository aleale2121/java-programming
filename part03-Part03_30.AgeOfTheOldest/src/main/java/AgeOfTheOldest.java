
import java.util.Scanner;

public class AgeOfTheOldest {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int maxAge = Integer.MIN_VALUE; // Initialize with minimum integer value

        while (true) {
            String line = scanner.nextLine();

            if (line.isEmpty()) {
                break;
            }

            // Extract name and age
            String[] parts = line.split(",");
            String name = parts[0].trim(); // Remove leading/trailing spaces
            int age = Integer.parseInt(parts[1].trim());

            // Update maxAge if current age is higher
            maxAge = Math.max(maxAge, age);
        }

        System.out.println("Age of the oldest: " + maxAge);
        scanner.close();
    }
}
