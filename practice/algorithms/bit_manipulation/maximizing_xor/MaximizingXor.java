import java.util.*;

public class MaximizingXor {

    public static void main(String[] args) {
        Scanner stdin = new Scanner(System.in);
        int l = stdin.nextInt();
        int r = stdin.nextInt();
        int max = 0;
        for(int i = l; i <= r; i++) {
            for(int j = l; j <= r; j++) {
                int xor = i ^ j;
                if(xor > max) {
                    max = xor;
                }
            }
        }
        System.out.println(max);
        stdin.close();
    }
}
