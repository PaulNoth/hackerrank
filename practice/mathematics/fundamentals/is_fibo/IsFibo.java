import java.math.BigInteger;
import java.util.*;

public class IsFibo {

    public static void main(String[] args) {
        Scanner stdin = new Scanner(System.in);
        int tests = stdin.nextInt();
        for(int i = 0; i < tests; i++) {
            BigInteger n = stdin.nextBigInteger();
            System.out.println(isFibo(n));
        }
        stdin.close();
    }

    private static String isFibo(BigInteger n) {
        BigInteger fib0 = BigInteger.ZERO;
        BigInteger fib1 = BigInteger.ONE;
        while(fib0.compareTo(n) <= 0) {
            if (fib0.compareTo(n) == 0) return "IsFibo";
            BigInteger temp = fib0;
            fib0 = fib1;
            fib1 = fib1.add(temp);
        }
        return "IsNotFibo";
    }
}
