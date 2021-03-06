import java.util.Scanner;

public class HiLo {

	public static void main(String[] args) {
		
		// get ready for the player to use the keyboard
		Scanner scan = new Scanner(System.in);
		
		// play again string
		String playAgain = "";
		//game loop
		do {
			// create a random from 1-100
			int theNumber = (int)(Math.random()*100 + 1);
			
			int guess = 0;
			
			while(guess != theNumber) {
				System.out.println("Guess a number between 1 and 100:");
				
				// get guess
				guess = scan.nextInt();
				//give user feedback
				if (guess < theNumber)
					System.out.println(guess + " is too low. Try again.");
				else if (guess > theNumber)
					System.out.println(guess + " is too high. Try again.");
				else
					System.out.println(guess + " is correct! You win!");
			} // end of while loop
			
			// ask for y to play again
			System.out.println("Whould you like to play agian? (y/n)");
			playAgain = scan.next();
			
			} while(playAgain.equalsIgnoreCase("y"));
			System.out.println("Thank you for playing! Goodbye.");
	
		
	}

}
