import java.util.Random;
import java.util.Scanner;

public class RockPaperScissors {
	// Print choices
	public static void opp_Choice() {
		System.out.println("Type 1 for Rock");
		System.out.println("Type 2 for Paper");
		System.out.println("Type 3 for Scissors");
		System.out.print("Enter your choice: ");
	}
	
	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		Random random = new Random();
		while(true) {
			int numRounds;
			System.out.print("Enter number of rounds of game: ");
			numRounds = keyboard.nextInt();
			if(numRounds<1 || numRounds>10) {
				System.out.println("Invalid input for number of rounds.");
				System.exit(-1);
			}
			int choice, opp_choice;
			int tie=0, userWin=0, computerWin=0;

			for(int i=0; i<numRounds; i++) {
				opp_Choice();
				choice = keyboard.nextInt();
				opp_choice = random.nextInt(3) + 1;
			if(choice==opp_choice) {
				tie++;
				System.out.println("Tie");
			} else if(choice==1) {
				if(opp_choice==2) {
					computerWin++;
					System.out.println("Computer Wins");
				} else if(opp_choice==3) {
					userWin++;
					System.out.println("User Wins");
				}
			} else if(choice==2) {
				if(opp_choice==1) {
					userWin++;
					System.out.println("User Wins");
				} else if(opp_choice==3) {
					computerWin++;
					System.out.println("Computer Wins");
				}
			} else if(choice==3) {
				if(opp_choice==1) {
					computerWin++;
					System.out.println("Computer Wins");
				}
				else if(opp_choice==2) {
					userWin++;
					System.out.println("User Wins");
				}
			}
			}
				System.out.println("Ties: " + tie);
				System.out.println("User wins: " + userWin);
				System.out.println("Computer wins: " + computerWin);
				if(userWin > computerWin)
					System.out.println("Overall winner: User");
				else if(computerWin > userWin)
					System.out.println("Overall winner: Computer");
				else
					System.out.println("Overall winner: TIE");
				System.out.println("Do you want to play again? y/n ");
				String ans = "";
				ans = keyboard.next();
				if(ans.equals("y"))
					continue;
				else
					break;

			}
		keyboard.close();
	}
}
