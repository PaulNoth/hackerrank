import java.util.Scanner;

public class SherlockSquares
{
	public static void main(String[] args)
	{
		Scanner scanner = new Scanner(System.in);
		int tests = Integer.parseInt(scanner.nextLine());
		for (int i = 0; i < tests; i++)
		{
			int seconds = Integer.parseInt(scanner.nextLine());
			long sum = 4L;
			long lines = 2L;
			for (int j = 1; j <= seconds; j++)
			{
				sum += lines;
				lines <<= 1;
				sum %= 1_000_000_007;
				lines %= 1_000_000_007;
			}
			System.out.println(sum);
		}

		scanner.close();
	}
}
