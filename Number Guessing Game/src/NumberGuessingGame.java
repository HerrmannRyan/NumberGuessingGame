import java.util.Scanner;

public class NumberGuessingGame
	{

		public static void main(String[] args)
			{

				Scanner userInput = new Scanner (System.in);
				
				//Ask for name
				System.out.println("Hello, What is your name?");
				String userName = userInput.nextLine();
				
				// True or false for the while loop
				boolean loopForGuessing = false;
				
				// True or False for Playing
				
				boolean playerIsStillGuessing = true;
				
				//State that they need to add a number
				System.out.println("Hello " + userName + " What difficulty do you want? Easy (1), Medium, (2) or Hard (3)");
				
				//Create integer for number guessing
				int randomNumberDifficulty = userInput.nextInt();
				int randomNumberDifficultyRange = 0;
				
				//Creating the selecting levels
				
				loopForGuessing = true;
				
				if(randomNumberDifficulty == 1)
				{
					randomNumberDifficultyRange = 10;
				}
					
				if(randomNumberDifficulty == 2)
				{
					randomNumberDifficultyRange = 50;
				}	
					
				if(randomNumberDifficulty == 3)
				{
					randomNumberDifficultyRange = 100;
				}
				
				//Create Random number
				int randomNumber = (int)(Math.random()*randomNumberDifficultyRange + 1);
				
				
				int guessCounter = 0;
				
				//Says what difficulty you are playing on and what the range is as well as for to keep playing
				while (playerIsStillGuessing)
				{
				System.out.println("You are playing where I am guessing a number between 0 and " + randomNumberDifficultyRange + ". Choose your first number and keep guessing until you get my number!");
				loopForGuessing = true;
				//While loop for the number
						while (loopForGuessing)
						{
						// Asking for new number
							int userGuess = userInput.nextInt();
						
							if(userGuess > randomNumber)
							{
								System.out.println("Your guess was too high!");
								guessCounter++;
							}
							
							if (userGuess < randomNumber)
							{
								System.out.println("Your guess is too low!");
								guessCounter++;
							}
							
							if (randomNumber == userGuess)
							{
								System.out.println("You got the number, and it took you " + guessCounter + " times to guess my number. \n My number was : " + randomNumber + 
										"\n Would you like to play again? (1) Yes (2) No.");
								loopForGuessing = false;
								
								int playerResponseToKeepPlaying = userInput.nextInt();
								
								if(playerResponseToKeepPlaying == 1)
								{
										playerIsStillGuessing = true;
										loopForGuessing = false;
								}
								
								if(playerResponseToKeepPlaying == 2)
								{
									playerIsStillGuessing = false;
									System.out.println("Thanks for playing!");
								}
								
							}	
			
						}
				}		


			}

	}
