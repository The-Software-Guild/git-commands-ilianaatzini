package com.sg.foundations.flowcontrol.ifs;

import java.util.Scanner;

public class BirthStones {
	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		int num;
		
		System.out.println("What month's birthstone do you want to know? ");
		num = Integer.parseInt(keyboard.nextLine());
		
		if (num == 1) {
			System.out.println("January's birthstone is Garnet");
		} else if (num == 2) {
			System.out.println("February's birthstone is Amethyst");
		} else if (num == 3) {
			System.out.println("March's birthstone is Aquamarine");
		} else if (num == 4) {
			System.out.println("April's birthstone is Diamond");
		} else if (num == 5) {
			System.out.println("May's birthstone is Emerald");
		} else if (num == 6) {
			System.out.println("June's birthstone is Pearl");
		} else if (num == 7) {
			System.out.println("July's birthstone is Ruby");
		} else if (num == 8) {
			System.out.println("August's birthstone is Peridot");
		} else if (num == 9) {
			System.out.println("September's birthstone is Sapphire");
		} else if (num == 10) {
			System.out.println("October's birthstone is Opal");
		} else if (num == 11) {
			System.out.println("November's birthstone is Topaz");
		} else if (num == 12) {
			System.out.println("December's birthstone is Turquoise");
		} else {
			System.out.println("I think you must be confused, " + num + " doesn't match a month.");
		}
		
	}
}
