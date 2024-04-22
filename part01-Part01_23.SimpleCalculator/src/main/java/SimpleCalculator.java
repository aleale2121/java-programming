
import java.util.Scanner;

public class SimpleCalculator {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Give the first number:");
        int num1 = Integer.valueOf(scanner.nextLine());
        System.out.println("Give the second number:");
        int num2 = Integer.valueOf(scanner.nextLine());
        int summ=num1+num2;
        int diff = num1-num2;
        int prod = num1 * num2;
        double qoutient = num1*1.0/num2;
        System.out.println(num1+" + " + num2 + " = "+summ);
        System.out.println(num1+" - " + num2 + " = "+diff);
        System.out.println(num1+" * " + num2 + " = "+prod);
        System.out.println(num1+" / " + num2 + " = "+qoutient);

    }
}
