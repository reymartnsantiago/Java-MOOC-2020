
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class IndexOfSmallest {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Integer> list = new ArrayList<>();
        // implement here a program that reads user input
        // until the user enters 9999

        // after that, the program prints the smallest number
        // and its index -- the smallest number
        // might appear multiple times
        int minIdex = 0;
        while (true) {
            int x = Integer.valueOf(scanner.nextLine());

            if (x == 9999) {
                System.out.println("Smallest number: "+Collections.min(list));
                System.out.println("Found at index: " + list.indexOf(Collections.min(list)));
                break;
            }
            list.add(x);
        }

    }
}
