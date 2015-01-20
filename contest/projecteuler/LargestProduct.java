package projecteuler;

import java.util.Scanner;

/**
 * 
 * <b>Project Euler #8: Largest product in a series</b>
 * <p>
 * Find the greatest product of <tt>K</tt> consecutive digits in the <tt>N</tt>
 * digit number.
 * </p>
 * <p>
 * Input Format<br>
 * First line contains <tt>T</tt> that denotes the number of test cases. First
 * line of each test case will contain two integers <tt>N & K</tt>. Second line
 * of each test case will contain a <tt>N</tt> digit integer.
 * </p>
 * <p>
 * Output Format<br>
 * Print the required answer for each test case.
 * </p>
 * <p>
 * Constraints<br>
 * <tt>1<=T<=100</tt><br>
 * <tt>1<=K<=7</tt><br>
 * <tt>K<=N<=1000</tt>
 * </p>
 * <p>
 * Sample Input <br>
 * 2<br>
 * 10 5<br>
 * 3675356291<br>
 * 10 5<br>
 * 2709360626
 * </p>
 * <p>
 * Sample Output <br>
 * 3150<br>
 * 0
 * </p>
 * 
 * @author Pidanic
 *
 */
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
