package com.sg.foundations.userinput;

import java.util.Scanner;

public class HealthyHearts {
	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		int age, maxRate;
		
		System.out.println("What is your age? ");
		age = Integer.parseInt(keyboard.nextLine());
		
		maxRate = 220-age;
		double minTarget = maxRate * 0.5;
		double maxTarget = maxRate * 0.85;
		
		System.out.println("Your maximum heart rate should be " + maxRate + " beats per minute.");
		System.out.println("Your target HR Zone is " + minTarget + " - " + maxTarget + " beats per minute.");		
	}
}
