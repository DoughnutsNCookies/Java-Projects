import java.util.LinkedList;
import java.util.Map;
import java.util.HashMap;

public class PrintTips
{
	private LinkedList<String> guessedWordList = new LinkedList<String>();
	private Map<Character, String> wordColors = new HashMap<Character, String>();

	public void printTip(String guessWordIn, String answer)
	{
		PrintKeyboard		printKeyboard = new PrintKeyboard();
		String				guessWord;
		String				filter;
		boolean				dupe = false;
		int					i;
		int					j;
		
		this.guessedWordList.add(guessWordIn);
		for (String string : this.guessedWordList)
		{
			guessWord = string;
			filter = new String();
			i = -1;
			while (++i < 5)
			{
				if (guessWord.charAt(i) == answer.charAt(i))
				{
					this.wordColors.put(guessWord.charAt(i), Color.BGREEN);
					filter += '*';
				}
				else
					filter += answer.charAt(i);
			}
			i = -1;
			System.out.print("   ");
			while (++i < 5)
			{
				if (filter.charAt(i) == '*')
					System.out.print(Color.BGREEN + answer.toUpperCase().charAt(i) + Color.RESET);
				else if (filter.indexOf(guessWord.charAt(i)) >= 0)
				{
					for (j = 0; j < i; j++)
						if (guessWord.charAt(j) == guessWord.charAt(i))
							dupe = true;
					if (dupe)
					{
						System.out.print(Color.BWHITE + guessWord.toUpperCase().charAt(i) + Color.RESET);
						if (this.wordColors.get(guessWord.charAt(i)) == null)
							this.wordColors.put(guessWord.charAt(i), Color.BBLACK);
					}
					else
					{
						if (this.wordColors.get(guessWord.charAt(i)) == null)
							this.wordColors.put(guessWord.charAt(i), Color.BYELLOW);
						System.out.print(Color.BYELLOW + guessWord.toUpperCase().charAt(i) + Color.RESET);
					}
				}
				else
				{
					if (this.wordColors.get(guessWord.charAt(i)) == null)
						this.wordColors.put(guessWord.charAt(i), Color.BBLACK);
					System.out.print(Color.BWHITE + guessWord.toUpperCase().charAt(i) + Color.RESET);
				}
				if (i < 4)
					System.out.print("  ");
				}
			System.out.println();
		}
		System.out.println();
		printKeyboard.printBoard(this.wordColors);
	}
}
