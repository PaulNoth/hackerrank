import java.util.*;

public class FindPoint {

    public static void main(String[] args) {
        Scanner stdin = new Scanner(System.in);
        int points = stdin.nextInt();
        for(int i = 0; i < points; i++) {
            int x = stdin.nextInt();
            int y = stdin.nextInt();
            int mx = stdin.nextInt();
            int my = stdin.nextInt();
            int sx = 2 * mx - x;
            int sy = 2 * my - y;
            System.out.println(sx + " " + sy);
        }
        stdin.close();
    }
}
