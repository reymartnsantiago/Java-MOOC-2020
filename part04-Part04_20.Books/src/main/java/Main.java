
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner reader = new Scanner(System.in);
        List<Book> database = new ArrayList<>();

        while (true) {
            System.out.println("Title: ");
            String title = reader.nextLine();
            if (title.isEmpty()) {
                break;
            } else {
                System.out.println("Pages: ");
                int page = Integer.valueOf(reader.nextLine());
                System.out.println("Publication Year: ");
                int year = Integer.valueOf(reader.nextLine());
                database.add(new Book(title, page, year));
            }
        }

        System.out.println("What information will be printed?");
        String answer = reader.nextLine();
        if (answer.toLowerCase().equals("everything")) {
            for (Book obj : database) {
                System.out.println(obj.toString());
            }
        } else if (answer.toLowerCase().equals("name")) {
            for (Book obj: database){
                System.out.println(obj.getBook());
            }
        }
    }
}
