package com.sg.foundations.userinput;

import java.util.Scanner;

public class DoItBetter {
	public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);

        double numOfMiles;
        int numOfHotDogs, numOfLanguages;
        
        System.out.print("How many miles can you run? ");
        numOfMiles = Double.parseDouble(keyboard.nextLine());
        System.out.print("Hah I can run " + (numOfMiles * 2 + 1));
        
        System.out.println("");
        System.out.print("How many hot dogs can you eat? ");
        numOfHotDogs = Integer.parseInt(keyboard.nextLine());
        System.out.print("Hah I can eat " + (numOfHotDogs * 2 + 1));
        
        System.out.println("");
        System.out.print("How many languages do you know? ");
        numOfLanguages = Integer.parseInt(keyboard.nextLine());
        System.out.print("Hah I know " + (numOfLanguages * 2 + 1));
	}
}
