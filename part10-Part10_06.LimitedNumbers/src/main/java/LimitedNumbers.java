
import java.util.ArrayList;
import java.util.Scanner;

public class LimitedNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        start(scanner);
    }

    public static void start(Scanner reader) {
        ArrayList<Integer> test = new ArrayList<>();
        while (true) {
            int input = Integer.valueOf(reader.nextLine());

            if (input == -1) {

                break;
            }
            test.add(input);
        }

        test.stream()
                .filter(input -> input >= 1 && input <= 5)
                .forEach(name -> System.out.println(name));

    }
}
