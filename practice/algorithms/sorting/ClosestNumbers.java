import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class ClosestNumbers
{
	public static void main(String[] args)
	{
		Scanner scanner = new Scanner(System.in);
		int n = Integer.parseInt(scanner.nextLine());
		long[] numbers = new long[n];
		String[] input = scanner.nextLine().trim().split("\\s+");
		for (int i = 0; i < n; i++)
		{
			numbers[i] = Long.parseLong(input[i]);
		}
		Arrays.sort(numbers);

		long min = Long.MAX_VALUE;
		List<Long> result = new ArrayList<>();
		for (int i = 0; i < n - 1; i++)
		{
			long diff1 = numbers[i] - numbers[i + 1];
			if (diff1 > 0)
			{
				if (diff1 < min)
				{
					result.clear();
					result.add(numbers[i]);
					result.add(numbers[i + 1]);
					min = diff1;
				}
				else if (diff1 == min)
				{
					result.add(numbers[i]);
					result.add(numbers[i + 1]);
				}
			}
			long diff2 = numbers[i + 1] - numbers[i];
			if (diff2 > 0)
			{
				if (diff2 < min)
				{
					result.clear();
					result.add(numbers[i]);
					result.add(numbers[i + 1]);
					min = diff2;
				}
				else if (diff2 == min)
				{
					result.add(numbers[i]);
					result.add(numbers[i + 1]);
				}
			}
		}

		Collections.sort(result);
		StringBuilder sb = new StringBuilder();
		for (long l : result)
		{
			sb.append(l);
			sb.append(" ");
		}
		System.out.println(sb.toString().trim());
		scanner.close();
	}
}
