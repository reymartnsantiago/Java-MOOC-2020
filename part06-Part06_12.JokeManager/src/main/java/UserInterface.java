
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

    private JokeManager jokeObj;
    private Scanner reader;

    public UserInterface(JokeManager jokeObj, Scanner reader) {
        this.jokeObj = jokeObj;
        this.reader = reader;
    }

    public void start() {
        while (true) {
            System.out.println("Commands:\n"
                    + "1 - add a joke\n"
                    + "2 - draw a joke\n"
                    + "3 - list jokes\n"
                    + "X - stop");
            String command = reader.nextLine();
            if(command.toUpperCase().equals("X")){
                break;
            }else if(command.toLowerCase().equals("1")){
                add(reader);
            }else if(command.toLowerCase().equals("2")){
                drawJokes();
            }else if(command.toLowerCase().equals("3")){
                printJokes();
            }
        }

    }
public void add(Scanner reader){
    System.out.println("Write the joke to be added:");
    String joke = reader.nextLine();
    jokeObj.addJoke(joke);
}
public void printJokes(){
    jokeObj.printJokes();
}
public void drawJokes(){
    System.out.println(jokeObj.drawJoke());
}
}
