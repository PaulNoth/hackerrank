import java.util.Scanner;

public class HurdleRace {
    public static void main(String[] args) {
        Scanner stdin = new Scanner(System.in);
        int n = stdin.nextInt();
        int k = stdin.nextInt();
        int maxHeight = 0;
        for(int i = 0; i < n; i++) {
            int height = stdin.nextInt();
            if(height > maxHeight) {
                maxHeight = height;
            }
        }

        if(maxHeight > k) {
            System.out.println(maxHeight - k);
        } else {
            System.out.println(0);
        }
        stdin.close();
    }
}
