
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        ArrayList<Archive> database = new ArrayList<>();
        while (true) {
            System.out.println("Identifier? (empty will stop)");
            String identifier = reader.nextLine();
            if (identifier.isEmpty()) {
                break;
            }
            System.out.println("Name? (empty will stop)");
            String name = reader.nextLine();
            if (name.isEmpty()) {
                break;
            }

            Archive obj = new Archive(identifier, name);
            if (!database.contains(obj)) {
                database.add(obj);
            }
        }
        System.out.println("==Items==");
        database.forEach((Archive obj) -> {
            System.out.println(obj.toString());
        });
    }

}
