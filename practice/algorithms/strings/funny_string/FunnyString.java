import java.util.Scanner;

public class FunnyString 
{

	public static void main(String[] args)
	{
		Scanner stdin = new Scanner(System.in);
		int tests = Integer.parseInt(stdin.nextLine());
		for(int i = 0; i < tests; i++)
		{
			String s = stdin.nextLine();
			if(isFunny(s))
			{
				System.out.println("Funny");
			}
			else
			{
				System.out.println("Not Funny");
			}
			
		}
		stdin.close();
	}
	
	private static boolean isFunny(String s)
	{
		for(int j = 0; j < s.length() - 1; j++)
		{
			if(Math.abs(Character.codePointAt(s, j + 1) - Character.codePointAt(s, j)) !=
					Math.abs(Character.codePointAt(s, s.length() - j - 2) - Character.codePointAt(s, s.length() - j - 1)))
			{
				return false;
			}
		}
		return true;
	}
}
