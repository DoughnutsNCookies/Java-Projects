import java.io.File;
import java.io.FileNotFoundException;
import java.util.Random;
import java.util.Scanner;
import java.util.LinkedList;

public class WordGenerator
{
	private LinkedList<String> answers = new LinkedList<String>();
	private LinkedList<String> allowed = new LinkedList<String>();
	public WordGenerator()
	{
		try
		{
			File answerFile = new File("dictionary/answers.txt");
			Scanner scanner = new Scanner(answerFile);

			while (scanner.hasNextLine())
				this.answers.add(scanner.nextLine());
			scanner.close();

			File allowedFile = new File("dictionary/allowed.txt");
			scanner = new Scanner(allowedFile);
			while (scanner.hasNextLine())
				this.allowed.add(scanner.nextLine());
			scanner.close();
		}
		catch (FileNotFoundException e)
		{
			System.out.println("An error occurred from get_word.");
			e.printStackTrace();
		}
	}

	public String get_word()
	{
		Random random = new Random();
		int n = random.nextInt(2315);

		return (this.answers.get(n));
	}

	public boolean check_valid_word(String toCheck)
	{
		if (this.allowed.contains(toCheck.toLowerCase()))
			return (true);
		else
			System.out.println("Unga Bunga?\n");
		return (false);
	}
}
