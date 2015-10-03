import java.util.Scanner;

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
