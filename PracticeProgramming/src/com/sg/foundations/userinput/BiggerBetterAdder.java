package com.sg.foundations.userinput;

import java.util.Scanner;

public class BiggerBetterAdder {
	public static void main(String[] args) {
		
		Scanner keyboard = new Scanner(System.in);
		
		int num1, num2, num3, sum;
		
		System.out.println("Please enter the first number: ");
		num1 = Integer.parseInt(keyboard.nextLine());
		
		System.out.println("Please enter the second number: ");
		num2 = Integer.parseInt(keyboard.nextLine());
		
		System.out.println("Please enter the third number: ");
		num3 = Integer.parseInt(keyboard.nextLine());
		
		sum = num1 + num2 + num3;
		
		System.out.println(num1 + " + " + num2 + " + " + num3 + " = " + sum);
	}
}
