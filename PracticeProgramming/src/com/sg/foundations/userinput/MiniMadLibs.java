package com.sg.foundations.userinput;

import java.util.Scanner;

public class MiniMadLibs {
	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		
		String noun1, noun2, adjective1, adjective2, plNoun, plNoun2, plNoun3, verb, sverb;
		int num;
		
		System.out.println("Let's play MAD LIBS!");
		
		System.out.println("I need a noun: ");
		noun1 = keyboard.nextLine();
		System.out.println("Now an adjective: ");
		adjective1 = keyboard.nextLine();
		System.out.println("Another noun: ");
		noun2 = keyboard.nextLine();
		System.out.println("And a number: ");
		num = Integer.parseInt(keyboard.nextLine());
		System.out.println("Another adjective: ");
		adjective2 = keyboard.nextLine();
		System.out.println("A plural noun: ");
		plNoun = keyboard.nextLine();
		System.out.println("Another one: ");
		plNoun2 = keyboard.nextLine();
		System.out.println("One more: ");
		plNoun3 = keyboard.nextLine();
		System.out.println("A verb (infinitive form): ");
		verb = keyboard.nextLine();
		System.out.println("Same verb (past participle): ");
		sverb = keyboard.nextLine();
		
		System.out.println("");
		System.out.println("*** NOW LETS GET MAD (libs) ***");
		System.out.println(noun1 + ": the " + adjective1 + " frontier. These are the voyages of the starship " + noun2 + ". Its " + num + "-year mission: to explore strange " + adjective2 + " " + plNoun + ", to seek out " + adjective2 + " " + plNoun2 + " and " + adjective2 + " " + plNoun3 + ", to boldly " + verb + " where no one has " + sverb + "  before.");		
	}
}
