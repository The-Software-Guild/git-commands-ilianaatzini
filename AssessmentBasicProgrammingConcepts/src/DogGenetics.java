import java.util.Random;
import java.util.Scanner;

public class DogGenetics {
	public static void main(String[] args){

		Scanner keyboard = new Scanner(System.in);
		System.out.println("What is your dog's name?");

		// Request dog's name
		String name = keyboard.nextLine();

		System.out.println("Well then, I have this highly reliable report on " + name + "'s prestigious background right here.");

		System.out.println("\n\nSir " + name + " is\n\n");

		//Generating random numbers
		Random randomNum = new Random();

		// Initialize variables
		int sum = 0;
		int breed1 = 0;
		int breed2 = 0;
		int breed3 = 0;
		int breed4 = 0;
		int breed5 = 0;

		// Looping until the sum equals to 100%
		while(sum != 100){
			breed1 = randomNum.nextInt(100);
			breed2 = randomNum.nextInt(100-breed1);
			breed3 = randomNum.nextInt(100-breed2);  
			breed4 = randomNum.nextInt(100-breed3);
			breed5 = randomNum.nextInt(100-breed4);
			
			sum = breed1 + breed2 + breed3 + breed4 + breed5;
		}
		
		//Printing breeds percentage random results
		System.out.println(breed1 + "% St. Bernard");
		System.out.println(breed2 + "% Chihuahua");
		System.out.println(breed3 + "% Dramatic RedNosed Asian Pug");
		System.out.println(breed4 + "% Common Cur");
		System.out.println(breed5 + "% King Doberman");

		System.out.println("\n\nWow, that's QUITE the dog!");
		
		keyboard.close();
		}

}
