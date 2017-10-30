import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner stdin = new Scanner(System.in);
        int tests = stdin.nextInt();
        int[] bars = new int[tests];
        for(int i = 0; i < tests; i++) {
            bars[i] = stdin.nextInt();
        }
        int d = stdin.nextInt();
        int m = stdin.nextInt();

        int result = 0;
        for(int i = 0; i < bars.length - m + 1; i++) {
            int sum = 0;
            for(int j = i; j < i + m; j++) {
                sum += bars[j];
            }
            if(sum == d) {
                result++;
            }
        }

        System.out.println(result);
        stdin.close();
    }
}