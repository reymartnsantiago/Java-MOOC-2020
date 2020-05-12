
import java.io.IOException;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;

public class NumbersFromAFile {

    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);

        System.out.print("File? ");
        String file = scanner.nextLine();
        System.out.print("Lower bound? ");
        int lowerBound = Integer.valueOf(scanner.nextLine());
        System.out.print("Upper bound? ");
        int upperBound = Integer.valueOf(scanner.nextLine());
        System.out.println(number(file, lowerBound, upperBound));;

    }

    private static int number(String file, int lowerbound, int upperbound) throws IOException {
        Scanner reader = new Scanner(Paths.get(file));
        int counter = 0;
        ArrayList<Integer> database = new ArrayList<>();
        while (reader.hasNext()) {
            int value = Integer.valueOf(reader.nextLine());
            database.add(value);
        }
//         int x = database.get(upperbound);
//         int y=database.get(lowerbound);
//         
//         for(int i=y; i<x; i++){
//             counter++;
//         }
        return counter;
    }

}
