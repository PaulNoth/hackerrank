import java.util.*;

public class IceCreamParlor {

    public static void main(String[] args) {
        Scanner stdin = new Scanner(System.in);
        int tests = Integer.parseInt(stdin.nextLine());
        for(int i = 0; i < tests; i++) {
            int amount = Integer.parseInt(stdin.nextLine());
            int length = Integer.parseInt(stdin.nextLine());
            int[] costs = new int[length];
            String[] strings = stdin.nextLine().split(" ");
            for(int j = 0; j < length; j++) {
                costs[j] = Integer.parseInt(strings[j]);
            }
            for(int j = 0; j < length - 1; j++) {
                for(int k = j + 1; k < length; k++) {
                    if(costs[j] + costs[k] == amount) {
                        System.out.println((j + 1) + " " + (k + 1));
                    }
                }
            }
        }
        stdin.close();
    }
}