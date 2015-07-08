package mathematics.combinatorics;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

/**
 * <p>
 * Chan has decided to make a list of all possible combinations of letters of a
 * given string S. If there are two strings with the same set of characters,
 * print the lexicographically smallest arrangement of the two strings.
 * </p>
 * <p>
 * abc acb cab bac bca all the above strings� lexicographically smallest string
 * is abc.
 * </p>
 * <p>
 * Each character in the string S is unique. Your task is to print the entire
 * list of Chan�s in lexicographic order.
 * </p>
 * <p>
 * for string abc, the list in lexicographic order is given below
 * </p>
 * a <br>
 * ab <br>
 * abc <br>
 * ac<br>
 * b <br>
 * bc<br>
 * c <br>
 * Input Format <br>
 * <p>
 * The first line contains the number of test cases T. T testcases follow. Each
 * testcase has 2 lines. The first line is an integer N ( the length of the
 * string). The second line contains the string S.
 * </p>
 * Output Format <br>
 * For each testcase, print the entire list of combinations of string S, with
 * each combination of letters in a newline. <br>
 * Constraints <br>
 * 0< T< 50 <br>
 * 1< N< 16 <br>
 * string S contains only small alphabets(a-z) <br>
 * <br>
 * Sample Input<br>
 * 
 * 2 <br>
 * 2 <br>
 * ab <br>
 * 3 <br>
 * xyz<br>
 * <br>
 * Sample Output <br>
 * a <br>
 * ab <br>
 * b <br>
 * x <br>
 * xy <br>
 * xyz <br>
 * xz <br>
 * y <br>
 * yz <br>
 * z
 * 
 * @author Pidanic
 *
 */
public class BuildingList
{
	public static void main(String[] args)
	{
		Scanner scanner = new Scanner(System.in);
		int testCases = Integer.parseInt(scanner.next());
		for (int i = 0; i < testCases; i++)
		{
			// int length = Integer.parseInt(scanner.next());
			String input = scanner.next();
			List<String> result = new ArrayList<String>();
			combine(result, input, 0, "");
			Collections.sort(result);
			for (String s : result)
			{
				System.out.println(s);
			}
		}
		scanner.close();
	}

	private static void combine(List<String> result, String input, int start,
			String actual)
	{
		for (int i = start; i < input.length(); i++)
		{
			String out = actual;
			actual += input.charAt(i);
			// System.out.println(actual);
			result.add(actual);
			if(i < input.length())
			{
				combine(result, input, i + 1, out);
			}
		}
	}
}
