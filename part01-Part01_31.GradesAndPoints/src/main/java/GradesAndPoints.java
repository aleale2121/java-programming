
import java.util.Scanner;

public class GradesAndPoints {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the points earned: ");
        int points = scanner.nextInt();

        String grade;

        if (points < 0) {
            grade = "impossible!";
        } else if (points >= 0 && points < 50) {
            grade = "failed";
        } else if (points >= 50 && points <= 59) {
            grade = "1";
        } else if (points >= 60 && points <= 69) {
            grade = "2";
        } else if (points >= 70 && points <= 79) {
            grade = "3";
        } else if (points >= 80 && points <= 89) {
            grade = "4";
        } else if (points >= 90 && points <= 100) {
            grade = "5";
        } else {
            grade = "incredible!";
        }

        // Display the grade
        System.out.println("The grade for the course is: " + grade);

        scanner.close();
    }
}
