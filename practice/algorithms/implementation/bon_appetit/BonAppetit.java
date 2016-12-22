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
        int actual = stdin.nextInt();
        int charged = (Arrays.stream(prices).sum() - prices[k]) / 2;

        if(actual == charged) {
            System.out.println("Bon Appetit");
        } else {
            System.out.println(Math.abs(charged - actual));
        }
        stdin.close();
    }
}