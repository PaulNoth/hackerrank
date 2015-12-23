import java.util.*;

public class HalloweenParty {

    public static void main(String[] args) {
        Scanner stdin = new Scanner(System.in);
        int tests = stdin.nextInt();
        for(int i = 0; i < tests; i++) {
            long k = stdin.nextLong();
            long horizontal = k / 2;
            long vertical = k - horizontal;
            System.out.println(vertical * horizontal);
        }
        stdin.close();
    }
}
