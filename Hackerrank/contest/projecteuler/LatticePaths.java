package projecteuler;

import java.math.BigInteger;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

/**
 * <b>Project Euler #15: Lattice paths</b>
 * <p>
 * Starting in the top left corner of a 2×2 grid, and only being able to move to
 * the right and down, there are exactly 6 routes to the bottom right corner.
 * </p>
 * <p>
 * How many such routes are there through a N×M grid? As number of ways can be
 * very large, print it modulo 10<sup>9</sup>+7.
 * <p>
 * Input Format<br>
 * The first line contains an integer T , i.e., number of test cases. Next T
 * lines will contain integers N and M.
 * </p>
 * <p>
 * Output Format<br>
 * Print the values corresponding to each test case.
 * </p>
 * <p>
 * Constraints<br>
 * 1 <= T <= 10<sup>3</sup><br>
 * 1 <= N <= 500<br>
 * 1 <= M <= 500
 * </p>
 * <p>
 * Sample Input<br>
 * 2 <br>
 * 2 2<br>
 * 3 2
 * </p>
 * <p>
 * Sample Output<br>
 * 6<br>
 * 10
 * </p>
 * 
 * @author Pidanic
 *
 */
public class LatticePaths
{
    // http://www.robertdickau.com/lattices.html
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        int tests = Integer.parseInt(scanner.nextLine());
        for (int i = 0; i < tests; i++)
        {
            String[] numbers = scanner.nextLine().split("\\s+");
            int n = Integer.parseInt(numbers[0]);
            int m = Integer.parseInt(numbers[1]);
            Set<Integer> nFactorialMembers = new HashSet<>();
            for (int j = 1; j <= n; j++)
            {
                nFactorialMembers.add(j);
            }
            Set<Integer> mFactorialMembers = new HashSet<>();
            for (int j = 1; j <= m; j++)
            {
                mFactorialMembers.add(j);
            }
            Set<Integer> mnFactorialMembers = new HashSet<>();
            for (int j = 1; j <= m + n; j++)
            {
                mnFactorialMembers.add(j);
            }
            // (m+n) chose m === (m+n)!/m!n!
            // divided n!
            mnFactorialMembers.removeAll(nFactorialMembers);

            BigInteger result = BigInteger.ONE;
            for (Integer k : mnFactorialMembers)
            {
                result = result.multiply(new BigInteger(k.toString()));
            }
            for (Integer k : mFactorialMembers)
            {
                result = result.divide(new BigInteger(k.toString()));
            }
            System.out.println(result.mod(new BigInteger("1000000007")));
        }
        scanner.close();
    }
}
