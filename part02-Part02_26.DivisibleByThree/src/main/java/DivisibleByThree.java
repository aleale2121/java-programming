
import java.util.Scanner;

public class DivisibleByThree {

    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
        divisibleByThreeInRange(3, 6);

    }

    public static void divisibleByThreeInRange(int beginning, int end) {
        // Ensure beginning is less than or equal to end
        if (beginning > end) {
            return; // Invalid range, do nothing
        }

        // Iterate through each number in the range [beginning, end]
        for (int i = beginning; i <= end; i++) {
            // Check if the current number is divisible by three
            if (i % 3 == 0) {
                System.out.println(i);
            }
        }
    }
}
