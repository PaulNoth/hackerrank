package projecteuler;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * 
 * <b>Largest prime factor</b>
 * <p>
 * The prime factors of 13195 are 5, 7, 13 and 29.
 * </p>
 * <p>
 * What is the largest prime factor of a given number N?
 * </p>
 * <p>
 * Input Format<br/>
 * First line contains T, the number of test cases. This is followed by T lines
 * each containing an integer N.
 * </p>
 * <p>
 * Output Format<br/>
 * For each test case, display the largest prime factor of N.
 * </p>
 * <p>
 * Constraints<br/>
 * 1<=T<=10<br/>
 * 10<=N<=10^12<br/>
 * </p>
 * <p>
 * Sample Input <br/>
 * 2 <br/>
 * 10 <br/>
 * 17
 * </p>
 * <p>
 * Sample Output<br/>
 * 5 <br/>
 * 17
 * </p>
 * 
 * @author Pidanic
 *
 */
public class LargestPrimeFactors
{
	public static void main(String[] args)
	{
		Scanner scanner = new Scanner(System.in);
		int tests = Integer.parseInt(scanner.nextLine());
		for (int i = 0; i < tests; i++)
		{
			long number = Long.parseLong(scanner.nextLine());
			System.out.println(largestPrimeFactor(number));
		}
		scanner.close();
	}

	// http://en.wikipedia.org/wiki/Pollard's_rho_algorithm
	// http://stackoverflow.com/questions/23287/largest-prime-factor-of-a-number
	private static long largestPrimeFactor(long number)
	{
		List<Long> factors = new ArrayList<Long>();
		long d = 2;
		while (number > 1)
		{
			while (number % d == 0)
			{
				factors.add(d);
				number /= d;
			}
			d++;
			if(d * d > number)
			{
				if(number > 1)
				{
					factors.add(number);
				}
				break;
			}
		}
		return max(factors);
	}

	private static long max(List<Long> list)
	{
		long max = Long.MIN_VALUE;
		for (Long l : list)
		{
			if(l > max)
			{
				max = l;
			}
		}
		return max;
	}
}
