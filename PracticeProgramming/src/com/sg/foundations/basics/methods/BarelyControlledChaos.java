package com.sg.foundations.basics.methods;

public class BarelyControlledChaos {
	public static void main(String[] args) {

        String color = color(); // call color method here
        String animal = animal(); // call animal method again here
        String colorAgain = color(); // call color method again here
        double weight = number(5, 200); // call number method,
            // with a range between 5 - 200
        double distance = number(10, 20); // call number method,
            // with a range between 10 - 20
        double number = number(10000, 20000); // call number method,
            // with a range between 10000 - 20000
        double time = number(2, 6); // call number method,
            // with a range between 2 - 6            

        System.out.println("Once, when I was very small...");

        System.out.println("I was chased by a " + color + ", "
            + weight + "lb " + " miniature " + animal
            + " for over " + distance + " miles!!");

        System.out.println("I had to hide in a field of over "
            + number + " " + colorAgain + " poppies for nearly "
            + time + " hours until it left me alone!");

        System.out.println("\nIt was QUITE the experience, "
            + "let me tell you!");
    }

    public static String color() {
    	String color1 = black;
    	String color2 = brown;
    	String color3 = grey;
    	return ;
    }
    
    public static String animal() {
    	return ;
    }
    
    public static double number(double range1, double renage2) {
    	return (int) ((Math.random() * (renage2 - range1)) + range1);
    }
}
