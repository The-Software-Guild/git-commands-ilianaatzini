package com.sg.foundations.flowcontrol.whiles;

import java.util.Scanner;

public class DoOrDoNot {
	public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Should I do it? (y/n) ");
        boolean doIt;

        if (input.next().equals("y")) {
            doIt = true; // DO IT!
        } else {
            doIt = false; // DONT YOU DARE!
        }

        boolean iDidIt = false;

        //do {
          //  iDidIt = true;
            //break;
        //} while (doIt);
        
        while(doIt) {
        	iDidIt = true;
        	break;
        }

        if (doIt && iDidIt) {
            System.out.println("I did it!");
        } else if (!doIt && iDidIt) {
            System.out.println("I know you said not to ... but I totally did anyways.");
        } else {
            System.out.println("Don't look at me, I didn't do anything!");
        }
    }
	
	// It prints out the I did it!
	// It prints out the I know you said not to ... but I totally did anyways.
	// It prints the same I did it!
	// It prints out Don't look at me, I didn't do anything!
}
