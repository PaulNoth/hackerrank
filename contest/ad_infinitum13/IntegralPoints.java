import java.math.BigInteger;
import java.util.Scanner;

// FIXME something wrong with order of BigIntegers or other issue. Check RubyCode which passed.
public class IntegralPoints {
    public static void main(String[] args) {
        Scanner stdin = new Scanner(System.in);
        int tests = stdin.nextInt();
        for(int i = 0; i < tests; i++) {
            int x1 = stdin.nextInt();
            int y1 = stdin.nextInt();
            int x2 = stdin.nextInt();
            int y2 = stdin.nextInt();
            int x3 = stdin.nextInt();
            int y3 = stdin.nextInt();

            long outerPoints = outer(x1, y1, x2, y2);
            outerPoints += outer(x1, y1, x3, y3);
            outerPoints += outer(x2, y2, x3, y3);
            outerPoints += 3;

            BigInteger area = BigInteger.valueOf((long) x1).subtract(BigInteger.valueOf((long) x3))
                    .multiply(BigInteger.valueOf((long) y2).subtract(BigInteger.valueOf((long) y1)))

                    .subtract(

                            BigInteger.valueOf((long) x1).subtract(BigInteger.valueOf((long) x2))
                                    .multiply(BigInteger.valueOf((long) y3).subtract(BigInteger.valueOf((long) y1))));

            BigInteger interiorPoints = ((area.subtract(BigInteger.valueOf(outerPoints))).add(BigInteger.valueOf(2L))).divide(BigInteger.valueOf(2L)).max(BigInteger.ZERO);
            System.out.println(interiorPoints);
        }
        stdin.close();
    }

    private static long outer(int x1, int y1, int x2, int y2) {
        return Math.max(gcd(Math.abs(x2 - x1), Math.abs(y2 - y1)) - 1, 0);
    }

    private static long gcd(int x, int y) {
        if(y == 0) {
            return x;
        }
        return gcd(y, x % y);
    }
}
