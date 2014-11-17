package algorithms.strings;

import java.util.Scanner;

/**
 * <b>Common Child</b> <br>
 * <p>
 * Given two strings a and b of equal length, what's the longest string (S) that
 * can be constructed such that S is a child of both a and b.
 * </p>
 * <p>
 * A string x is said to be a child of a string y, if x can be formed by
 * deleting 0 or more characters from y
 * </p>
 * Input format<br>
 * 
 * Two strings a and b with a newline separating them <br>
 * <br>
 * Constraints<br>
 * All characters are upper-cased and lie between ASCII values 65-90. The
 * maximum length of the strings is 5000. <br>
 * <br>
 * Output format <br>
 * Length of the string S <br>
 * <br>
 * Sample Input #0 <br>
 * HARRY SALLY<br>
 * <br>
 * 
 * Sample Output #0<br>
 * 2 <br>
 * <br>
 * The longest possible subset of characters that is possible by deleting zero
 * or more characters from HARRY and SALLY is AY, whose length is 2. <br>
 * <br>
 * Sample Input #1 <br>
 * AA BB <br>
 * <br>
 * 
 * Sample Output #1 <br>
 * 0 <br>
 * <br>
 * AA and BB has no characters in common and hence the output 0 <br>
 * <br>
 * Sample Input #2 <br>
 * SHINCHAN NOHARAAA <br>
 * <br>
 * Sample Output #2 <br>
 * 3 <br>
 * <br>
 * The largest set of characters, in order, between SHINCHAN and NOHARAAA is
 * NHA. <br>
 * <br>
 * 
 * @author Pidanic
 *
 */
public class CommonChild
{
	public static void main(String[] args)
	{
		Scanner scanner = new Scanner(System.in);
		String input1 = scanner.nextLine();
		String input2 = scanner.nextLine();

		int result = lcsOptimized(input1, input2);
		System.out.println(result);
		scanner.close();
	}

	// http://en.wikipedia.org/wiki/Longest_common_subsequence_problem
	private static int lcsOptimized(String input1, String input2)
	{
		int start = 0;
		int inEnd1 = input1.length() - 1;
		int inEnd2 = input2.length() - 1;

		while (start <= inEnd1 && start <= inEnd2
				&& input1.charAt(start) == input2.charAt(start))
		{
			start++;
		}

		while (start <= inEnd1 && start <= inEnd2
				&& input1.charAt(inEnd1) == input2.charAt(inEnd2))
		{
			inEnd1--;
			inEnd2--;
		}
		int[][] table = new int[inEnd1 - start + 1][inEnd2 - start + 1];
		for (int i = 0; i < table.length; i++)
		{
			for (int j = 0; j < table[i].length; j++)
			{
				table[i][j] = input1.length() - inEnd1 - 1;
			}
		}

		for (int i = start; i < inEnd1; i++)
		{
			for (int j = start; j < inEnd2; j++)
			{
				if(input1.charAt(i) == input2.charAt(j))
				{
					table[i + 1][j + 1] = table[i][j] + 1;
				}
				else
				{
					table[i + 1][j + 1] = table[i + 1][j] > table[i][j + 1] ? table[i + 1][j]
							: table[i][j + 1];
				}
			}
		}

		return table[inEnd1][inEnd2];
	}
}
