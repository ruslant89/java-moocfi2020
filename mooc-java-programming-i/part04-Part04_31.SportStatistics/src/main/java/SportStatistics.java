
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;

public class SportStatistics {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("File: ");
        String fileName = scan.nextLine();

        ArrayList<String> teams = new ArrayList<>();

        try (Scanner fileInput = new Scanner(Paths.get(fileName))) {

            while (fileInput.hasNextLine()) {
                teams.add(fileInput.nextLine());
            }

        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }

        System.out.println("Team: ");
        String teamName = scan.nextLine();

        int gamesCount = 0;
        int winCount = 0;
        int lossCount = 0;

        for (String team : teams) {
            String[] parts = team.split(",");
            String homeTeam = parts[0];
            String awayTeam = parts[1];
            int homeTeamPoints = Integer.valueOf(parts[2]);
            int awayTeamPoints = Integer.valueOf(parts[3]);

            if (teamName.equals(homeTeam) || teamName.equals(awayTeam)) {
                gamesCount++;

                if (homeTeamPoints > awayTeamPoints || (teamName.equals(awayTeam) && awayTeamPoints > homeTeamPoints)) {
                    winCount++;
                } else {
                    lossCount++;
                }
            }
        }

        System.out.println("Games: " + gamesCount);
        System.out.println("Wins: " + winCount);
        System.out.println("Losses: " + lossCount);
    }

}
