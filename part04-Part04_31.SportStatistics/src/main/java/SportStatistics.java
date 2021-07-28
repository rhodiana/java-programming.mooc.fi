
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;

public class SportStatistics {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        System.out.println("File:");
        String file = scan.nextLine();
        System.out.println("Team:");
        String team = scan.nextLine();
        
        int games = 0, wins = 0, losses = 0;
        try(Scanner fileScanner = new Scanner(Paths.get(file))) {
            while(fileScanner.hasNextLine()) {
                String line = fileScanner.nextLine();
                
                String Data[] = line.split(",");
                String homeTeam = Data[0];
                String visitingTeam = Data[1];
                int homeTeamPoints = Integer.valueOf(Data[2]);
                int visitingTeamPoints = Integer.valueOf(Data[3]);
                if(homeTeam.equals(team)){
                    games++;
                    if(homeTeamPoints>visitingTeamPoints) {
                        wins++;
                    } else {
                        losses++;
                    }
                }
                if(visitingTeam.equals(team)){
                    games++;
                    if(visitingTeamPoints>homeTeamPoints) {
                        wins++;
                    } else {
                        losses++;
                    }
                }
            }
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
        System.out.println("Games: " + games);
        System.out.println("Wins: " + wins);
        System.out.println("Losses: " + losses);
    }
}
