import java.util.*;

public class Kangaroo {

    public static void main(String[] args) {
        Scanner stdin = new Scanner(System.in);
        int x1 = stdin.nextInt();
        int v1 = stdin.nextInt();
        int x2 = stdin.nextInt();
        int v2 = stdin.nextInt();

        System.out.println(isSameLocation(x1, v1, x2, v2));
        stdin.close();
    }

    private static String isSameLocation(int x1, int v1, int x2, int v2) {
        if(v1 < v2) return "NO";
        if(x1 < x2 && v1 > v2) {
            int xDiff = Math.abs(x1 - x2);
            int vDiff = Math.abs(v1 - v2);
            if(xDiff % vDiff == 0) {
                return "YES";
            } else {
                return "NO";
            }
        }
        return "NO";
    }
}