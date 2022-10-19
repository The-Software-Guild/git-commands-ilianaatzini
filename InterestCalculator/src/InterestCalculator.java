import java.util.Scanner;

public class InterestCalculator {
	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		double amount, interestRate, amountEnding=0;
		int years;
		
		// Request initial amount
		System.out.print("How much do you want to invest? ");
		amount = keyboard.nextDouble();
		
		// Request number of years
		System.out.print("How many years are investing? ");
		years = keyboard.nextInt();
		
		// Request annual interest rate
		System.out.print("What is the annual interest rate % growth? ");
		interestRate = keyboard.nextDouble();
		
		System.out.println("");
		System.out.println("Calculating...");
		
		double earned=0;
		for(int i=1; i <= years; i++) {
			System.out.println("Year " + i);
			System.out.println("Began with " + String.format("%.2f",amount));
			
			for(int j=1; j<=4; j++) {
				double q = interestRate/4;
				amountEnding = amount * (1 + (q / 100));
				earned += amountEnding - amount;
				amount = amountEnding;
			}
			
			System.out.println("Earned " + String.format("%.2f",earned));
			System.out.println("Ended with " + String.format("%.2f",amountEnding));
		}
		
	}
}
