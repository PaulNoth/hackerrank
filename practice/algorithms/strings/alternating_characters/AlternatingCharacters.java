import java.util.Scanner;

public class AlternatingCharacters 
{
	public static void main(String[] args)
	{
		Scanner stdin = new Scanner(System.in);
		int tests = Integer.parseInt(stdin.nextLine());
		for(int i = 0; i < tests; i++)
		{
			String string = stdin.nextLine();
			int deletions = 0;
			char c = string.charAt(0);
			for(int j = 1; j < string.length(); j++)
			{
				if(c == string.charAt(j))
				{
					deletions++;
				}
				else
				{
					c = string.charAt(j);
				}
			}
			System.out.println(deletions);
		}
		
		stdin.close();
	}
}
