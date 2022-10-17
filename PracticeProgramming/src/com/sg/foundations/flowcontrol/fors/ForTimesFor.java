package com.sg.foundations.flowcontrol.fors;

import java.util.Scanner;

public class ForTimesFor {
	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		int num, ans, score = 0;
		System.out.print("Which times table shall I recite? ");
		num = keyboard.nextInt();
		
		for (int i = 1; i < 16; i++) {
			System.out.print(i + " * " + num + " is: ");
			ans = keyboard.nextInt();
			if (ans == i*num) {
				System.out.println("Correct!");
				score++;
			} else {
				System.out.println("Sorry no, the answer is: " + i*num);
			}
		}
		System.out.println("You got " + score + " correct.");
	}
}
