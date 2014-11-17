package algorithms.search;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

/**
 * 
 * <b>Closest Number</b>
 * <p>
 * Sorting is often useful as the first step in many different tasks. The most
 * common task is to make finding things easier, but there are other uses also.
 * </p>
 * <p>
 * Challenge Given a list of unsorted numbers, can you find the numbers that
 * have the smallest absolute difference between them? If there are multiple
 * pairs, find them all.
 * </p>
 * <p>
 * Input Format<br>
 * There will be two lines of input:<br>
 * n - the size of the list <br>
 * array - the n numbers of the list
 * </p>
 * <p>
 * Output Format<br>
 * Output the pairs of numbers with the smallest difference. If there are
 * multiple pairs, output all of them in ascending order, all on the same line
 * (consecutively) with just a single space between each pair of numbers. If
 * there's a number which lies in two pair, print it two times (see sample case
 * #3 for explanation).
 * </p>
 * <p>
 * Constraints <br>
 * 10 <= n <= 200000 <br>
 * -(10^7) <= x <= (10^7), where x in array <br>
 * array[i] != array[j], 0 <= i, j < N, and i != j
 * </p>
 * </p> Sample Input #1 <br>
 * 10 -20 -3916237 -357920 -3620601 7374819 -7330761 30 6246457 -6461594 266854
 * </p>
 * <p>
 * Sample Output #1 <br>
 * -20 30
 * </p>
 * <p>
 * Explanation (30) - (-20) = 50, which is the smallest difference.
 * </p>
 * 
 * @author Pidanic
 *
 */
public class ClosestNumber
{
	public static void main(String[] args)
	{
		Scanner scanner = new Scanner(System.in);
		int n = Integer.parseInt(scanner.nextLine());
		long[] numbers = new long[n];
		String[] input = scanner.nextLine().trim().split("\\s+");
		for (int i = 0; i < n; i++)
		{
			numbers[i] = Long.parseLong(input[i]);
		}
		Arrays.sort(numbers);

		long min = Long.MAX_VALUE;
		List<Long> result = new ArrayList<>();
		for (int i = 0; i < n - 1; i++)
		{
			long diff1 = numbers[i] - numbers[i + 1];
			if (diff1 > 0)
			{
				if (diff1 < min)
				{
					result.clear();
					result.add(numbers[i]);
					result.add(numbers[i + 1]);
					min = diff1;
				}
				else if (diff1 == min)
				{
					result.add(numbers[i]);
					result.add(numbers[i + 1]);
				}
			}
			long diff2 = numbers[i + 1] - numbers[i];
			if (diff2 > 0)
			{
				if (diff2 < min)
				{
					result.clear();
					result.add(numbers[i]);
					result.add(numbers[i + 1]);
					min = diff2;
				}
				else if (diff2 == min)
				{
					result.add(numbers[i]);
					result.add(numbers[i + 1]);
				}
			}
		}

		Collections.sort(result);
		StringBuilder sb = new StringBuilder();
		for (long l : result)
		{
			sb.append(l);
			sb.append(" ");
		}
		System.out.println(sb.toString().trim());
		scanner.close();
	}
}
