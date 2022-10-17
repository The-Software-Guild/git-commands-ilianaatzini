package com.sg.foundations.flowcontrol.fors;

import java.util.Scanner;

public class ForTimes {
	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		int num;
		System.out.print("Which times table shall I recite? ");
		num = keyboard.nextInt();
		
		for (int i = 1; i < 16; i++) {
			System.out.println(i + " * " + num + " = " + i*num);
		}
	}
}
