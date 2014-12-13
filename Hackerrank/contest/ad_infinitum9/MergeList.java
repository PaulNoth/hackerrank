package ad_infinitum9;

import java.math.BigInteger;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

/**
 * <p>
 * Shashank is very excited after learning about the <i>linked list</i>. He
 * learned about how to <i>merge</i> two linked lists. When we merge two linked
 * lists, the order of the elements of each list doesn't change. For example, if
 * we merge <tt>[1,2,3]</tt> and <tt>[4,5,6]</tt>, <tt>[1,4,2,3,5,6]</tt> is a
 * valid merge, while <tt>[1,4,3,2,5,6]</tt> is not a valid merge because
 * <tt>3</tt> is appears before <tt>2</tt>.
 * </p>
 * <p>
 * Shashank wants you to solve a problem for him: You are given two lists having
 * sizes <tt>N</tt> and <tt>M</tt>. How many ways can we merge both the lists?
 * It is given that all <tt>N+M</tt> elements are distinct. As your answer can
 * be quite large, Shashank wants you to print it <tt>mod 10<sup>9</sup>+7</tt>.
 * </p>
 * <p>
 * Input Format<br>
 * The first line contains an integer <tt>T</tt>, the number of test cases. Each
 * of the next <tt>T</tt> lines contains two integers <tt>N</tt> and <tt>M</tt>.
 * </p>
 * <p>
 * Output Format<br>
 * Print the value of the answer <tt>mod 10<sup>9</sup>+7</tt>.
 * </p>
 * <p>
 * Constraints <br>
 * 1≤T≤10<br>
 * 1≤N≤100<br>
 * 1≤M≤100
 * 
 * <p>
 * Sample Input <br>
 * 1 <br>
 * 2 2
 * </p>
 * <p>
 * Sample Output <br>
 * 6
 * </p>
 * <p>
 * Explanation <br>
 * Suppose the two lists are <tt>[1,2]</tt> and <tt>[3,4]</tt>. The different
 * ways of merging these lists are given below: <br>
 * <tt>[1,2,3,4]</tt><br>
 * <tt>[1,3,2,4]</tt><br>
 * <tt>[3,4,1,2]</tt><br>
 * <tt>[3,1,4,2]</tt><br>
 * <tt>[1,3,4,2]</tt><br>
 * <tt>[3,1,2,4]</tt>
 * </p>
 * 
 * @author Pidanic
 *
 */
public class MergeList
{
    // Lattice Path
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
