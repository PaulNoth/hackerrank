import java.util.Scanner;

public class FlippingBits 
{	
	private static int MAX = 0b11_111_111_111_111_111_111_111_111_111_111;
	
	public static void main(String[] args)
	{
		Scanner stdin = new Scanner(System.in);
		int tests = Integer.parseInt(stdin.nextLine());
		for(int i = 0; i < tests; i++)
		{
			int input = (int) Long.parseLong(stdin.nextLine());
			System.out.println(Long.valueOf(Integer.toBinaryString(MAX ^ input), 2));
		}
		stdin.close();
		
	}
		
}
