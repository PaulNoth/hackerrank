package projecteuler;

import java.util.Scanner;

/**
 * <b>Project Euler #9: Special Pythagorean triplet</b>
 * <p>
 * A Pythagorean triplet is a set of three natural numbers, <tt>a<b<c</tt> , for
 * which, <tt>a^2+b^2=c^2<tt> For example, <tt>3^2+4^2=9+16=25=5^2</tt> Given
 * <tt>N</tt>, Check if there exists any Pythagorean triplet for which a+b+c=N
 * Find maximum possible value of abc among all such Pythagorean triplets, If
 * there is no such Pythagorean triplet print <tt>−1</tt>.
 * </p>
 * <p>
 * Input Format<br>
 * The first line contains an integer T i.e. number of test cases. The next T
 * lines will contain an integer N.
 * </p>
 * <p>
 * Output Format<br>
 * Print the value corresponding to each test case in seperate line.
 * </p>
 * <p>
 * Constraints<br>
 * 1<=T<=3000<br>
 * 1<=N<=3000
 * </p>
 * <p>
 * Sample Input 2<br>
 * 12<br>
 * 4
 * </p>
 * <p>
 * Sample Output <br>
 * 60 <br>
 * -1
 * </p>
 * 
 * @author Pidanic
 *
 */
public class PythagoreanTriplet
{
	public static void main(String[] args)
	{
		Scanner scanner = new Scanner(System.in);
		int tests = scanner.nextInt();
		for (int i = 0; i < tests; i++)
		{
			int n = scanner.nextInt();
			System.out.println(findTripletDirty(n));
		}
		scanner.close();
	}

	static long findTriplet(int number)
	{
		long maxTriplet = -1;
		for (int a = 1; a <= number / 3; a++)
		{
			int aSquare = a * a;
			for (int b = a + 1; b <= number / 2; b++)
			{
				int c = number - a - b;
				if(c > 0 && c * c == aSquare + b * b)
				{
					long product = (long) a * b * c;
					if(product > maxTriplet)
					{
						maxTriplet = product;
					}
				}
			}
		}
		return maxTriplet;
	}

	// http://stackoverflow.com/questions/2817848/find-pythagorean-triplet-for-which-a-b-c-1000
	static long findTripletDirty(int number)
	{
		long max = -1;
		// sum of integer Pythagorean triplet is always even
		if(number % 2 == 0)
		{
			for (int b = 1; b < number / 2; b++)
			{
				if(number * (number / 2 - b) % (number - b) == 0)
				{
					int a = number * (number / 2 - b) / (number - b);
					int c = number - a - b;
					long product = (long) c * a * b;
					if(product > max)
					{
						max = product;
					}
				}
			}
		}
		return max;
	}
}
