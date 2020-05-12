
import java.util.ArrayList;
import java.util.Scanner;

public class AverageOfSelectedNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // toteuta ohjelmasi tänne
        start(scanner);
    }

    public static void start(Scanner reader) {
        ArrayList<Integer> arr = new ArrayList<>();

        while (true) {
            System.out.println("Input numbers, type \"end\" to stop.");
            String input = reader.nextLine();
            if (input.equals("end")) {
                break;
            } else {
                int intInput = Integer.valueOf(input);
                arr.add(intInput);
            }
        }
        System.out.println("Print the average of the negative numbers or the positive numbers? (n/p)");
        String input = reader.nextLine();
        if (input.equals("n")) {
            double average = arr.stream()
                    .mapToInt(s -> s)
                    .filter(numb -> numb<0)
                    .average()
                    .getAsDouble();
            System.out.println("Average of the negative numbers: " + average);

        } else if (input.equals("p")) {
            double average = arr.stream()
                    .mapToInt(s -> s)
                    .filter(numb -> numb>0)
                    .average()
                    .getAsDouble();
            System.out.println("Average of the positive numbers:" + average);

        }

    }
}
