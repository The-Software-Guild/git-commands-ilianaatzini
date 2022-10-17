package com.sg.foundations.flowcontrol.methods;

public class BarelyControlledChaos {
    public static void main(String[] args) {

        String color = randomColor(); // call color method here
        String animal = randomAnimal(); // call animal method again here
        String colorAgain = randomColor(); // call color method again here
        int weight = randomNumber(5, 200); // call number method,
                        // with a range between 5 - 200
        int distance = randomNumber(10, 20); // call number method,
                        // with a range between 10 - 20
        int number = randomNumber(10000, 20000); // call number method,
                        // with a range between 10000 - 20000
        int time = randomNumber(2, 6); // call number method,
                        // with a range between 2 - 6

        System.out.println("Once, when I was very small...");//displaying

        System.out.println("I was chased by a " + color + ", "
                + weight + "lb " + " miniature " + animal
                + " for over " + distance + " miles!!");

        System.out.println("I had to hide in a field of over "
                + number + " " + colorAgain + " poppies for nearly "
                + time + " hours until it left me alone!");

        System.out.println("\nIt was QUITE the experience, "
                + "let me tell you!");
    }



    public static String randomColor(){
        int color = (int) (Math.random()*(5-1+1)+1);
        switch (color) {
            case 1: return("red");
            case 2: return("yellow");
            case 3: return("green");
            case 4: return("black");
            case 5: return("blue");
            default: return("brown");
        }
    }

    public static String randomAnimal(){
    	int animal = (int) (Math.random()*(5-1+1)+1);
        switch (animal) {
            case 1: return("fox");
            case 2: return("bear");
            case 3: return("lion");
            case 4:return("hippo");
            case 5: return("kangaroo");
            default: return("bull");
        }
    }

    public static int randomNumber(int min, int max){
        return (int) (Math.random()*(max-min+1)+min);
    }
}
