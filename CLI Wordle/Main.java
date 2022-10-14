import java.util.Scanner;

public class Main
{
	public static void main(String args[])
	{
		ValidateWord		validateWord = new ValidateWord();
		Scanner				scanner = new Scanner(System.in);
		WordGenerator		wordGen = new WordGenerator();
		PrintTips			printTips = new PrintTips();
		String				guessWord;
		String				answer = wordGen.get_word();
		int					gameOnGoing = 6;
		int					valid;

		System.out.println(Color.BCYAN + "Welcome to CLI Wordle - Type a 5 letter word to begin!");
		while (gameOnGoing > 0)
		{
			try
			{
				System.out.print(Color.HWHITE + "> ");
					guessWord = scanner.next();
				System.out.print(Color.RESET + "\n");
				valid = validateWord.validate(guessWord, answer, wordGen, printTips);
				if (valid == 0)
				{
					System.out.print("\033[H\033[2J\n");
					printTips.printTip(guessWord, answer);
					gameOnGoing--;
				}
				else if (valid == 1)
				{
					System.out.print("\033[H\033[2J\n");
					printTips.printTip(guessWord, answer);
					System.out.println("Yay!");
					break ;
				}
			}
			catch (Exception e)
			{
				System.out.println("Sayonara");
				break ;
			}
		}
		scanner.close();
		if (gameOnGoing == 0)
		{
			System.out.println(Color.BRED + "Game Over!");
			System.out.println(Color.BGREEN + "The word was: " + answer.toUpperCase());
		}
	}
}
