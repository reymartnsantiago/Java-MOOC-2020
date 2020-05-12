
import java.util.Scanner;

public class LastWords {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
    while (true) {
            String text = scanner.nextLine();
            if (text.equals("")) {
                break;
            }

            String[] newText = text.split(" ");

            System.out.println(newText[newText.length-1]);

        }

    }
}
