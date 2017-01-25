import java.util.Scanner;

public class SumSquareDifference
{
	public static void main(String[] args)
	{
		Scanner scanner = new Scanner(System.in);
		int tests = Integer.parseInt(scanner.nextLine());
		for (int i = 0; i < tests; i++)
		{
			int number = Integer.parseInt(scanner.nextLine());
			System.out.println(sumDifference(number));
		}
		scanner.close();
	}

	private static long sumDifference(int number)
	{
		long squareSum = 0;
		long sumSqares = 0;
		for (int i = 1; i <= number; i++)
		{
			squareSum += i;
			sumSqares += (i * i);
		}
		squareSum *= squareSum;

		return squareSum - sumSqares;
	}
}
