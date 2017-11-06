import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner stdin = new Scanner(System.in);
        int n = stdin.nextInt();
        int p = stdin.nextInt();

        int fromFront = p;
        int fromBack = n;
        if(n % 2 == 0) {
            fromBack = n + 1;
        }
        int result = Math.min(fromFront / 2, (fromBack - p) / 2);
        System.out.println(result);

        stdin.close();
    }
}