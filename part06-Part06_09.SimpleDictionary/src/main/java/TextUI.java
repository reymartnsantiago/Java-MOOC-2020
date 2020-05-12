
import java.util.HashMap;
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Cavitecity
 */
public class TextUI {

    private Scanner reader;
    private SimpleDictionary obj;

    public TextUI(Scanner reader, SimpleDictionary obj) {
        this.reader = reader;
        this.obj = obj;

    }

    public void start() {

        while (true) {
            System.out.println("Command: ");
            String input = reader.nextLine();
            if (input.equals("end")) {
                System.out.println("Bye bye!");
                break;
            } else if (input.equals("add")) {
                add(reader);
            } else if (input.toLowerCase().trim().equals("search")) {
                search(reader);
            } else {
                System.out.println("Unknown command");
            }

        }
    }

    private void add(Scanner reader) {
        System.out.println("Word: ");
        String word = reader.next();
        System.out.println("Translation: ");
        String translation = reader.next();
        obj.add(word, translation);
    }

    public void search(Scanner reader) {
        System.out.println("To be translated: ");
        String text = reader.next();
        if (obj.translate(text) == null) {
            System.out.println("Word " + text + " was not found");

        }else{
            System.out.println("Translation: "+ obj.translate(text));
        }
         
                
    }
}
