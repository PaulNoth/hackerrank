import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class HighlyDivisibleTriangularNumber
{
	// urobit celociselny rozklad na prvocisla
	// (exp_na_prvocisle_1 + 1) * (exp_na_prvocisle_2 + 1) * ... *
	// (exp_na_prvocisle_n + 1)
	public static void main(String[] args)
	{
		Scanner scanner = new Scanner(System.in);
		List<Integer> primes = eratosthenes(10000000);

		int tests = Integer.parseInt(scanner.nextLine());
		for (int i = 0; i < tests; i++)
		{
			int num = 0;
			int div = 0;
			int divisors = Integer.parseInt(scanner.nextLine());
			outer: for (int number = 1; number < Integer.MAX_VALUE; number++)
			{
				int counter = 1;
				num += number;
				int n = num;
				for (int j = 0; j < primes.size() && div < n; j++)
				{
					div = primes.get(j);
					int exp = 0;
					while (n % div == 0)
					{
						exp++;
						n /= div;
					}
					counter *= (exp + 1);
					if (counter > divisors)
					{
						System.out.println(num);
						break outer;
					}
				}
			}
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
		List<Integer> primes = new ArrayList<Integer>();
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
				primes.add(i);
			}
		}
		return primes;
	}
}
