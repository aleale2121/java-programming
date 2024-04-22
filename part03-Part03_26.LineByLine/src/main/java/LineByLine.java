
import java.util.Scanner;

public class LineByLine {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            String inp = scanner.nextLine();
            if (inp.equals("")) {
                break;
            }
            for (String x : inp.split(" ")) {
                System.out.println(x);
            }
        }
    }
}
