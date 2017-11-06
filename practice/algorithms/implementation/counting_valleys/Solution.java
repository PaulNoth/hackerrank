import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner stdin = new Scanner(System.in);
        int tests = Integer.parseInt(stdin.nextLine());
        String steps = stdin.nextLine();
        int valleys = 0;
        int seaLevel = 0;

        for(int i = 0; i < tests; i++) {
            char c = steps.charAt(i);
            if(c == 'D') {
                seaLevel -= 1;
            } else {
                seaLevel += 1;
            }
            if(seaLevel == 0 && c == 'U') {
                valleys += 1;
            }
        }
        System.out.println(valleys);
        stdin.close();
    }
}