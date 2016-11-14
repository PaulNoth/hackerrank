import java.util.*;

public class AppleAndOrange {

    public static void main(String[] args) {
        Scanner stdin = new Scanner(System.in);
        int s = stdin.nextInt();
        int t = stdin.nextInt();
        int a = stdin.nextInt();
        int b = stdin.nextInt();
        int m = stdin.nextInt();
        int n = stdin.nextInt();
        int[] apples = new int[m];
        for(int i = 0; i < m; i++) {
            apples[i] = stdin.nextInt();
        }
        int[] oranges = new int[n];
        for(int i = 0; i < n; i++) {
            oranges[i] = stdin.nextInt();
        }

        int fallenApples = (int) Arrays.stream(apples).filter(ap -> (a + ap >= s) && (a + ap <= t)).count();
        int fallenOranges = (int) Arrays.stream(oranges).filter(o -> (b + o >= s) && (b + o <= t)).count();

        System.out.println(fallenApples);
        System.out.println(fallenOranges);

        stdin.close();
    }
}