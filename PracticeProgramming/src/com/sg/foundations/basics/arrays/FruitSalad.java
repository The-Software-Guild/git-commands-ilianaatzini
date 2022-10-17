package com.sg.foundations.basics.arrays;

import java.util.Arrays;

public class FruitSalad {
	public static void main(String[] args) {
        String[] fruit = {"Kiwi Fruit", "Gala Apple", "Granny Smith Apple", "Cherry Tomato", "Gooseberry", "Beefsteak Tomato", "Braeburn Apple", "Blueberry", "Strawberry", "Navel Orange", "Pink Pearl Apple",  "Raspberry", "Blood Orange", "Sungold Tomato", "Fuji Apple", "Blackberry", "Banana", "Pineapple", "Florida Orange", "Kiku Apple", "Mango", "Satsuma Orange", "Watermelon", "Snozzberry"};

        String[] fruitSalad = new String[12];

        // Code Recipe for fruit salad should go here!
        Arrays.sort(fruit);
        
        int numOfApples = 0;
        int numOfOranges = 0;
        int numOfFruits = 0;
        
        for (int i=0; i<fruit.length; i++) {
        	String fruitName = fruit[i];
        	if (fruitName.contains("Apple") && numOfFruits < 12) {
        		if (numOfApples < 3) {
        			numOfApples++;
        			fruitSalad[numOfFruits] = fruitName;
        			numOfFruits++;
        		}
        	} else if (fruitName.contains("Orange") && numOfFruits < 12) {
        		if (numOfOranges < 2) {
        			numOfOranges++;
        			fruitSalad[numOfFruits] = fruitName;
        			numOfFruits++;
        		}
        	} else if (!fruitName.contains("Tomato") && numOfFruits < 12) {
        		fruitSalad[numOfFruits] = fruitName;
    			numOfFruits++;
        	}
        }
        
        for (int i=0; i < fruitSalad.length; i++) {
        	System.out.println((i+1) + ". " + fruitSalad[i]);
        }
    }

}
