import java.util.Scanner;

public class UtopianTree
{
	public static void main(String[] args)
	{
		Scanner scanner = new Scanner(System.in);
		int testCases = scanner.nextInt();

		for (int i = 0; i < testCases; i++)
		{
			int cycles = scanner.nextInt();
			System.out.println(utopianTree(cycles));
		}

		scanner.close();
	}

	private static int utopianTree(int cycles)
	{
		int height = 1;
		for (int i = 0; i < cycles; i++)
		{
			if(i % 2 == 0)
			{
				height *= 2;
			}
			else
			{
				height += 1;
			}
		}
		return height;
	}
}
