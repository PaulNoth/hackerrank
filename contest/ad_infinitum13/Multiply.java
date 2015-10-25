import java.util.*;

public class Multiply {
    public static void main(String[] args) {
        Scanner stdin = new Scanner(System.in);
        int n = stdin.nextInt();
        int q = stdin.nextInt();
        List<Integer> list = new LinkedList<>();
        int first = stdin.nextInt();
        int max = n * first;
        list.add(max);

        for(int i = 1; i < q; i++) {
            int num = stdin.nextInt();
            list.add(num);
            if(num > max) {
                max = num;
            }
        }
        List<Integer> primes = eratosthenes(max);
       // System.out.println(primes);
        Map<Integer, Integer> primeCount = new HashMap<>();

        for(int number : list) {
            int j = number;
            for (int prime : primes) {
                if (prime > number) {
                    break;
                }
                int count = 0;
                while(j % prime == 0) {
                    j /= prime;
                    count++;
                }
                Integer p = primeCount.get(prime);
                if(p == null) {
                    primeCount.put(prime, count);
                } else {
                    primeCount.put(prime, p + count);
                }
            }

            long prod = 1;
            for(int prime : primeCount.keySet()) {
                int count = primeCount.get(prime);
                if(count > 0) {
                    prod *= ((Math.pow(prime, count + 1) - 1) / (prime - 1));
                    prod %= (1_000_000_007);
                }
            }
            System.out.println(prod);
        }

        stdin.close();
    }

    private static List<Integer> eratosthenes(int number)
    {
        boolean[] array = new boolean[number + 1];
        for (int i = 0; i < array.length; i++)
        {
            array[i] = true;
        }
        for (int i = 2; i < array.length; i++)
        {
            if (array[i])
            {
                int j = i;
                while (i * j >= 0 && i * j < array.length)
                {
                    array[i * j] = false;
                    j++;
                }
            }
        }
        List<Integer> primes = new ArrayList<>();
        for (int i = 2; i < array.length; i++)
        {
            if (array[i])
            {
                primes.add(i);
            }
        }
        return primes;
    }
}
