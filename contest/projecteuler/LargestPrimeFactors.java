import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

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
