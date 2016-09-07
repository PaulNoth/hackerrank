import java.util.*;

public class MinimumDistances {

    public static void main(String[] args) {
        Scanner stdin = new Scanner(System.in);
        int n = stdin.nextInt();
        int[] array = new int[n];
        for(int i = 0; i < n; i++) {
            array[i] = stdin.nextInt();
        }

        int min = Integer.MAX_VALUE;
        for(int i = 0; i < n - 1; i++) {
            for(int j = i + 1; j < n; j++) {
                if(array[i] == array[j]) {
                    min = Math.min(min, Math.abs(j - i));
                }
            }
        }
        int result = (min == Integer.MAX_VALUE ? -1 : min);
        System.out.println(result);
        stdin.close();
    }
}