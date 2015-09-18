import java.util.Scanner;

public class Multiples
{
	public static void main(String[] args)
	{
		Scanner scanner = new Scanner(System.in);
		int tests = Integer.parseInt(scanner.nextLine());
		for (int i = 0; i < tests; i++)
		{
			long number = Long.parseLong(scanner.nextLine());
			long result = sumOfMultiples(number);
			System.out.println(result);
		}

		scanner.close();
	}

	// http://en.wikipedia.org/wiki/Arithmetic_progression
	private static long sumOfMultiples(long number)
	{
		long result = 0;
		if (number > 3)
		{
			long min = 3;
			long count = (number - 1) / 3;
			long max = number - 1;
			while (max % 3 != 0)
			{
				max--;
			}
			long tempResult = count * (min + max) / 2;
			result += tempResult;
		}
		if (number > 5)
		{
			long min = 5;
			long count = (number - 1) / 5;
			long max = number - 1;
			while (max % 5 != 0)
			{
				max--;
			}
			long tempResult = count * (min + max) / 2;
			result += tempResult;
		}
		if (number > 15)
		{
			long min = 15;
			long count = (number - 1) / 15;
			long max = number - 1;
			while (max % 15 != 0)
			{
				max--;
			}
			long tempResult = count * (min + max) / 2;
			result -= tempResult;
		}

		return result;
	}
}
