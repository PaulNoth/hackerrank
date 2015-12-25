import java.util.*;

public class BdayGift {

    public static void main(String[] args) {
        Scanner stdin = new Scanner(System.in);
        int tests = stdin.nextInt();
        long sum = 0;
        for(int i = 0; i < tests; i++) {
            sum += stdin.nextInt();
        }
        System.out.format("%.1f", (double) sum / 2);
        stdin.close();
    }
}
