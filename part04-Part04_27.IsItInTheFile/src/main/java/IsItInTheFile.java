
import java.io.IOException;
import java.nio.file.Paths;
import java.util.Scanner;

public class IsItInTheFile {

    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Name of the file:");
        String file = scanner.nextLine();

        System.out.println("Search for:");
        String searchedFor = scanner.nextLine();
        readFile(file, searchedFor);
    }

    private static void readFile(String file, String searchedFor) {
        try {
            boolean hasEnd = false;
            Scanner newFile = new Scanner(Paths.get(file));
            while (newFile.hasNext()) {
                String text = newFile.nextLine();
                if (!text.isEmpty()) {
                    if (text.equals(searchedFor)) {
                        System.out.println("Found!");
                        hasEnd = false;
                        break;
                    } else {
                        hasEnd = true;
                    }
                }
            }
            if (hasEnd) {
                System.out.println("Not found.");
            }

        } catch (Exception e) {
            System.out.println("Reading the file " + file + " failed.");

        }

    }
}
