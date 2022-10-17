package com.sg.foundations.flowcontrol.whiles;

public class LovesMe {
	public static void main(String[] args) {
		System.out.println("Well here goes nothing...");
		
		int petals=34, count = 1;
		
		while (petals>0) {
			if (count<2) {
				System.out.println("It loves me NOT!");
			} else {
				System.out.println("It LOVES me !");
				count=0;
			}
			petals--;
			count++;
		}
		System.out.println("I knew it! It LOVES ME!");
	}
	// While loop to keep track of the count.
}
