import java.util.Scanner;

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