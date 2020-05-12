
import java.util.Scanner;

public class Cubes {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            String value = scanner.nextLine();
            if (value.equals("end")) {
                break;
            } else {
                int x = Integer.valueOf(value);
                for (int i = 0; i < 2; i++) {

                }
                System.out.println(x);
            }
        }
    }
}
