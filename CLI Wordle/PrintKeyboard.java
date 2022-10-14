import java.util.Map;

public class PrintKeyboard
{
	private void printBoardLine(Map<Character, String> wordColors, Character[] row)
	{
		for (Character alpha : row)
		{
			if (wordColors.get(alpha) != null)
				System.out.print(wordColors.get(alpha) + Character.toUpperCase(alpha) + " ");
			else
				System.out.print(Color.BWHITE + Character.toUpperCase(alpha) + " ");
		}
	}

	public void printBoard(Map<Character, String> wordColors)
	{
		System.out.println();

		Character[] firstRow = {'q', 'w', 'e', 'r', 't', 'y', 'u', 'i', 'o', 'p'};
		Character[] secondRow = {'a', 's', 'd', 'f', 'g', 'h', 'j', 'k', 'l'};
		Character[] thirdRow = {'z', 'x', 'c', 'v', 'b', 'n', 'm'};

		printBoardLine(wordColors, firstRow);
		System.out.print("\n ");
		printBoardLine(wordColors, secondRow);
		System.out.print("\n   ");
		printBoardLine(wordColors, thirdRow);
		System.out.println("\n" + Color.RESET);
	}	
}
