import java.util.Scanner;
import java.util.Random;

public class LuckySevens {
	public static void main (String [] args) {
		  
	      Scanner keyboard = new Scanner(System.in);
	      Random random = new Random();
	   
	      int die1, die2, dollars, rolls, newDollars, maxRolls;

	      // Request dollars available
	      System.out.print("How many dollars do you have? ");
	      dollars = keyboard.nextInt();
	   
	      // Initialize variables
	      newDollars = dollars;
	      maxRolls = 0;
	      rolls = 0;
	   
	      // Loop there is no money left   
	      while (dollars > 0){
	         rolls++;
	     
	         // Roll the dice.
	         die1 = random.nextInt (6) + 1; // 1-6 
	         die2 = random.nextInt (6) + 1; // 1-6
	     
	         // Calculate the winnings or losses
	         if (die1 + die2 == 7)
	            dollars += 4;
	         else 
	            dollars -= 1; 

	         // If this is a new maximum, remember it  
	         if (dollars > newDollars){
	            newDollars = dollars;
	            maxRolls = rolls;
	         }
	      }
	   
	      // Print out the results
	      System.out.println("You are broke after " + rolls + " rolls.\n");
	      System.out.println("You should have quit after " + maxRolls + " rolls when you had $" + newDollars + ".");
	   }
}
