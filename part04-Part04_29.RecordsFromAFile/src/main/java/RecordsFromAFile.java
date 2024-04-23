
import java.io.IOException;
import java.nio.file.Paths;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

public class RecordsFromAFile {

    public static void main(String[] args) {
  Scanner s = new Scanner(System.in);
        System.out.println("Name of the file");
        String file = s.nextLine();



        try (Scanner scanner = new Scanner(Paths.get(file))) {

            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();

                String[] parts = line.split(",");
                String name = parts[0];
                int age = Integer.valueOf(parts[1]);

                System.out.println(name + ", " + age + " years" );
            }
        } catch (IOException ex) {
            Logger.getLogger(RecordsFromAFile.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
