package com.sg.foundations.userinput;

import java.util.Scanner;

public class PassingTheTuringTest {

	public static void main(String[] args) {
		
		Scanner keyboard = new Scanner(System.in);
		
		String name, color, fruit;
		int num;
		
		System.out.println("Hello there!");
		System.out.print("What's your name? ");
		name = keyboard.nextLine();
		
		System.out.println();
		System.out.println("Hi, " + name + "! I'm Alice.");
		System.out.print("What's your favorite color? ");
		color = keyboard.nextLine();
		
		System.out.println();
		System.out.println("Huh, " + color + "? Mine's Electric Lime.");
		
		System.out.println();
		System.out.println("I really like limes. They're my favorite fruit, too.");
		System.out.print("What's YOUR favorite fruit, " + name + "? ");
		fruit = keyboard.nextLine();	
		
		System.out.println();
		System.out.println("Really? " + fruit + "? That's wild!");
		System.out.print("Speaking of favorites, what's your favorite number?");
		num = Integer.parseInt(keyboard.nextLine());
		
		System.out.println();
		System.out.println(num + " is a cool number. Mine's -7.");
		System.out.println("Did you know " + num + " * -7 is " + num*(-7) + "? That's a cool number too!");
		
		System.out.println();
		System.out.println("Well, thanks for talking to me, " + name + "!");
	}
	
}
