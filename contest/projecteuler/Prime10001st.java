package projecteuler;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * 
 * <b>Project Euler #7: 10001st prime</b>
 * <p>
 * By listing the first six prime numbers: 2,3,5,7,11 and 13, we can see that
 * the 6th prime is 13. What is the N'th prime number?
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
 * 1<=T<=10^3<br>
 * 1<=N<=10^4
 * </p>
 * <p>
 * Sample Input <br>
 * 2 <br>
 * 3 <br>
 * 6
 * </p>
 * <p>
 * Sample Output <br>
 * 5 <br>
 * 13
 * </p>
 * 
 * @author Pidanic
 *
 */
public class Prime10001st
{
	public static void main(String[] args)
	{
		Scanner scanner = new Scanner(System.in);
		int tests = Integer.parseInt(scanner.nextLine());
		// naive solution - from analysis 10001st prime is 104 743
		// constraint says primes to 10^4th
		// first I list all primes to 104 743 and then get index
		List<Integer> primes = eratosthenes(104743);
		for (int i = 0; i < tests; i++)
		{
			int n = Integer.parseInt(scanner.nextLine());
			System.out.println(primes.get(n - 1));
		}
		scanner.close();
	}

	private static List<Integer> eratosthenes(int number)
	{
		boolean[] array = new boolean[number + 1];
		for (int i = 0; i < array.length; i++)
		{
			array[i] = true;
		}
		for (int i = 2; i < array.length; i++)
		{
			if (array[i])
			{
				int j = i;
				while (i * j >= 0 && i * j < array.length)
				{
					array[i * j] = false;
					j++;
				}
			}
		}
		List<Integer> primes = new ArrayList<Integer>();
		for (int i = 2; i < array.length; i++)
		{
			if (array[i])
			{
				primes.add(i);
			}
		}
		return primes;
	}
}
