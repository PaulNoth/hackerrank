import java.util.*;

public class Flowers {

    private static class Descending implements Comparator<Integer> {
        @Override
        public int compare(Integer i, Integer j) {
            return j - i;
        }
    }

    public static void main(String[] args) {
        Scanner stdin = new Scanner(System.in);
        int n = stdin.nextInt();
        int k = stdin.nextInt();
        Integer[] prices = new Integer[n];
        for(int i = 0; i < n; i++) {
            prices[i] = stdin.nextInt();
        }
        Arrays.sort(prices, new Descending());
        int sum = 0;
        for(int i = 0; i < n; i++) {
            int factor = i / k;
            sum += prices[i] * (factor + 1);
        }
        System.out.println(sum);
        stdin.close();
    }
}