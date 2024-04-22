
import java.util.Scanner;

public class GiftTax {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter the value of the gift
        System.out.println("Value of the gift?");
        double giftValue = scanner.nextDouble();

        double giftTax;
        if (giftValue < 5000) {
            giftTax = 0;
        } else if (giftValue >= 5000 && giftValue < 25000) {
            giftTax = 100 + (giftValue - 5000) * 0.08;
        } else if (giftValue >= 25000 && giftValue < 55000) {
            giftTax = 1700 + (giftValue - 25000) * 0.10;
        } else if (giftValue >= 55000 && giftValue < 200000) {
            giftTax = 4700 + (giftValue - 55000) * 0.12;
        } else if (giftValue >= 200000 && giftValue < 1000000) {
            giftTax = 22100 + (giftValue - 200000) * 0.15;
        } else {
            giftTax = 142100 + (giftValue - 1000000) * 0.17;
        }
        // Display the tax amount or "No tax!" if the value is below the threshold
        if (giftTax > 0) {
            System.out.println("Tax: " + giftTax);
        } else {
            System.out.println("No tax!");
        }

        scanner.close();
    }
}
