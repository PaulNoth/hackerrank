import java.util.Scanner;

public class DiagonalDifference 
{
	public static void main(String[] args)
	{
		Scanner stdin = new Scanner(System.in);
		int n = Integer.parseInt(stdin.nextLine());
		long sumLeftRight = 0;
		long sumRightLeft = 0;
		for(int i = 0; i < n; i++)
		{
			String[] elements = stdin.nextLine().split(" ");
			sumLeftRight += Long.parseLong(elements[i]);
			sumRightLeft += Long.parseLong(elements[n - i - 1]);
		}
		System.out.println(Math.abs(sumLeftRight - sumRightLeft));
		stdin.close();
	}
}
