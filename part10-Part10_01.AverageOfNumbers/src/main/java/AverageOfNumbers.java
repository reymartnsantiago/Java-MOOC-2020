
import java.util.ArrayList;
import java.util.Scanner;

public class AverageOfNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // Write your program here
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
        double average = arr.stream()
                .mapToInt(s -> s)
                .average()
                .getAsDouble();
        System.out.println("average of the numbers: " + average);

    }
}
