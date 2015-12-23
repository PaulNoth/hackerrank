import java.util.*;

public class Handshake {

    public static void main(String[] args) {
        Scanner stdin = new Scanner(System.in);
        int tests = stdin.nextInt();
        for(int i = 0; i < tests; i++) {
            long handshakes = 0;
            int directors = stdin.nextInt();
            for(int j = 0; j < directors; j++) {
                handshakes += j;
            }
            System.out.println(handshakes);
        }
        stdin.close();
    }
}
