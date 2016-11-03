import java.util.*;

public class SockMerchant {

    public static void main(String[] args) {
        Scanner stdin = new Scanner(System.in);
        int sockCount = stdin.nextInt();
        Map<Integer, Integer> sockGroupsCount = new HashMap<>();
        for(int i = 0; i < sockCount; i++) {
            int color = stdin.nextInt();
            if(sockGroupsCount.containsKey(color)) {
                int count = sockGroupsCount.get(color);
                sockGroupsCount.put(color, count + 1);
            } else {
                sockGroupsCount.put(color, 1);
            }
        }
        int pairs = 0;
        for(int count : sockGroupsCount.values()) {
            pairs += count / 2;
        }

        System.out.println(pairs);
        stdin.close();
    }
}