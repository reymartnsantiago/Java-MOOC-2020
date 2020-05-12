
import java.util.Scanner;

public class NameOfTheOldest {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int oldest = 0;
        while (true) {
            String text = scanner.nextLine();
            if (text.equals("")) {
                System.out.println("Age of the Oldest: " + oldest);
                break;
            }

            String[] newText = text.split(" ");

            if (newText.length > 0) {
                oldest = Integer.valueOf(newText[1]);
                if (Integer.valueOf(newText[1]) > oldest) {
                    System.out.println(Integer.valueOf(newText[1]));;
                }
            }

        }
    }
}
