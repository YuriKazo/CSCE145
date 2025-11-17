//Jason Lu
import java.util.Random;
import java.util.Scanner;
public class RPSGame {

	public static void main(String[] args) {
		
		Scanner key = new Scanner(System.in);
		Random randomNum = new Random();
		
		String response = "";
		
		do {
			int computerScore = 0;
			int playerScore = 0;
			String computerChoice = "";			
						
			System.out.println("Welcome to a rock, paper, scissors game best 2 out of 3.");
			
			//Starts at round 1 and ends at round 3
			for(int round = 1; round <= 3; round++) {
				System.out.println("\nRound " + round + " of 3");
				System.out.println("What would you like to choose 'Rock' or 'Paper' or 'Scissors'");
				
				String playerChoice = key.next();
				
				//Randomize the computer's choice and set it with switch statement
				int computerPick = randomNum.nextInt(3);
				
				switch(computerPick) {
				case 0:
					computerChoice = "Rock";
					break;
				case 1:
					computerChoice = "Paper";
					break;
				case 2:
					computerChoice = "Scissors";
				}
				
				//Validates if user choose one of the options provided and gives computer score if not
				if(!playerChoice.equalsIgnoreCase("Rock") && !playerChoice.equalsIgnoreCase("Paper") && !playerChoice.equalsIgnoreCase("Scissors")) {
					System.out.println("Invalid choice entered Computer gains a point!");
					System.out.println("Player choose " + playerChoice);
					System.out.println("Computer choose " + computerChoice);
					computerScore = computerScore + 1;
				}
				
				//Gives no one a point if player and computer chooses the same option
				if(playerChoice.equalsIgnoreCase(computerChoice)) {
					System.out.println("Player choose " + playerChoice);
					System.out.println("Computer choose " + computerChoice);
					System.out.println("Draw. Both player and computer choose the same option");
					System.out.println("No one gains a point");
				}
				
				if(playerChoice.equalsIgnoreCase("Rock") && computerChoice.equalsIgnoreCase("Scissors")) {
					System.out.println("Player choose " + playerChoice);
					System.out.println("Computer choose " + computerChoice);
					System.out.println("Player wins this round!");
					playerScore = playerScore + 1;
				}
				else if(playerChoice.equalsIgnoreCase("Rock") && computerChoice.equalsIgnoreCase("Paper")) {
					System.out.println("Player choose " + playerChoice);
					System.out.println("Computer choose " + computerChoice);
					System.out.println("Computer wins this round!");
					computerScore = computerScore + 1;
				}
				
				if(playerChoice.equalsIgnoreCase("Paper") && computerChoice.equalsIgnoreCase("Rock")) {
					System.out.println("Player choose " + playerChoice);
					System.out.println("Computer choose " + computerChoice);
					System.out.println("Player wins this round!");
					playerScore = playerScore + 1;
				}
				else if(playerChoice.equalsIgnoreCase("Paper") && computerChoice.equalsIgnoreCase("Scissors")) {
					System.out.println("Player choose " + playerChoice);
					System.out.println("Computer choose " + computerChoice);
					System.out.println("Computer wins this round!");
					computerScore = computerScore + 1;
				}
				
				if(playerChoice.equalsIgnoreCase("Scissors") && computerChoice.equalsIgnoreCase("Paper")) {
					System.out.println("Player choose " + playerChoice);
					System.out.println("Computer choose " + computerChoice);
					System.out.println("Player wins this round!");
					playerScore = playerScore + 1;
				}
				else if(playerChoice.equalsIgnoreCase("Scissors") && computerChoice.equalsIgnoreCase("Rock")) {
					System.out.println("Player choose " + playerChoice);
					System.out.println("Computer choose " + computerChoice);
					System.out.println("Computer wins this round!");
					computerScore = computerScore + 1;
				}
			}
			//Determines the winner based on the score
			if(playerScore > computerScore) {
				System.out.println("\nPlayer has won the game " + playerScore + " out of 3");
			}
			else if(computerScore > playerScore) {
				System.out.println("\nComputer has won the game " + computerScore + " out of 3");
			}
			else {
				System.out.println("\nPlayer and Computer have the same score so the game is a draw!");
			}
			
			//Ask the user if they want to play again
			System.out.println("Would you like to play another match? 'Yes' or 'No'");
			response = key.next();
				
		} while(response.equalsIgnoreCase("yes"));
		
		System.out.println("Exiting the program!");
		
	}

}
