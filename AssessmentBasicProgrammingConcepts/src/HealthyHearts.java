import java.util.Scanner;

public class HealthyHearts {
	public static void main(String[] args) {
	    Scanner keyboard = new Scanner(System.in);
	    
	    System.out.println("What is your age?");
	    
	    // Request age
	    int age = Integer.parseInt(keyboard.nextLine());
	    
	    // Initializing variable
	    int maxHeartRate = 220-age;
	    
	    // Calculating range and change it into an integer
	    int minRange = (int) (maxHeartRate*0.5);
	    int maxRange = (int) (maxHeartRate*0.85);
	    
	    // Printing out results
	    System.out.println("Your maximum heart rate should be "+maxHeartRate+" beats per minute");
	    System.out.println("Your target HR Zone is "+minRange+" - "+maxRange+" beats per minute");
		
	    keyboard.close();
	}
}
