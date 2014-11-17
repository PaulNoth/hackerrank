package projecteuler;

import java.math.BigInteger;
import java.util.Scanner;

/**
 * 
 * <b>Project Euler #13: Large sum</b>
 * <p>
 * Work out the first ten digits of the sum of N 50-digit numbers.
 * </p>
 * <p>
 * Input Format<br>
 * First line contains N, next N lines contain a 50 digit number each.
 * </p>
 * <p>
 * Output Format<br>
 * Print only first 10 digit of the final sum
 * </p>
 * <p>
 * Constraints<br>
 * 1<=N<=10^3
 * </p>
 * <p>
 * Sample Input<br>
 * 5<br>
 * 37107287533902102798797998220837590246510135740250<br>
 * 46376937677490009712648124896970078050417018260538<br>
 * 74324986199524741059474233309513058123726617309629<br>
 * 91942213363574161572522430563301811072406154908250<br>
 * 23067588207539346171171980310421047513778063246676
 * </p>
 * <p>
 * Sample Output <br>
 * 2728190129
 * </p>
 * 
 * @author Pidanic
 *
 */
public class LargeSum
{
	public static void main(String[] args)
	{
		Scanner scanner = new Scanner(System.in);
		int numbers = Integer.parseInt(scanner.nextLine());
		BigInteger sum = BigInteger.ZERO;
		for (int i = 0; i < numbers; i++)
		{
			String input = scanner.nextLine();
			sum = sum.add(new BigInteger(input));
		}
		System.out.println(sum.toString().substring(0, 10));
		scanner.close();
	}
}
