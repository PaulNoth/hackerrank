import java.math.BigInteger;
import java.util.Scanner;

public class PowerDigitSum
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        int tests = Integer.parseInt(scanner.nextLine());
        for (int i = 0; i < tests; i++)
        {
            BigInteger base = new BigInteger("2");
            int exp = Integer.parseInt(scanner.nextLine().trim());
            base = base.pow(exp);
            long result = sumDigits(base);
            System.out.println(result);
        }
        scanner.close();
    }

    private static long sumDigits(BigInteger num)
    {
        long result = 0;
        char[] digits = num.toString().toCharArray();
        for (char digit : digits)
        {
            result += Character.digit(digit, 10);
        }
        return result;
    }
}
