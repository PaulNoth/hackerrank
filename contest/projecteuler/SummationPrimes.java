package projecteuler;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * 
 * <b>Project Euler #10: Summation of primes</b>
 * <p>
 * The sum of the primes below 10 is 2+3+5+7=17.
 * </p>
 * <p>
 * Find the sum of all the primes not greater than given N.
 * </p>
 * <p>
 * Input Format<br>
 * The first line contains an integer T i.e. number of the test cases. The next
 * T lines will contains an integer N.
 * </p>
 * <p>
 * Output Format<br>
 * Print the value corresponding to each test case in seperate line.
 * </p>
 * <p>
 * Constraints<br>
 * 1<=T<=10^4<br>
 * 1<=N<=10^6
 * </p>
 * <p>
 * Sample Input<br>
 * 2<br>
 * 5<br>
 * 10
 * </p>
 * <p>
 * Sample Output<br>
 * 10<br>
 * 17
 * </p>
 * 
 * @author Pidanic
 *
 */
public class SummationPrimes
{
	public static void main(String[] args)
	{
		Scanner scanner = new Scanner(System.in);
		int tests = scanner.nextInt();
		List<Long> primes = eratosthenes(1000000);
		for (int i = 0; i < tests; i++)
		{
			int n = scanner.nextInt();
			System.out.println(sum(primes, n));
		}
		scanner.close();
	}

	private static long sum(List<Long> primes, int n)
	{
		long sum = 0;
		for (long prime : primes)
		{
			if(Long.compare(prime, n) > 0)
			{
				return sum;
			}
			sum += prime;
		}
		return sum;
	}

	private static List<Long> eratosthenes(int number)
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
				while ((long) j * i < array.length)
				{
					array[j * i] = false;
					j++;
				}
			}
		}
		List<Long> primes = new ArrayList<Long>();
		for (int i = 2; i < array.length; i++)
		{
			if(array[i])
			{
				primes.add((long) i);
			}
		}
		return primes;
	}
}
