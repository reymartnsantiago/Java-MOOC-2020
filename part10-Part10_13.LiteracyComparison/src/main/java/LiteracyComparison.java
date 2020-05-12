
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class LiteracyComparison {

    public static void main(String[] args) {
        List<String> tes = new ArrayList<>();
        try {
            // reading the "presidents.txt" file line by line
            Files.lines(Paths.get("literacy.csv"))
                    // splitting the row into parts on the ";" character
                    .map(row -> row.split(",")) // deleting the split rows that have less than two parts (we want the rows to always contain both the name and the birth year)
                    .sorted((p1, p2) -> {
                        return p1[5].compareTo(p2[5]);
                    })
                    // and finally add the persons to the list1
                    // public Book(String name, int ReleaseYear, int pages, String author) {111
                    //3 + (4) +"," + 2 + "," + 0 + "."

                    .map(nat -> nat[3] + " (" + nat[4] + "),"+ nat[2].replace(" (%)", ", ")+ nat[5])
                    .forEach(nat -> System.out.println(nat));

        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
