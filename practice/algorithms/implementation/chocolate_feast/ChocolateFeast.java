import java.util.*;

public class ChocolateFeast {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        for(int i = 0; i < t; i++){
            System.out.println(solve(in.nextInt(), in.nextInt(), in.nextInt()));
        }
    }

    private static long solve(int N, int C, int M) {
        int result = 0;
        int bought = N / C;
        result += bought;

        int wrappers = bought;
        while(wrappers >= M) {
            int freeChoco = wrappers / M;
            result += freeChoco;
            wrappers = wrappers - freeChoco * M + freeChoco;
        }
        return result;
    }
}