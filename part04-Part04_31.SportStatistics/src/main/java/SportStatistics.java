
import java.io.IOException;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;

public class SportStatistics {

    public static void main(String[] args) throws IOException {
        Scanner scan = new Scanner(System.in);
        System.out.println("File: ");
        String file = scan.nextLine();
        System.out.println("Team: ");
        String team = scan.nextLine();
        start(file, team);
    }

    private static void start(String file, String team) throws IOException {
        Scanner scannedFile = new Scanner(Paths.get(file));
        int counter = 0;
        int win = 0;
        int loses = 0;
        while (scannedFile.hasNext()) {
            String text = scannedFile.nextLine();
            String[] database = text.split(",");

            for (String x : database) {
                if (team.equals(x)) {
                    counter++;
                }
            }

            if (database[0].equals(team)) {
                if (Integer.valueOf(database[2]) > Integer.valueOf(database[3])) {
                    win++;
                } else {
                    loses++;
                }
            } else if (database[1].equals(team)) {
                if (Integer.valueOf(database[3]) > Integer.valueOf(database[2])) {
                    win++;
                } else {
                    loses++;
                }
            }

        }
        System.out.println("Games: " + counter);
        System.out.println("Wins: " + win);
        System.out.println("Losses: " + loses);
    }

}
