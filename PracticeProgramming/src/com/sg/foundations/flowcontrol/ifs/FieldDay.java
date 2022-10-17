package com.sg.foundations.flowcontrol.ifs;

import java.util.Scanner;

public class FieldDay {
	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		String a,b,c,d,e;
		
		a="Baggins";
		b="Dresden";
		c="Howl";
		d="Potter";
		e="Vimes";
		
		String name;
		System.out.print("What's your Name? ");
		name=keyboard.nextLine();
		//Program will keep asking Name until -1 is entered

		
		while(!(name.equals("-1"))) {
			if(a.compareTo(name)>=0) {
				System.out.println("Ah You're on Team \"Red Dragons\"\nGood Luck in the Games! ");
			} else if(b.compareTo(name)>=0) {
				System.out.println("Ah You're on Team \"Dark Wizards\"\nGood Luck in the Games! ");
			} else if(c.compareTo(name)>=0) {
				System.out.println("Ah You're on Team \"Moving Castles\"\nGood Luck in the Games! ");
			} else if(d.compareTo(name)>=0) {
				System.out.println("Ah You're on Team \"Golden Snitches\"\nGood Luck in the Games! ");
			} else if(e.compareTo(name)>=0) {
				System.out.println("Ah You're on Team \"Night Guards\"\nGood Luck in the Games! ");
			} else {
				System.out.println("Ah You're on Team \"Black Holes\"\nGood Luck in the Games! ");
			}
			System.out.print("\nWhat's your Name? ");
			name=keyboard.nextLine();
		}
	}
}
