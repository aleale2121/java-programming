
import java.nio.file.Paths;
import java.util.Scanner;

public class PrintingASpecifiedFile {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        try(Scanner scanner = new Scanner(Paths.get(s.nextLine()))){
            while (scanner.hasNextLine()){
                String row = scanner.nextLine();
                System.out.println(row);
            }
        }catch(Exception e){
            System.out.println("error "+ e.getMessage());
        }

    }
}
