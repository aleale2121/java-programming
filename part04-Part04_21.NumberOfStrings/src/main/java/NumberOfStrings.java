
import java.util.Scanner;

public class NumberOfStrings {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Integer count = 0;
        while(true){
            String input = scanner.nextLine();
            if( ! input.equals("end")){
                count++;
            } else{
                break;
            }
        }
        System.out.println(count);

    }
}
