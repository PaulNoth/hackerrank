package projecteuler;

import java.util.Scanner;

/**
 * <b>Project Euler #14: Longest Collatz Sequence</b>
 * <p>
 * The following iterative sequence is defined for the set of positive integers:
 * </p>
 * 
 * <pre>
 * n -> n/2   n is even
 * n -> 3n+1  n is odd
 * </pre>
 * 
 * Using the rule above and starting with 13, we generate the following
 * sequence:
 * 
 * <pre>
 * 13->40->20->10->5->16->8->4->2->1
 * </pre>
 * <p>
 * It can be seen that this sequence (starting at 13 and finishing at 1)
 * contains 10 terms. Although it has not been proved yet (Collatz Problem), it
 * is thought that all starting numbers finish at 1.
 * </p>
 * Which starting number, ≤N produces the longest chain? If many possible such
 * numbers are there print the maximum one.
 * <p>
 * Note: Once the chain starts the terms are allowed to go above N.
 * </p>
 * <p>
 * Input Format The first line contains an integer T , i.e., number of test
 * cases. Next T lines will contain an integers N.
 * </p>
 * <p>
 * Output Format Print the values corresponding to each test case.
 * </p>
 * <p>
 * Constraints 1 ≤ T ≤ 104 1 ≤ N ≤ 5*106
 * </p>
 * <p>
 * Sample Input<br>
 * 3<br>
 * 10<br>
 * 15<br>
 * 20
 * </p>
 * <p>
 * Sample Output<br>
 * 9<br>
 * 9<br>
 * 19
 * </p>
 * 
 * @author Pidanic
 *
 */
public class LongestCollatzSequence
{
    private static final int CACHE_SIZE = 5_000_000;

    // stores collatz sequence for number at index
    private static int[] cache = new int[CACHE_SIZE + 1];

    // stores number with max collatz sequence at index
    private static int[] collatzCache = new int[CACHE_SIZE + 1];

    public static void main(String[] args)
    {
        precomputeCache();

        Scanner scanner = new Scanner(System.in);
        int tests = Integer.parseInt(scanner.nextLine());
        for (int i = 0; i < tests; i++)
        {
            int n = Integer.parseInt(scanner.nextLine());
            System.out.println(collatzCache[n]);
        }

        scanner.close();
    }

    private static void precomputeCache()
    {
        cache[0] = 1;
        cache[1] = 1;
        collatzCache[0] = 1;
        collatzCache[1] = 1;
        int maxSeq = 0;
        int maxNum = 0;
        for (int j = 2; j <= CACHE_SIZE; j++)
        {
            int collatzSeq = 0;
            long number = j;
            while (number > 1)
            {
                if(cache[j] > 0)
                {
                    collatzSeq += cache[j];
                    break;
                }
                collatzSeq++;
                if(number % 2 == 0)
                {
                    number >>= 1;
                }
                else
                {
                    number = 3 * number + 1;
                }
            }
            cache[j] = collatzSeq;
            if(collatzSeq >= maxSeq)
            {
                maxSeq = collatzSeq;
                maxNum = j;
            }
            collatzCache[j] = maxNum;
        }
    }
}