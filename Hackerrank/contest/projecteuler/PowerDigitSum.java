package projecteuler;

import java.math.BigInteger;
import java.util.Scanner;

/**
 * <b>Project Euler #16: Power digit sum</b>
 * <p>
 * 2<sup>9</sup>=512 and the sum of its digits is 5+1+2=8.
 * </p>
 * <p>
 * What is the sum of the digits of the number 2<sup>N</sup> ?
 * </p>
 * <p>
 * Input Format<br>
 * The first line contains an integer T , i.e., number of test cases. Next T
 * lines will contain an integer N.
 * </p>
 * <p>
 * Output Format<br>
 * Print the values corresponding to each test case.
 * </p>
 * <p>
 * Constraints<br>
 * 1<=T<=100 <br>
 * 1<=N<=10<sup>4</sup>
 * </p>
 * <p>
 * Sample Input<br>
 * 3<br>
 * 3<br>
 * 4<br>
 * 7
 * </p>
 * <p>
 * Sample Output<br>
 * 8<br>
 * 7<br>
 * 11
 * </p>
 * 
 * @author Pidanic
 *
 */
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
