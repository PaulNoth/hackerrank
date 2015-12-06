import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

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
