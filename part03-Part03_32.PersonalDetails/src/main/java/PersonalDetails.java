
import java.util.ArrayList;
import java.util.Scanner;

public class PersonalDetails {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
 String longestName = "";
        int maxNameLength = 0;
        double sumBirthYears = 0;
        int countPeople = 0;

        while (true) {
            String line = scanner.nextLine();

            if (line.isEmpty()) {
                break;
            }

            // Extract name and birth year
            String[] parts = line.split(",");
            String name = parts[0].trim(); // Remove leading/trailing spaces
            int birthYear = Integer.parseInt(parts[1].trim());

            // Update longest name if needed
            int currentNameLength = name.length();
            if (currentNameLength > maxNameLength) {
                longestName = name;
                maxNameLength = currentNameLength;
            }

            // Update birth year statistics
            sumBirthYears += birthYear;
            countPeople++;
        }

        // Calculate and print average (avoid division by zero)
        double averageBirthYear = countPeople > 0 ? sumBirthYears / countPeople : 0.0;

        System.out.println("Longest name: " + longestName);
        System.out.println("Average of the birth years: " + averageBirthYear);
        scanner.close();

    }
}
