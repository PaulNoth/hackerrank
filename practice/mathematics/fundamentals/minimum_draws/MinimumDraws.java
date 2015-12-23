import java.util.*;

public class MinimumDraws {

    public static void main(String[] args) {
        Scanner stdin = new Scanner(System.in);
        int tests = stdin.nextInt();
        for(int i = 0; i < tests; i++) {
            System.out.println(stdin.nextInt() + 1);
        }
        stdin.close();
    }
}
