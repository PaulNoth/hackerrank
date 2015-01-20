package weekly.week11;

import java.util.Scanner;

/**
 * <b>Sherlock and Squares</b>
 * <p>
 * Watson gives a square of side length 1 to Sherlock. Now, after each second,
 * each square of side <tt>L</tt> will break into four squares each of side.
 * </p>
 * <p>
 * Now, Watson asks Sherlock: What will be the sum of length of solid lines
 * after N seconds?
 * </p>
 * <p>
 * As the number can be large print <tt>result mod (10<sup>9</sup>+7)</tt>.
 * </p>
 * <p>
 * For example, after 0 seconds, the length is 4. After 1 second, the length is
 * 6.
 * </p>
 * <p>
 * Input Format<br>
 * First line contains T, the number of testcases. Each testcase contains N in
 * one line.
 * </p>
 * <p>
 * Output Format <br>
 * For each testcase, print the required answer in a new line.
 * </p>
 * <p>
 * Constraints<br>
 * 1<=T<=10<sup>5</sup><br>
 * 0<=N<=10<sup>9</sup>
 * </p>
 * 
 * @author Pidanic
 *
 */
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
