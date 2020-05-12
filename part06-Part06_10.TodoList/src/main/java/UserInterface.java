
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
public class UserInterface {

    private Scanner reader;
    private TodoList todo;

    public UserInterface(TodoList todo, Scanner reader) {
        this.reader = reader;
        this.todo = todo;
    }

    public void start() {
        while (true) {
            System.out.println("Command: ");
            String command = reader.nextLine();

            if (command.equals("stop")) {
                break;
            } else if (command.equals("add")) {
                add(reader);
            } else if (command.equals("remove")) {
                remove(reader);
            } else if (command.equals("list")) {
                list();
            }
        }
    }

    public void add(Scanner reader) {
        System.out.println("To add: ");
        String value = reader.nextLine();
        todo.add(value);
    }

    public void list() {
        todo.print();
    }

    public void remove(Scanner reader) {
        System.out.println("Which one is removed? ");
        int value = Integer.valueOf(reader.next());
        todo.remove(value);
    }
}
