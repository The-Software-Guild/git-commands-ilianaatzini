package com.sg.foundations.flowcontrol.whiles;

public class WaitAWhile {
	public static void main(String[] args) {

        int timeNow = 5;
        int bedTime = 10;

        while (timeNow < bedTime) {
            System.out.println("It's only " + timeNow + " o'clock!");
            System.out.println("I think I'll stay up just a liiiiittle longer....");
            timeNow++; // Time passes
        }

        System.out.println("Oh. It's " + timeNow + " o'clock.");
        System.out.println("Guess I should go to bed ...");
        
        // It will continue to display the hours until 11 o'clock which would be the new bedtime
        // It will only show "Oh. It's 11 o'clock. Guess I should go to bet", output.
        // It will create an infinite loop as the condition of the while loop will never turn false to end the loop.
    }
}
