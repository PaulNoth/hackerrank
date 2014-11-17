package projecteuler;

import java.util.Scanner;

/**
 * <b>Project Euler #4: Largest palindrome product</b>
 * <p>
 * A palindromic number reads the same both ways. The smallest 6 digit
 * palindrome made from the product of two 3-digit numbers is 101101=143×707.
 * </p>
 * <p>
 * Find the largest palindrome made from the product of two 3-digit numbers
 * which is less than N.
 * </p>
 * <p>
 * Input Format<br/>
 * First line contains T that denotes the number of test cases. This is followed
 * by T lines, each containing an integer, N.
 * </p>
 * <p>
 * Output Format Print the required answer for each test case in a new line.
 * </p>
 * <p>
 * Constraints<br/>
 * 1<=T<100
 * </p>
 * 101101<N<1000000</p>
 * <p>
 * Sample Input <br/>
 * 2 <br/>
 * 101110<br/>
 * 800000
 * </p>
 * <p>
 * Sample Output<br/>
 * 101101<br/>
 * 793397<br/>
 * </p>
 * 
 * @author Pidanic
 *
 */
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
