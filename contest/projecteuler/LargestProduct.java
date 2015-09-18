import java.util.Scanner;

public class LargestProduct
{
	public static void main(String[] args)
	{
		Scanner scanner = new Scanner(System.in);
		int tests = scanner.nextInt();
		for (int i = 0; i < tests; i++)
		{
			int n = scanner.nextInt();
			int k = scanner.nextInt();
			String number = scanner.next();
			long max = 0;
			for (int j = 0; j < n - k; j++)
			{
				long product = 1;
				for (int l = j; l < j + k; l++)
				{
					product *= Integer
							.parseInt(String.valueOf(number.charAt(l)));
				}
				if(product > max)
				{
					max = product;
				}
			}
			System.out.println(max);
		}
		scanner.close();
	}
}
