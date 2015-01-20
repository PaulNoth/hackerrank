package miscellaneous.regex;

import java.util.Scanner;

/**
 * <b>Alien Username</b>
 * <p>
 * In a galaxy far far away, a planet different from ours, computer usernames
 * follow a different format.
 * </p>
 * <p>
 * It has to begin with either an underscore �_� (ascii value 95) or a dot �.�
 * (ascii value 46) It has to be immediately followed by one or more occurrences
 * of digits numbered 0-9 It can then have letters, either uppercase or
 * lowercase, 0 or more in number It can then end with an optional �_� (ascii
 * value 95) Your task is to validate whether a username is valid or not </i>
 * Input Format <br>
 * 
 * First line contains N, N usernames follow each in a newline. <br>
 * Constraints<br>
 * 
 * 1 <= N <= 100 <br>
 * <br>
 * 
 * Output Format<br>
 * 
 * For every username, print<br>
 * <br>
 * VALID if you think the username is correct and print<br>
 * <br>
 * INVALID otherwise. <br>
 * <br>
 * Sample Input<br>
 * 
 * 3 <br>
 * _0898989811abced_ <br>
 * _abce <br>
 * _09090909abcD0 <br>
 * <br>
 * Sample Output<br>
 * 
 * VALID<br>
 * INVALID<br>
 * INVALID
 * 
 * @author Pidanic
 *
 */
public class AlienUsername
{
	public static void main(String[] args)
	{
		Scanner scanner = new Scanner(System.in);
		int testCases = scanner.nextInt();
		for (int i = 0; i < testCases; i++)
		{
			String input = scanner.next();
			if(input.matches("[_\\.]\\d+[a-zA-Z]*_?"))
			{
				System.out.println("VALID");
			}
			else
			{
				System.out.println("INVALID");
			}
		}
		scanner.close();
	}
}
