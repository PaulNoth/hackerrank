import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class SumOfAbsolutes 
{
	public static void main(String[] args)
	{
		Scanner stdin  = new Scanner(System.in);
		String[] nq = stdin.nextLine().split(" ");
		int n = Integer.parseInt(nq[0]);
		int queries = Integer.parseInt(nq[1]);
		String[] integers = stdin.nextLine().split(" ");
		int[] array = new int[n];
		for(int i = 0; i < integers.length;i++)
		{
			array[i] = Integer.parseInt(integers[i]);
		}
		Map<String, Boolean> cache = new HashMap<>();
		for(int i = 0; i < queries; i++)
		{
			String query = stdin.nextLine();
			boolean even;
			if(cache.containsKey(query))
			{
				even = cache.get(query);
			}
			else {
				String[] lr = query.split(" ");
				even = isEven(array, Integer.parseInt(lr[0]), Integer.parseInt(lr[1]));
				cache.put(query, even);
			}
			if(even)
			{
				System.out.println("Even");
			}
			else
			{
				System.out.println("Odd");
			}
		}
		
		stdin.close();
	}
	
	private static boolean isEven(int[] array, int left, int right)
	{
		int absSum = 0;
		for(int i = left - 1; i < right; i++)
		{
			absSum = Math.abs(absSum + array[i]);
		}
		return absSum % 2 == 0;
	}
}
