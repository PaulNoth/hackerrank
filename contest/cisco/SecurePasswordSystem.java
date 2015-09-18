import java.util.Scanner;

public class SecurePasswordSystem
{
    public static void main(String[] args)
    {
        Scanner stdin = new Scanner(System.in);
        int tests = Integer.parseInt(stdin.nextLine());
        for (int i = 0; i < tests; i++)
        {
            String[] lenghts = stdin.nextLine().split(" ");
            int minLength = Integer.parseInt(lenghts[0]);
            int maxLength = Integer.parseInt(lenghts[1]);
            long combinations = 0;
            for (int exp = minLength; exp <= maxLength; exp++)
            {
                combinations += Math.pow(10, exp);
            }
            if(combinations > 1_000_000)
            {
                System.out.println("YES");
            }
            else
            {
                System.out.println("NO");
            }
        }
        stdin.close();
    }

}
