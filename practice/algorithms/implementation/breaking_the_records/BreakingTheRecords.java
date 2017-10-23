import java.util.*;

public class BreakingTheRecords {

    public static void main(String[] args) {
        Scanner stdin = new Scanner(System.in);
        int tests = stdin.nextInt();
        long[] records = new long[tests];
        for(int i = 0; i < tests; i++) {
            records[i] = stdin.nextLong();
        }

        long mostPoints = records[0];
        long leastPoints = records[0];
        int mostPointsBreak = 0;
        int leastPointsBreak = 0;
        for(int i = 1; i < tests; i++) {
            long points = records[i];
            if(points > mostPoints) {
                mostPoints = points;
                mostPointsBreak += 1;
            }
            if(points < leastPoints) {
                leastPoints = points;
                leastPointsBreak += 1;
            }
        }

        System.out.println(mostPointsBreak + " " + leastPointsBreak);
        stdin.close();
    }
}