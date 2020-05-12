
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        // Here you can try out the combined functionality of your classes
        Scanner reader = new Scanner (System.in);
        TodoList todo = new TodoList();
        UserInterface ui = new UserInterface(todo,reader);
        ui.start();
        todo.print();
    }
}
