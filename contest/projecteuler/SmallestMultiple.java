import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

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
