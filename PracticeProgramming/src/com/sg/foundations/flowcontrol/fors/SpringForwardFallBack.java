package com.sg.foundations.flowcontrol.fors;

public class SpringForwardFallBack {
	public static void main(String[] args) {

        System.out.println("It's Spring...!");
        for (int i = 1; i < 11; i++) {
            System.out.print(i + ", ");
        }

        System.out.println("\nOh no, it's fall...");
        for (int i = 10; i > 0; i--) {
            System.out.print(i + ", ");
        }
        
        // First loop 0-9, Second loop 10-1
        //Just by changing i= 1 and i < 11
    }
}
