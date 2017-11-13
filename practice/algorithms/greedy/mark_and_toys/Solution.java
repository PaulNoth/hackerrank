import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner stdin = new Scanner(System.in);
        int n = stdin.nextInt();
        int k = stdin.nextInt();
        int[] prices = new int[n];
        for(int i = 0; i < n; i++) {
            prices[i] = stdin.nextInt();
        }

        Arrays.sort(prices);
        int sum = 0;
        int toys = 0;
        for(int i = 0; i < n; i++) {
            int p = prices[i];
            sum += p;
            if(sum > k) {
                break;
            }
            toys++;
        }
        System.out.println(toys);
        stdin.close();
    }
}