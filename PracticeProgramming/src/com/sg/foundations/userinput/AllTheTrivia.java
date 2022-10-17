package com.sg.foundations.userinput;

import java.util.Scanner;

public class AllTheTrivia {
	public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);

        String answer, planet, volcano, abundantElement;

        System.out.print("What unit is equivalent to 1,024 Gigabytes? ");
        answer = keyboard.nextLine();
        
        System.out.print("Which planet is the only one that rotates clockwise in our Solar System? ");
        planet = keyboard.nextLine();
        
        System.out.print("The largest volcano ever discovered in our Solar System is located on which planet? ");
        volcano = keyboard.nextLine();
        
        System.out.print("What is the most abundant element in the earth's atmosphere? ");
        abundantElement = keyboard.nextLine();
        
        System.out.println("");
        System.out.println("Wow, 1,024 Gigabytes is a " + volcano + "!");
        System.out.println("I didn't know that the largest ever volcano was discovered on " + answer + "!");
        System.out.println("That's amazing that " + planet + " is the most abundant element in the atmosphere...");
        System.out.println(abundantElement + " is the only planet that rotates clockwise, neat!");
        
	}
}
