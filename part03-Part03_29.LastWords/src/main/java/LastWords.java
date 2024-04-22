
import java.util.Scanner;

public class LastWords {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

         while (true) {
            String line = scanner.nextLine();

            if (line.isEmpty()) {
                break;
            }
            String[] lines=line.split(" ");
            System.out.println(lines[lines.length-1]);

        }
        scanner.close();
    }
}
