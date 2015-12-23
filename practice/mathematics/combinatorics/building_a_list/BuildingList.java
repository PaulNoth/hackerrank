import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class BuildingList
{
	public static void main(String[] args)
	{
		Scanner scanner = new Scanner(System.in);
		int testCases = Integer.parseInt(scanner.next());
		for (int i = 0; i < testCases; i++)
		{
			int length = Integer.parseInt(scanner.next());
			String input = scanner.next();
			List<String> result = new ArrayList<String>();
			combine(result, input, 0, "");
			Collections.sort(result);
			for (String s : result)
			{
				System.out.println(s);
			}
		}
		scanner.close();
	}

	private static void combine(List<String> result, String input, int start,
			String actual)
	{
		for (int i = start; i < input.length(); i++)
		{
			String out = actual;
			actual += input.charAt(i);
			result.add(actual);
			if(i < input.length())
			{
				combine(result, input, i + 1, out);
			}
		}
	}
}
