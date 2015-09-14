import java.math.BigInteger;
import java.util.Scanner;

public class ExtraLongFactorials
{
    public static void main(String[] args)
    {
        Scanner stdin = new Scanner(System.in);
        BigInteger n = stdin.nextBigInteger();
        System.out.println(factorial(n));
    }

    private static BigInteger factorial(BigInteger n)
    {
        if(n.compareTo(BigInteger.ONE) <= 0)
        {
            return BigInteger.ONE;
        }
        else
        {
            return n.multiply(factorial(n.subtract(BigInteger.ONE)));
        }
    }
}
