package weekly.week6;

import java.util.Scanner;

/**
 * <b>Consecutive Subsequences</b>
 * <p>
 * Jigar got a sequence of n positive integers as his birthday present! He likes
 * consecutive subsequences whose sum is divisible by k. He asks you to write a
 * program to count them for him.
 * </p>
 * <p>
 * Input Format<br>
 * The first line contains T, the number of testcases. T testcases follow. Each
 * testcase consists of 2 lines. The first line contains n and k separated by a
 * single space. And the second line contains n space separated integers.
 * </p>
 * <p>
 * Output Format<br>
 * For each test case, output the number of consecutive subsequenences whose sum
 * is divisible by k in a newline.
 * </p>
 * <p>
 * Constraints<br>
 * 1 ≤ T ≤ 20 <br>
 * 1 ≤ n ≤ 10^6 <br>
 * 1 ≤ k ≤ 100<br>
 * 1 ≤ a[i] ≤ 10^4
 * </p>
 * <p>
 * Sample Input<br>
 * 2 <br>
 * 5 3 <br>
 * 1 2 3 4 1 <br>
 * 6 2 <br>
 * 1 2 1 2 1 2
 * </p>
 * <p>
 * Sample Output<br>
 * 4 <br>
 * 9
 * </p>
 * <p>
 * Explanation<br>
 * For 1 2 3 4 1 there exists, 4 subsequences whose sum is divisible by 3, they
 * are <br>
 * 3 <br>
 * 1 2 <br>
 * 1 2 3 <br>
 * 2 3 4 <br>
 * <br>
 * For 1 2 1 2 1 2 there exists, 9 subsequences whose sum is divisible by 2,
 * they are <br>
 * 2 <br>
 * 2 <br>
 * 2 <br>
 * 1 2 1 <br>
 * 1 2 1 <br>
 * 1 2 1 2 <br>
 * 2 1 2 1<br>
 * 1 2 1 2<br>
 * 2 1 2 1 2
 * </p>
 * 
 * @author Pidanic
 *
 */
// http://stackoverflow.com/questions/24518682/count-subsequences-divisible-by-k
public class ConsecutiveSubsequences
{
	public static void main(String[] args)
	{
		Scanner scanner = new Scanner(System.in);
		int tests = scanner.nextInt();

		for(int l = 0; l < tests; l++)
		{
			int n = scanner.nextInt();
			int k = scanner.nextInt();
			long[] numbers = new long[n];

			for(int i = 0; i < n; i++)
			{
				numbers[i] = scanner.nextLong();
			}

			long[] prefixModCount = new long[k];
			for(int i = 0; i < k; i++)
			{
				prefixModCount[i] = 0;
			}
			prefixModCount[0] = 1;

			int prefixSum = 0;
			for(int i = 0; i < numbers.length; i++)
			{
				prefixSum += numbers[i];
				prefixSum %= k;
				prefixModCount[prefixSum] += 1;
			}

			long result = 0;
			for(int mod = 0; mod < k; mod++)
			{
				result += prefixModCount[mod] * (prefixModCount[mod] - 1) / 2;
			}
			System.out.println(result);
		}

		scanner.close();
	}
}
