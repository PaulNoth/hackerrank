import java.math.BigInteger;
import java.util.Scanner;

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
