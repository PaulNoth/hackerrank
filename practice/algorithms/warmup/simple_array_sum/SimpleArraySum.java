import java.util.Scanner;

public class SimpleArraySum 
{
    public static void main(String[] args)
	{
        Scanner stdin = new Scanner(System.in);
        final int n = stdin.nextInt();
        int sum = 0;
        for(int i = 0; i < n; i++)
		{
            sum += stdin.nextInt();
        }
        System.out.println(sum);
    }
}
