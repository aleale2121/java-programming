
import java.util.Scanner;

public class NameOfTheOldest {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int maxAge = Integer.MIN_VALUE; // Initialize with minimum integer value
        String oldestName = null; // Variable to store name of oldest person

        while (true) {
            String line = scanner.nextLine();

            if (line.isEmpty()) {
                break;
            }

            // Extract name and age
            String[] parts = line.split(",");
            String name = parts[0].trim(); // Remove leading/trailing spaces
            int age = Integer.parseInt(parts[1].trim());

            // Update maxAge and name if current age is higher
            if (age > maxAge) {
                maxAge = age;
                oldestName = name;
            }
        }

        if (oldestName != null) {
            System.out.println("Name of the oldest: " + oldestName);
        }
        scanner.close();

    }
}
