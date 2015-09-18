import java.math.BigInteger;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

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
