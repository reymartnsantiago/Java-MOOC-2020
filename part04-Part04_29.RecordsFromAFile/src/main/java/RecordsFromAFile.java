
import java.io.IOException;
import java.nio.file.Paths;
import java.util.Scanner;

public class RecordsFromAFile {

    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        start(scanner);
    }

    private static void start(Scanner reader) throws IOException {
        System.out.println("Name of the file: ");
        String passedFile = reader.nextLine();
        Scanner file = new Scanner(Paths.get(passedFile));
        while (file.hasNext()) {
            String text = file.nextLine();
            String[] database = text.split(",");
            String name = database[0];
            int age = Integer.valueOf(database[1]);
            if (age == 0) {
                System.out.println(name + ", age: " + age + " years");
            } else if (age > 1) {
                System.out.println(name + ", age: " + age + " years");
            } else if (age == 1) {
                System.out.println(name + ", age: " + age + " years");
            }
        }
    }
}
