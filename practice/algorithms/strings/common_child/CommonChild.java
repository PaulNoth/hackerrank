import java.util.Scanner;

public class CommonChild
{
	public static void main(String[] args)
	{
		Scanner scanner = new Scanner(System.in);
		String input1 = scanner.nextLine();
		String input2 = scanner.nextLine();

		int result = lcsOptimized(input1, input2);
		System.out.println(result);
		scanner.close();
	}

	private static int lcsOptimized(String input1, String input2)
	{
		int start = 0;
		int inEnd1 = input1.length() - 1;
		int inEnd2 = input2.length() - 1;

		while (start <= inEnd1 && start <= inEnd2
				&& input1.charAt(start) == input2.charAt(start))
		{
			start++;
		}

		while (start <= inEnd1 && start <= inEnd2
				&& input1.charAt(inEnd1) == input2.charAt(inEnd2))
		{
			inEnd1--;
			inEnd2--;
		}
		int[][] table = new int[inEnd1 - start + 1][inEnd2 - start + 1];
		for (int i = 0; i < table.length; i++)
		{
			for (int j = 0; j < table[i].length; j++)
			{
				table[i][j] = input1.length() - inEnd1 - 1;
			}
		}

		for (int i = start; i < inEnd1; i++)
		{
			for (int j = start; j < inEnd2; j++)
			{
				if(input1.charAt(i) == input2.charAt(j))
				{
					table[i + 1][j + 1] = table[i][j] + 1;
				}
				else
				{
					table[i + 1][j + 1] = table[i + 1][j] > table[i][j + 1] ? table[i + 1][j]
							: table[i][j + 1];
				}
			}
		}

		return table[inEnd1][inEnd2];
	}
}
