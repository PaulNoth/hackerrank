package weekly.week6;

import java.math.BigInteger;
import java.util.Scanner;

/**
 * <b>ACM ICPC Team</b>
 * <p>
 * You are given a list of N people who are attending ACM-ICPC World Finals.
 * Each of them are either well versed in a topic or they are not. Find out the
 * maximum number of topics a 2-people team can know. And also find out how many
 * teams can know that maximum number of topics?
 * </p>
 * <p>
 * Input Format<br>
 * The first line contains two integers N and M separated by a single space,
 * where N represents the number of people, and M represents the number of
 * topics. N lines follow. Each line contains a binary string of length M. In
 * this string, 1 indicates that the ith person knows a particular topic, and 0
 * indicates that the ith person does not know the topic.
 * </p>
 * <p>
 * Output Format<br>
 * 
 * On the first line, print the maximum number of topics a 2-people team can
 * know. On the second line, print the number of teams that can know the maximum
 * number of topics.
 * </p>
 * <p>
 * Constraints <br>
 * 2 ≤ N ≤ 3000 <br>
 * 1 ≤ M ≤ 1000
 * <p>
 * Sample Input <br>
 * 4 5 <br>
 * 10101<br>
 * 11100 <br>
 * 11010<br>
 * 00101
 * </p>
 * <p>
 * Sample Output<br>
 * 5 <br>
 * 2
 * <p>
 * Explanation <br>
 * (1, 3) and (3, 4) know all the 5 topics. So the maximal topics a 2-people
 * team knows is 5, and only 2 teams can acheive this.
 * </p>
 * 
 * @author Pidanic
 */
public class AcmIcpcTeam
{
	public static void main(String[] args)
	{
		Scanner scanner = new Scanner(System.in);
		int players = Integer.parseInt(scanner.next());
		int topics = Integer.parseInt(scanner.next());
		BigInteger[] teamTopics = new BigInteger[players];
		for (int i = 0; i < players; i++)
		{
			String input = scanner.next();
			BigInteger binary = new BigInteger(input, 2);
			teamTopics[i] = binary;
		}

		int teams = 0;
		int maxKnownTopics = 0;
		for (int i = 0; i < players; i++)
		{
			for (int j = i + 1; j < players; j++)
			{
				BigInteger commonTopics = teamTopics[i].or(teamTopics[j]);
				int knownTopics = knownTopics(commonTopics, topics);
				if(knownTopics > maxKnownTopics)
				{
					teams = 1;
					maxKnownTopics = knownTopics;
				}
				else if(maxKnownTopics == knownTopics)
				{
					teams++;
				}
			}
		}
		System.out.println(maxKnownTopics);
		System.out.println(teams);
		scanner.close();
	}

	private static int knownTopics(BigInteger binary, int topics)
	{
		int result = 0;
		for (int i = 0; i < topics; i++)
		{
			if(binary.testBit(i))
			{
				result++;
			}
		}
		return result;
	}
}
