package com.sg.foundations.flowcontrol.whiles;

import java.util.Random;

public class MaybeItLovesMe {
	public static void main(String[] args) {
		System.out.println("Well here goes nothing...");
		
		Random petals = new Random();
		int count = 1;
		
		int numOfPetals = petals.nextInt((89 - 13) + 1) + 13;
		
		while (numOfPetals>0) {
			if (count<2) {
				System.out.println("It loves me NOT!");
			} else {
				System.out.println("It LOVES me !");
				count=0;
			}
			numOfPetals--;
			count++;
		}
		if (count == 1) {
			System.out.println("Oh, wow! It really LOVES me!");
		} else {
			System.out.println("Awwww, bummer.");
		}
	}
	// While loop to keep track of the count.
}
