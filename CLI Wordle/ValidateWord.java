public class ValidateWord
{
	public int validate(String guessWord, String answer, WordGenerator wordGen, PrintTips printTips)
	{
		if (guessWord.length() != 5)
		{
			System.out.println("Cannot count to 5?");
			return (-1);
		}
		if (!guessWord.matches("^[a-zA-Z]*$"))
		{
			System.out.println("Ching Chong Ling Long?");
			return (-1);
		}
		if (guessWord.equals(answer))
			return (1);
		if (wordGen.check_valid_word(guessWord))
			return (0);
		return (-1);
	}	
}
