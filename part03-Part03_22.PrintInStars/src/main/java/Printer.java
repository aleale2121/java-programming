
public class Printer {

    public static void main(String[] args) {
        // You can test the method here
        int[] array = {5, 1, 3, 4, 2};
        printArrayInStars(array);
    }

    public static void printArrayInStars(int[] array) {
        // Write some code in here
        for (int num : array) {
            // Print the required number of stars using a loop
            for (int i = 0; i < num; i++) {
                System.out.print("*");
            }
            System.out.println(); // Move to a new line after each row
        }
    }

}
