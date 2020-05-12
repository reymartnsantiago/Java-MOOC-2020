
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class MainProgram {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Book> arr = new ArrayList<>();
String string = "11111";

if (string.matches("1{2,}")) {
    System.out.println("Correct form.");
} else {
    System.out.println("Incorrect form.");
}
        //start(scanner, arr);
    }

    public static void start(Scanner reader, ArrayList<Book> arr) {
        while (true) {
            System.out.println("Input the name of the book, empty stops: ");
            String bookName = reader.nextLine();
            if (bookName.isEmpty()) {
                break;
            }
            System.out.println("Input the age recommendation: ");
            int age = Integer.valueOf(reader.nextLine());
            arr.add(new Book(bookName, age));
        }
        System.out.println(arr.size() + " books in total.");
        Comparator<Book> comparator = Comparator
                .comparing(Book::getAgeRecommendation)
                .thenComparing(Book::getName);

        Collections.sort(arr, comparator);
//        arr.stream()
////                .sorted((p1, p2) -> {
////                    return p1.getAgeRecommendation() - (p2.getAgeRecommendation());
////                })
////                .sorted((p1, p2) -> {
////                    return p1.getName().compareTo(p2.getName());
////                })
        arr.stream().forEach(name -> System.out.println(name));
    }

}
