import java.util.Scanner;

public class PythagoreanTriplet
{
	public static void main(String[] args)
	{
		Scanner scanner = new Scanner(System.in);
		int tests = scanner.nextInt();
		for (int i = 0; i < tests; i++)
		{
			int n = scanner.nextInt();
			System.out.println(findTripletDirty(n));
		}
		scanner.close();
	}

	static long findTriplet(int number)
	{
		long maxTriplet = -1;
		for (int a = 1; a <= number / 3; a++)
		{
			int aSquare = a * a;
			for (int b = a + 1; b <= number / 2; b++)
			{
				int c = number - a - b;
				if(c > 0 && c * c == aSquare + b * b)
				{
					long product = (long) a * b * c;
					if(product > maxTriplet)
					{
						maxTriplet = product;
					}
				}
			}
		}
		return maxTriplet;
	}

	// http://stackoverflow.com/questions/2817848/find-pythagorean-triplet-for-which-a-b-c-1000
	static long findTripletDirty(int number)
	{
		long max = -1;
		// sum of integer Pythagorean triplet is always even
		if(number % 2 == 0)
		{
			for (int b = 1; b < number / 2; b++)
			{
				if(number * (number / 2 - b) % (number - b) == 0)
				{
					int a = number * (number / 2 - b) / (number - b);
					int c = number - a - b;
					long product = (long) c * a * b;
					if(product > max)
					{
						max = product;
					}
				}
			}
		}
		return max;
	}
}
