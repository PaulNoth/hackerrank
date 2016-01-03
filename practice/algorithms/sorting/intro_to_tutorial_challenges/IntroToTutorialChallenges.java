import java.util.Scanner;

public class IntroToTutorialChallenges
{
	public static void main(String[] args)
	{
		Scanner stdin = new Scanner(System.in);
		int v = Integer.parseInt(stdin.nextLine());
		int size = Integer.parseInt(stdin.nextLine());
		String[] numbers = stdin.nextLine().split(" ");
		System.out.println(getPosition(numbers, v));
		
		stdin.close();
	}
	
	private static int getPosition(String[] numbers, int v)
	{
		for(int i = 0; i < numbers.length; i++)
		{
			if(v == Integer.parseInt(numbers[i]))
			{
				return i;
			}
		}
		return 0;
	}
}
