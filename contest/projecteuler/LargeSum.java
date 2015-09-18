import java.math.BigInteger;
import java.util.Scanner;

public class LargeSum
{
	public static void main(String[] args)
	{
		Scanner scanner = new Scanner(System.in);
		int numbers = Integer.parseInt(scanner.nextLine());
		BigInteger sum = BigInteger.ZERO;
		for (int i = 0; i < numbers; i++)
		{
			String input = scanner.nextLine();
			sum = sum.add(new BigInteger(input));
		}
		System.out.println(sum.toString().substring(0, 10));
		scanner.close();
	}
}
