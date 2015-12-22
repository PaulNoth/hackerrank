import java.math.BigInteger;
import java.util.*;
import java.math.BigInteger;

public class FillingJars {

    public static void main(String[] args) {
        Scanner stdin = new Scanner(System.in);
        int jars = stdin.nextInt();
        int operations = stdin.nextInt();
        BigInteger sum = BigInteger.ZERO;
        for(int i = 0; i < operations; i++) {
            BigInteger a = BigInteger.valueOf(stdin.nextLong());
            BigInteger b = BigInteger.valueOf(stdin.nextLong());
            BigInteger candies = BigInteger.valueOf(stdin.nextLong());
            sum = sum.add((b.subtract(a).add(BigInteger.ONE)).multiply(candies));
        }
        BigInteger avg = sum.divide(BigInteger.valueOf(jars));
        System.out.println(avg);
        stdin.close();
    }
}
