package com.sg.foundations.flowcontrol.whiles;

import java.util.Scanner;

public class StayPositive {
	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		
		int num, count =0;
		
		System.out.print("What number should I count down from? ");
		num = Integer.parseInt(keyboard.nextLine());
		
		if(num >= 0) {
			while (num>=0) {
				if(count < 10) {
					System.out.print(num + " ");
				} else {
					System.out.println(num + " ");
					count=0;
				}
				num--;
				count++;
			}
			System.out.println("");
			System.out.println("Blast off");	
		} else {
			System.out.println("Please input a positive number!");
		}
	}
}
