/**
* Number Guessing Game : 
* User thinks of a number between 1 and 100. The program has to guess the number.
* For each guess, the user has to key in whether the guess is low, high or correct
* till the program is able to guess the correct number.
* @author Rekha Raj
*/
import java.util.Scanner; 

public class NumberGuessingGame {

	public static void main(String[] args) {		
        int won = -1;
        int trial = 0;        
        int min = 0;
        int max = 100;
        //The program asks the user to think of a number between 1 and 100.
        System.out.println("THINK OF A NUMBER BETWEEN 1 AND 100");
        while (won == -1)
        {
        	Scanner in = new Scanner(System.in);
            trial++;   
            //Average of the min and max numbers is taken as the guess
            int guess = (min + max)/2;
            System.out.println();
            System.out.println("Is the number " + guess + "?.");
            //User needs to enter L for low, H for high or C for correct. Note - Characters are not case sensitive.
            System.out.println("Enter (L)ow or (H)igh or (C)orrect): ");
            String key = in.next();
            if (key.equalsIgnoreCase("L"))
            {
            	//If the guessed number is low, need to make the min value as guessed number + 1.
            	min = guess + 1;
            }
            else if (key.equalsIgnoreCase("H"))
            {
            	//If the guessed number is high, need to make the max value as guessed number - 1.
                max = guess - 1;
            }
            else if (key.equalsIgnoreCase("C"))
            {
            	//If the guessed number is same as the secret number, then print success and exit.
            	won++;
                System.out.println("This program took " + trial + " tries to guess the secret number.");
            }
            else
            {
            	//For all the other inputs by the user, print wrong input message.
            	System.out.println("Wrong input!!! Enter (L)ow or (H)igh or (C)orrect): ");
            }
        }
	}

}
