import java.util.Arrays;
import java.util.Scanner;

public class SherlockBeast {
    public static void main(String[] args) {
        Scanner stdin = new Scanner(System.in);
        int tests = stdin.nextInt();
        for(int i = 0; i < tests; i++) {
            int num = stdin.nextInt();
            int fives = fiveCount(num);
            System.out.println(createOutput(num, fives));
        }
        stdin.close();
    }

    private static int fiveCount(int num) {
        int fives = num;
        while (fives >= 0 && (num - fives) <= num) {
            if(fives % 3 == 0 && (num - fives) % 5 == 0) {
                return fives;
            }
            fives -= 5;
        }
        return -1;
    }

    private static String createOutput(int num, int fives) {
        if(fives == -1) {
            return "-1";
        }
        else {
            char[] fivess = new char[fives];
            char[] threes = new char[num - fives];
            Arrays.fill(fivess, '5');
            Arrays.fill(threes, '3');
            return new StringBuilder().append(fivess).append(threes).toString();
        }
    }
}
