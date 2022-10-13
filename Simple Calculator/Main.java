import java.util.Scanner;

public class Main
{
	public static void	main(String[] args)
	{
		Scanner 	scanner = new Scanner(System.in);
		Calculator	calc = new Calculator();
		String		op = null;
		int			a = 0;
		int			b = 0;
		System.out.printf("Enter equation (eg. 1 + 2): ");
		try
		{
			a = scanner.nextInt();
			op = scanner.next();
			b = scanner.nextInt();
		}
		catch (Exception e)
		{
			System.out.println("Value declaration failed!");
			return ;
		}
		if (op.charAt(0) == '+')
			System.out.printf("%d\n", calc.add(a, b));
		if (op.charAt(0) == '-')
			System.out.printf("%d\n", calc.sub(a, b));
		if (op.charAt(0) == '*')
			System.out.printf("%d\n", calc.mul(a, b));
		try
		{
			if (op.charAt(0) == '/')
				System.out.printf("%d\n", calc.div(a, b));
			if (op.charAt(0) == '%')
				System.out.printf("%d\n", calc.mod(a, b));
		}
		catch (Exception e)
		{
			System.out.print("Cannot Div and Mod with 0\n");
		}
	}
}
