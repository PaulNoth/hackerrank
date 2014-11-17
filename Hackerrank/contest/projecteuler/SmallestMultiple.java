package projecteuler;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * 
 * <b>Project Euler #5: Smallest multiple</b>
 * <p>
 * 2520 is the smallest number that can be divided by each of the numbers from 1
 * to 10 without any remainder. What is the smallest positive number that is
 * evenly divisible(divisble with no remainder) by all of the numbers from 1 to
 * N?
 * </p>
 * <p>
 * Input Format<br/>
 * First line contains T that denotes the number of test cases. This is followed
 * by T lines, each containing an integer, N.
 * </p>
 * <p>
 * Output Format<br/>
 * Print the required answer for each test case.
 * </p>
 * <p>
 * Constraints <br/>
 * 1<=T<=10<br/>
 * 1<=N<=40
 * </p>
 * <p>
 * Sample Input <br/>
 * 2 <br/>
 * 3 <br/>
 * 10
 * </p>
 * <p>
 * Sample Output <br/>
 * 6 <br/>
 * 2520
 * </p>
 * 
 * @author Pidanic
 *
 */
public class SmallestMultiple
{
	// prime factorization
	// http://www.mathblog.dk/project-euler-problem-5/
	public static void main(String[] args)
	{
		Scanner scanner = new Scanner(System.in);
		int tests = Integer.parseInt(scanner.nextLine());
		for (int i = 0; i < tests; i++)
		{
			int number = Integer.parseInt(scanner.nextLine());
			List<Integer> primes = eratosthenes(number);
			long result = 1;
			for (int prime : primes)
			{
				int exp = (int) (Math.log(number) / Math.log(prime));
				result *= (long) Math.pow(prime, exp);
			}
			System.out.println(result);
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
			if(array[i])
			{
				int j = i;
				while (i * j < array.length)
				{
					array[i * j] = false;
					j++;
				}
			}
		}
		List<Integer> primes = new ArrayList<Integer>();
		for (int i = 2; i < array.length; i++)
		{
			if(array[i])
			{
				primes.add(i);
			}
		}
		return primes;
	}
}
