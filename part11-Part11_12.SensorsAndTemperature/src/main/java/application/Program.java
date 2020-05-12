package application;

import java.util.Scanner; // i imported the scanner because it was missing

public class Program {

    public static void main(String[] args) { // i put the array in the correct place
        Scanner input = new Scanner(System.in);
        final int RequiredCREDITS = 121;
        final int CREDIT_LIMIT = 200;

        String a;
        double credits; // changed the variable to double
        do {
            //changed from int to double in order to match the next line and changed the variable name so it doesnt conflict with others
            credits = input.nextDouble();
        } while (credits <= 0 && credits > CREDIT_LIMIT); //i changed the name of the variable to match the one assigned 
        {
            System.out.println("In order to graduate you need:" + (RequiredCREDITS - credits) + " credit/s"); // i put the subtraction in a parenthesis
            // i closed my scanner

            /* Use this information for the if statements below
         * 
         * freshman:     0-29 
         * sophomore:   30-59
         * junior:      60-89
         * senior:      90-121
         * 122 and up over-credit
             */
            if (credits >= 0 && credits <= 29);
            System.out.println("You are still a freshman...");

            if (credits >= 30 || credits <= 59) {
                System.out.println("You are a sophomore...");
            }

            if (credits > 60 && credits <= 89) // added the = sign
            {
                System.out.println("You are a junior...");
            }

            if (credits >= 90) // added the = sign
            {
                System.out.println("You are a senior... almost there!");
            } else {
                System.out.println("You are overcredit! you could have graduated!!!");
            }
          

        }
  System.out.println("Do you want to re-run the program: (Y/N)");
            a = input.nextLine(); //corrected the name of Input to input
            if (a == "N") {
               
            }
    }

    public static boolean ValidRange(int numberToValidate, int lowLimit, int upperLimit) {
        if (numberToValidate < lowLimit || numberToValidate > upperLimit) {
            return false;
        } else {
            return true;
        }
    }

}
