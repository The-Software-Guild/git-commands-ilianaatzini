package com.sg.foundations.flowcontrol.ifs;

import java.util.Scanner;

public class GuessMe {
	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		int guess, num = 20;
		
		System.out.println("I've chosen a number. Betcha can't guess it!");
		System.out.print("Your guess: ");
		guess = Integer.parseInt(keyboard.nextLine());
		
		if (num > guess) {
			System.out.print(guess + "? Ha, nice try - too low! I chose " + num);
		}
		if (num < guess) {
			System.out.print(guess + "? Too bad, way too high. I chose " + num);
		} 
		if (num == guess) {
			System.out.println("Wow, nice guess! That was it!");
		}
		
	}
}
