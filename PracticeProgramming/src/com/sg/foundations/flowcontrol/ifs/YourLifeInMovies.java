package com.sg.foundations.flowcontrol.ifs;

import java.util.Scanner;

public class YourLifeInMovies {
	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		
		String name;
		int yearWasBorn;
		
		System.out.println("Hey, let's play a game! What's your name? ");
		name = keyboard.nextLine();
		
		System.out.print("Ok, " + name + ", when where you born? ");
		yearWasBorn = Integer.parseInt(keyboard.nextLine());
		
		System.out.println("Well " + name + "...");
		if (yearWasBorn < 2005) {
			System.out.println("Did you know that Pixar's 'Up' came out over a decade ago?");
		}
		if (yearWasBorn < 1995) {
			System.out.println("And that the first Harry Potter came out over 15 years ago!");
		}
		if (yearWasBorn < 1985) {
			System.out.println("Also, Space Jam came out not last decade, but the one before THAT.");
		}
		if (yearWasBorn < 1975) {
			System.out.println("The original Jurassic Park release is closer to the first lunar landing than it is to today.");
		}
		if (yearWasBorn < 1965) {
			System.out.println("The MASH TV series has been around for almost half a century!");
		}
	}
}
