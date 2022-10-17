package com.sg.foundations.flowcontrol.whiles;

import java.util.Scanner;

public class RollerCoaster {
	public static void main(String[] args) {

        Scanner userInput = new Scanner(System.in);

        System.out.println("We're going to go on a roller coaster...");
        System.out.println("Let me know when you want to get off...!");

        String keepRiding = "y";
        int loopsLooped = 0;
        while (keepRiding.equals("y")) {
            System.out.println("WHEEEEEEEEEEEEEeEeEEEEeEeeee.....!!!");
            System.out.print("Want to keep going? (y/n) :");
            keepRiding = userInput.nextLine();
            loopsLooped++;
        }

        System.out.println("Wow, that was FUN!");
        System.out.println("We looped that loop " + loopsLooped + " times!!");
    }
	
	//When you enter neither "y" or "n" it waits for input displays the Whee line and ends the while loop, showing the two last prints in the end and it displays 1 loop 
	//When we change the condition it automatically skips while loop and input and ends the program by showing the two statements in the end and it displays 0 loops 
}
