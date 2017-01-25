public class DoubleBasePalindromes 
{
	public static void main(String[] args)
	{
		Scanner stdin = new Scanner(System.in);
		int n = stdin.nextInt();
		int base = stdin.nextInt();
		long sum = 0;
		for(int i = 1; i < n; i++)
		{
			String decimalString = Integer.toString(i, 10);
			String kBaseString = Integer.toString(i, base);
			if(isPalindrome(decimalString) && isPalindrome(kBaseString))
			{
				sum += i;
			}
		}
		System.out.println(sum);
		stdin.close();
	}
	
	
	private static boolean isPalindrome(String n)
	{
		for(int i = 0; i < n.length() / 2; i++)
		{
			char first = n.charAt(i);
			char last = n.charAt(n.length() - i - 1);
			if(first != last)
			{
				return false;
			}
		}
		return true;
	}
}
