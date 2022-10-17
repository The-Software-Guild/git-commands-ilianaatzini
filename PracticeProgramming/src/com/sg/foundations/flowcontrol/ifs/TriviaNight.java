package com.sg.foundations.flowcontrol.ifs;

import java.util.Scanner;

public class TriviaNight {
	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		
		int ans1, ans2, ans3;
		int score = 0;
		
		System.out.println("It's TRIVIA NIGHT! Are you ready?!");
		System.out.print("FIRST QUESTION!\n" + 
				"What is the Lowest Level Programming Language?\n" + 
				"1) Source Code		2) Assembly Language\n" + 
				"3) C#				4) Machine Code\n" + 
				"\n" + 
				"YOUR ANSWER: ");
		ans1 = keyboard.nextInt();
		if (ans1 == 4) {
			score++;
			System.out.println("CORRECT!");
		} else {
			System.out.println("INCORRECT");
		}
		
		System.out.print("SECOND QUESTION!\n" + 
				"Website Security CAPTCHA Forms Are Descended From the Work of?\n" + 
				"1) Grace Hopper		2) Alan Turing\n" + 
				"3) Charles Babbage		4) Larry Page\n" + 
				"\n" + 
				"YOUR ANSWER: ");
		ans2 = keyboard.nextInt();
		if (ans2 == 2) {
			score++;
			System.out.println("CORRECT!");
		} else {
			System.out.println("INCORRECT");
		}
		
		System.out.print("LAST QUESTION!\n" + 
				"Which of These Sci-Fi Ships Was Once Slated for a Full-Size Replica in Las Vegas?\n" + 
				"1) Serenity			2) The Battlestar Galactica\n" + 
				"3) The USS Enterprise	4) The Millennium Falcon\n" + 
				"\n" + 
				"YOUR ANSWER: ");
		ans3 = keyboard.nextInt();
		if (ans3 == 3) {
			score++;
			System.out.println("CORRECT!");
		} else {
			System.out.println("INCORRECT");
		}
		
		if (score == 3) {
			System.out.print("Nice job - you got " + score + " correct!");
		} else if (score == 2) {
			System.out.print("Good job - you got " + score + " correct!");
		} else if (score == 1) {
			System.out.print("Good effort - you got " + score + " correct.");
		} else {
			System.out.println("You could do better - you got " + score);
		}
		
	}
}
