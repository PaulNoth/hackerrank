package projecteuler;

import java.util.Scanner;

/**
 * <b>Project Euler #6: Sum square difference</b>
 * <p>
 * The sum of the squares of the first ten natural numbers is,
 * 1^2+2^2+...+10^2=385. The square of the sum of the first ten natural numbers
 * is, (1+2+⋯+10)^2=55^2=3025. Hence the difference between the sum of the
 * squares of the first ten natural numbers and the square of the sum is
 * 3025−385=2640.
 * </p>
 * <p>
 * Find the difference between the sum of the squares of the first N natural
 * numbers and the square of the sum.
 * </p>
 * <p>
 * Input Format<br>
 * First line contains T that denotes the number of test cases. This is followed
 * by T lines, each containing an integer, N.
 * </p>
 * <p>
 * Output Format<br>
 * Print the required answer for each test case.
 * </p>
 * <p>
 * Constraints<br>
 * 1<=N<=10^3<br>
 * 1<=N<=10^3
 * </p>
 * <p>
 * Sample Input <br>
 * 2<br>
 * 3<br>
 * 10
 * </p>
 * <p>
 * Sample Output <br>
 * 22<br>
 * 2640
 * </p>
 * 
 * @author Pidanic
 *
 */
public class SumSquareDifference
{
	public static void main(String[] args)
	{
		Scanner scanner = new Scanner(System.in);
		int tests = Integer.parseInt(scanner.nextLine());
		for (int i = 0; i < tests; i++)
		{
			int number = Integer.parseInt(scanner.nextLine());
			System.out.println(sumDifference(number));
		}
		scanner.close();
	}

	private static long sumDifference(int number)
	{
		long squareSum = 0;
		long sumSqares = 0;
		for (int i = 1; i <= number; i++)
		{
			squareSum += i;
			sumSqares += (i * i);
		}
		squareSum *= squareSum;

		return squareSum - sumSqares;
	}
}
