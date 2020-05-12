
import java.io.IOException;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;

public class StoringRecords {

    public static void main(String[] args) throws IOException {
        Scanner scan = new Scanner(System.in);

        System.out.println("Filename:");
        String file = scan.nextLine();

        ArrayList<Person> records = readRecordsFromFile(file);
        System.out.println("Persons: " + records.size());
        System.out.println("Persons:");
        for (Person person : records) {
            System.out.println(person);

        }
    }

    public static ArrayList<Person> readRecordsFromFile(String file) throws IOException {
        ArrayList<Person> persons = new ArrayList<>();
        Scanner filereader = new Scanner(Paths.get(file));
        while(filereader.hasNext()){
            String value=filereader.nextLine();
            
            String[] format = value.split(",");
            String name = format[0];
            int age=Integer.valueOf(format[1]);
            persons.add(new Person(name,age));
        }
        return persons;

    }
}
