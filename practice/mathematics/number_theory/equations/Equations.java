import java.util.*;

public class Equations {

    public static void main(String[] args) {
        Scanner stdin = new Scanner(System.in);
        int n = stdin.nextInt();
        long result = 1;
        if(n == 1) {
            result = 1;
        } else {
            List<Integer> primes = eratosthenes(n);
            for(int i = 0; i < primes.size(); i++) {
                long prime = primes.get(i);
                long num = n;
                long exp = 0;
                while(num > 0) {
                    long div = num / prime;
                    num /= prime;
                    exp += div;
                }
                result *= (2 * exp + 1);
                result %= 1000007;
            }
        }
        System.out.println(result);
        stdin.close();
    }

    private static List<Integer> eratosthenes(int num) {
        List<Integer> result = new LinkedList<>();
        boolean[] primes = new boolean[num + 1];
        Arrays.fill(primes, true);
        for(int i = 2; i < primes.length; i++) {
            if (primes[i]) {
                long j = i;
                while (j * i < primes.length) {
                    primes[(int)j * i] = false;
                    j++;
                }
            }
        }
        for(int i = 2; i < primes.length; i++) {
            if (primes[i]) {
                result.add(i);
            }
        }
        return result;
    }
}
