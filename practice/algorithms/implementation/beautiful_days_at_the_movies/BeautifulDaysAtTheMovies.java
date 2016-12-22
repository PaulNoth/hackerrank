import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner stdin = new Scanner(System.in);
        int start = stdin.nextInt();
        int end = stdin.nextInt();
        int k = stdin.nextInt();
        int count = 0;
        for(int i = start; i <= end; i++) {
            String s = String.valueOf(i);
            String reversed = new StringBuilder(s).reverse().toString();
            int diff = Math.abs(Integer.parseInt(s) - Integer.parseInt(reversed));
            if(diff % k == 0) {
                count++;
            }
        }
        System.out.println(count);
        stdin.close();
    }
}