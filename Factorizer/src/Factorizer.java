import java.util.Scanner;

public class Factorizer {
	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		int num, sum = 0, p = 2;
		
		System.out.print("What number would you like to factor? ");
		num = Integer.parseInt(keyboard.nextLine());
		
		System.out.println("The factors of " + num + " are:");
		
		int count = 0;
		for (int i = 1; i < num; ++i) {

		      if (num % i == 0) {
		        System.out.print(i + " ");
		        sum = sum + i;
		        count++;
		      }
		}
		
		System.out.println("");
		System.out.println(num + " has " + count + " factors.");
		
		if (sum == num) {
            System.out.println(num + " is a perfect number.");
        } else {
            System.out.println(num + " is not a perfect number.");
        }
		
		boolean flag = false;
	    while (p <= num / 2) {
	      if (num % p == 0) {
	        flag = true;
	        break;
	      }

	      ++p;
	    }

	    if (!flag)
	      System.out.println("The "+ num +" is a prime number.");
	    else
	      System.out.println("The "+ num +" is not a prime number.");
		       
	}
}
