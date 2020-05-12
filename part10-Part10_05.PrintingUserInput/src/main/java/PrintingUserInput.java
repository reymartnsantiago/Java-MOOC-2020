
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class PrintingUserInput {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        start(scanner);
    }

    public static void start(Scanner reader) {
        ArrayList<String> test = new ArrayList<>();
        while (true) {
            String input = reader.nextLine();

            if (input.isBlank()) {

                break;
            }
            test.add(input);
        }

        test.stream()
                .forEach(name -> System.out.println(name));

    }
}
