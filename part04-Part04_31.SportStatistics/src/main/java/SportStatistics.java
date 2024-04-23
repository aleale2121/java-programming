
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

public class SportStatistics {

    public static void main(String[] args) throws FileNotFoundException, IOException {
         Scanner scanner = new Scanner(System.in);

        System.out.println("File:");
        String fileName = scanner.nextLine();

        System.out.println("Team:");
        String teamName = scanner.nextLine();

        int gamesPlayed = 0;
        int wins = 0;
        int losses = 0;

        try (Scanner fileScanner = new Scanner(new File(fileName))) {
            while (fileScanner.hasNextLine()) {
                String line = fileScanner.nextLine();
                String[] parts = line.split(",");

                String homeTeam = parts[0];
                String visitingTeam = parts[1];
                int homePoints = Integer.parseInt(parts[2]);
                int visitingPoints = Integer.parseInt(parts[3]);

                if (homeTeam.equals(teamName) || visitingTeam.equals(teamName)) {
                    gamesPlayed++;
                    if (homeTeam.equals(teamName) && homePoints > visitingPoints) {
                        wins++;
                    } else if (visitingTeam.equals(teamName) && visitingPoints > homePoints) {
                        wins++;
                    } else {
                        losses++;
                    }
                }
            }

            System.out.println("Games: " + gamesPlayed);
            System.out.println("Wins: " + wins);
            System.out.println("Losses: " + losses);

        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        } finally {
            scanner.close();
        }
    }

}
