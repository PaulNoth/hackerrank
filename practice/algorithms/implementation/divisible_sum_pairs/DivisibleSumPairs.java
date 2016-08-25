import java.util.*;

public class DivisibleSumPairs {

    public static void main(String[] args) {
        Scanner stdin = new Scanner(System.in);
        int n = stdin.nextInt();
        int divisor = stdin.nextInt();
        int[] array = new int[n];
        for(int i = 0; i < n; i++) {
            array[i] = stdin.nextInt();
        }

        int count = 0;
        for(int i = 0; i < n - 1; i++) {
            for(int j = i + 1; j < n; j++) {
                if((array[i] + array[j]) % divisor == 0) {
                    count++;
                }
            }
        }
        System.out.println(count);
        stdin.close();
    }
}