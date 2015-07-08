package algorithms.implementation;

import java.util.Scanner;

/**
 * <b>Utopian Tree</b> <br>
 * The Utopian tree goes through 2 cycles of growth every year. The first growth
 * cycle of the tree is during the monsoon season when it doubles in height. The
 * second growth cycle is during the summer when it increases in height by 1
 * meter. If a new Utopian tree sapling of height 1 meter is planted just before
 * the onset of the monsoon season, can you find the height of the tree after N
 * cycles? <br>
 * <br>
 * <b>Input Format</b> <br>
 * The first line of the input contains an integer T, the number of test cases.
 * T lines follow with each line containing the integer N, the number of cycles. <br>
 * Constraints <br>
 * 1 <= T <= 10 <br>
 * 0 <= N <= 60 <br>
 * <br>
 * <b>Output Format</b> <br>
 * Print the height of the Utopian tree after N cycles. <br>
 * <br>
 * Sample Input #00: <br>
 * 2 <br>
 * 0 <br>
 * 1 <br>
 * <br>
 * Sample Output #00: <br>
 * 1 <br>
 * 2
 * 
 * @author Pidanic
 *
 */
public class UtopianTree
{
	public static void main(String[] args)
	{
		Scanner scanner = new Scanner(System.in);
		int testCases = scanner.nextInt();

		for (int i = 0; i < testCases; i++)
		{
			int cycles = scanner.nextInt();
			System.out.println(utopianTree(cycles));
		}

		scanner.close();
	}

	private static int utopianTree(int cycles)
	{
		int height = 1;
		for (int i = 0; i < cycles; i++)
		{
			if(i % 2 == 0)
			{
				height *= 2;
			}
			else
			{
				height += 1;
			}
		}
		return height;
	}
}
