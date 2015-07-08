package algorithms.strings;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

/**
 * <b>Gem Stones</p>
 * <p>
 * John has discovered various rocks. Each rock is composed of various elements,
 * and each element is represented by a lowercase latin letter from 'a’ to 'z'.
 * An element can be present multiple times in a rock. An element is called a
 * 'gem-element' if it occurs at least once in each of the rocks.
 * </p>
 * <p>
 * Given the list of rocks with their compositions, you have to print how many
 * different kinds of gems-elements he has.
 * </p>
 * <p>
 * Input Format The first line consists of N, the number of rocks. Each of the
 * next N lines contain rocks’ composition. Each composition consists of small
 * alphabets of English language.
 * </p>
 * <p>
 * Output Format Print the number of different kinds of gem-elements he has.
 * </p>
 * <p>
 * Constraints 1 ≤ N ≤ 100 Each composition consists of only small latin letters
 * ('a'-'z'). 1 ≤ Length of each composition ≤ 100
 * </p>
 * Sample Input<br>
 * 
 * 3 <br>
 * abcdde <br>
 * baccd <br>
 * eeabg <br>
 * <br>
 * Sample Output<br>
 * 
 * 2
 * 
 * @author Pidanic
 *
 */
public class GemStones
{
	public static void main(String[] args)
	{
		Scanner scanner = new Scanner(System.in);
		int rocks = scanner.nextInt();

		char[] first = scanner.next().toCharArray();

		Set<Character> result = new HashSet<>();
		for (char c : first)
		{
			result.add(c);
		}

		for (int i = 1; i < rocks; i++)
		{
			char[] composition = scanner.next().toCharArray();
			Set<Character> set = new HashSet<>();
			for (char d : result)
			{
				for (int j = 0; j < composition.length; j++)
				{
					if(d == composition[j])
					{
						set.add(composition[j]);
					}
				}
			}
			result = set;
		}
		System.out.println(result.size());
		scanner.close();
	}
}
