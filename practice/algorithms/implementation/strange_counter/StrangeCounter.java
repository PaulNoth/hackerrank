import java.util.*;

public class StrangeCounter {

    public static void main(String[] args) {
        Scanner stdin = new Scanner(System.in);
        long t = stdin.nextLong();
        long cycleEndTime = cycleEnd(t, 0, 3);
        long timeDiff = cycleEndTime - t;
        long finalValue = timeDiff + 1;

        System.out.println(finalValue);
        stdin.close();
    }

    private static long cycleEnd(long time, long start, long step) {
        if(start > time) {
            return start;
        }
        return cycleEnd(time, start + step, step * 2);
    }
}