import java.util.*;

public class MaxMin {

    public static void main(String[] args) {
        Scanner stdin = new Scanner(System.in);
        int tests = Integer.parseInt(stdin.nextLine());
        int k = Integer.parseInt(stdin.nextLine());
        int[] candies = new int[tests];
        for(int i = 0; i < tests; i++) {
            candies[i] = Integer.parseInt(stdin.nextLine());
        }
        Arrays.sort(candies);
        int unfairness = candies[candies.length - 1];
        for(int i = 0; i <= candies.length - k; i++) {
            int temp = candies[i + k - 1] - candies[i];
            if(unfairness > temp) {
                unfairness = temp;
            }
        }
        System.out.println(unfairness);
        stdin.close();
    }
}