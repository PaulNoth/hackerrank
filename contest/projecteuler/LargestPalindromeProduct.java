import java.util.Scanner;

public class LargestPalindromeProduct
{
	public static void main(String[] args)
	{
		Scanner scanner = new Scanner(System.in);
		int tests = Integer.parseInt(scanner.nextLine());
		for (int i = 0; i < tests; i++)
		{
			int number = Integer.parseInt(scanner.nextLine());
			System.out.println(palindromeNumber(number));
		}
		scanner.close();
	}

	private static int palindromeNumber(int number)
	{
		// int root = (int) Math.sqrt(number);
		int max = 0;
		for (int j = 999; j >= 100; j--)
		{
			for (int k = 999; k >= 100; k--)
			{
				int product = j * k;
				if(product < number && isPalindrome(String.valueOf(product)))
				{
					if(product > max)
					{
						max = product;
					}
				}
			}
		}
		return max;
	}

	private static boolean isPalindrome(String text)
	{
		for (int i = 0; i < text.length() / 2; i++)
		{
			if(text.charAt(i) != text.charAt(text.length() - 1 - i))
			{
				return false;
			}
		}
		return true;
	}
}
