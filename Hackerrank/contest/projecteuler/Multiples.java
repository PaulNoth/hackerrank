package projecteuler;

import java.util.Scanner;

/**
 * 
 * <b>Multiples of 3 and 5</b>
 * <p>
 * If we list all the natural numbers below 10 that are multiples of 3 or 5, we
 * get 3, 5, 6 and 9. The sum of these multiples is 23.
 * </p>
 * <p>
 * Find the sum of all the multiples of 3 or 5 below N.
 * </p>
 * <p>
 * Input Format <br>
 * First line contains T that denotes the number of test cases. This is followed
 * by T lines, each containing an integer, N.
 * </p>
 * <p>
 * Output Format For each test case, print an integer that denotes the sum of
 * all the multiples of 3 or 5 below N.
 * <p>
 * Constraints <br>
 * 1<=T<=105 <br>
 * 1<=N<=109
 * </p>
 * <p>
 * Sample Input <br>
 * 2 <br>
 * 10<br>
 * 100
 * </p>
 * <p>
 * Sample Output <br>
 * 23 <br>
 * 2318
 * </p>
 * 
 * @author Pidanic
 *
 */
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
