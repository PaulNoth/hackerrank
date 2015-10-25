import java.math.BigInteger;
import java.util.Scanner;

public class DeletionGame
{
    public static void main(String[] args) {
        Scanner stdin = new Scanner(System.in);
        int tests = stdin.nextInt();
        for(int i = 0; i < tests; i++) {
            BigInteger n = BigInteger.valueOf(stdin.nextLong());
            BigInteger k = BigInteger.valueOf(stdin.nextLong());
            BigInteger maxSum = ((BigInteger.ONE.add(n)).multiply(n)).divide(new BigInteger("2"));
            BigInteger minSum = maxSum.negate();
            System.out.println(invariant(n, k, maxSum, minSum));
        }

        stdin.close();
    }

    private static String invariant(BigInteger n, BigInteger k, BigInteger maxSum, BigInteger minSum) {
        if(k.compareTo(maxSum) > 0) {
            return "NO";
        }
        if(k.compareTo(minSum) < 0) {
            return "NO";
        }
        BigInteger mod = n.mod(new BigInteger("4"));
        if((mod.equals(BigInteger.ONE) || mod.equals(new BigInteger("2")))
                && k.mod(new BigInteger("2")).equals(BigInteger.ONE)) {
            return "YES";
        }
        if((mod.equals(BigInteger.ZERO) || mod.equals(new BigInteger("3")))
                && k.mod(new BigInteger("2")).equals(BigInteger.ZERO)) {
            return "YES";
        }
        return "NO";
    }
}
