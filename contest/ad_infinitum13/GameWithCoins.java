import java.util.Scanner;

public class GameWithCoins {
    public static void main(String[] args) {
        Scanner stdin = new Scanner(System.in);
        int tests = stdin.nextInt();
        for(int i = 0; i < tests; i++) {
            int a = stdin.nextInt();
            int b = stdin.nextInt();
            System.out.println(game(a, b));
        }
    }

    private static String game(int a, int b) {
        if(a == 0 || b == 0 || Math.abs(a - b) % 2 == 1) {
            return "First";
        }
        return "Second";
    }
}
