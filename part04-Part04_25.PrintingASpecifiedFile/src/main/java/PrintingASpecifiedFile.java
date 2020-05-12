
import java.io.IOException;
import java.nio.file.Paths;
import java.util.Scanner;

public class PrintingASpecifiedFile {

    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        start(scanner);
    }

    public static void start(Scanner reader) throws IOException {
        System.out.println("Which file should have its contents printed?");
        String file = reader.nextLine();

        Scanner scan = new Scanner(Paths.get(file));
        while (scan.hasNext()) {
            System.out.println(scan.nextLine());
        }
        System.out.println("Thaml you!");
    }
}
