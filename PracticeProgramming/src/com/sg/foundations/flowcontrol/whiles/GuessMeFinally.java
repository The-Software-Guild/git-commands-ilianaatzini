package com.sg.foundations.flowcontrol.whiles;

import java.util.Scanner;

public class GuessMeFinally {
	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		int guess = 0, num = 20;
		
		System.out.println("I've chosen a number. Betcha can't guess it!");
		System.out.print("Your guess: ");
		guess = Integer.parseInt(keyboard.nextLine());
		
		if (num == guess) {
			System.out.println("Wow, nice guess! That was it!");
		} else {
			while(guess!=num) {
				System.out.print("Your guess: ");
				guess = Integer.parseInt(keyboard.nextLine());
				System.out.println("");
				
				if (num > guess) {
					System.out.println(guess + "? Ha, nice try - too low! Try again!");
				}
				if (num < guess) {
					System.out.println(guess + "? Too bad, way too high. Try again!");
				}
			}
			System.out.println("Finally! It's about time you got it!");
		}
		
	}
}
