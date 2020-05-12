
import java.util.Scanner;

public class MainProgram {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // you can write test code here
        // however, remove all unnecessary code when doing the final parts of the exercise

        // In order for the tests to work, the objects must be created in the
        // correct order in the main program. First the object that tracks the total
        // sum, secondly the object that tracks the sum of even numbers, 
        // and lastly the one that tracks the sum of odd numbers!
        start(scanner);
    }

    public static void start(Scanner scanner) {
        Statistics obj = new Statistics();
        Statistics evenObj = new Statistics();
        Statistics oddObj = new Statistics();
        while (true) {
            System.out.println("Enter numbers: ");
            int value = Integer.valueOf(scanner.nextLine());
            if (value == -1) {
                break;
            } else {
                obj.addNumber(value);
                if (value % 2 == 0) {
                    evenObj.addNumber(value);
                } else {
                    oddObj.addNumber(value);
                }
            }

        }
        System.out.println("Sum: " + obj.sum());
        System.out.println("Sum of even numbers: " + evenObj.sum());
        System.out.println("Sum of odd numbers: " + oddObj.sum());
    }
}
