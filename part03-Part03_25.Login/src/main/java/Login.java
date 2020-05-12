
import java.util.ArrayList;
import java.util.Scanner;

public class Login {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] user = {"alex", "emma"};
        String[] pass = {"sunshine", "haskell"};

        System.out.println("Enter username: ");
        String username = scanner.nextLine();
        System.out.println("Enter password: ");
        String password = scanner.nextLine();

        if (((user[0].equals(username)) || user[1].equals(username)) && (pass[0].equals(password) || pass[1].equals(password))) {
            System.out.println("You have successfully logged in!");
        } else {
            System.out.println("Incorrect username or password!");
        }

    }
}
