import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

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
