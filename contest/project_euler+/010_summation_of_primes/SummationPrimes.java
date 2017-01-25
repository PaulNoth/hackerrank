import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

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
