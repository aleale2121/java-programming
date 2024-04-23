
import java.nio.file.Paths;
import java.util.Scanner;

public class NumbersFromAFile {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("File? ");
        String file = scanner.nextLine();
        System.out.print("Lower bound? ");
        int lowerBound = Integer.valueOf(scanner.nextLine());
        System.out.print("Upper bound? ");
        int upperBound = Integer.valueOf(scanner.nextLine());
        
        int numbersCount = 0;
        try (Scanner s = new Scanner(Paths.get(file))) {
            while (s.hasNextLine()) {
                int num = Integer.valueOf(s.nextLine());
                if (num >= lowerBound && num <= upperBound) {
                    numbersCount++;
                }
            }
        } catch (Exception e) {

            System.out.println("Reading the file " + file + " failed.");
        }
        System.out.println("Numbers: "+numbersCount);
    }

}
