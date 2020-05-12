
import java.util.Scanner;

public class DivisibleByThree {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        divisibleByThreeInRange(2, 10);
    }

    public static void divisibleByThreeInRange(int beginning, int end) {
        int total = 3;
        for (int i = beginning; i < end; i++) {
            if (total < end) {
                System.out.println(total);
                total += 3;

            }

        }
    }
}
