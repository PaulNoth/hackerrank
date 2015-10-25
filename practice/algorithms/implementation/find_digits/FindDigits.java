import java.util.Scanner;

public class FindDigits 
{
	public static void main(String[] args)
	{
		Scanner stdin = new Scanner(System.in);
		int tests = Integer.parseInt(stdin.nextLine());
		for(int i = 0; i < tests; i++)
		{
			int result = 0;
			String number = stdin.nextLine();
			for(char digit : number.toCharArray())
			{
				if(Character.getNumericValue(digit) != 0 
						&& Integer.parseInt(number) % Character.getNumericValue(digit) == 0)
				{
					result++;
				}
			}
			System.out.println(result);
		}
		stdin.close();
	}
}
