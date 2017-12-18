import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner stdin = new Scanner(System.in);
        int tests = Integer.parseInt(stdin.nextLine());
        t: for(int i = 0; i < tests; i++) {
            String s = stdin.nextLine();
            for(int j = 1; j <= s.length() / 2; j++) {
                String head = s.substring(0, j);
                long headVal = Long.parseLong(head);
                long next = headVal + 1;
                String rest = s.substring(j);
                if(isContinous(rest, next)) {
                    System.out.println("YES " + head);
                    continue t;
                }
            }
            System.out.println("NO");
        }
        stdin.close();
    }

    private static boolean isContinous(String rest, long next) {
        String nextS = String.valueOf(next);
        int i = nextS.length();
        while(i <= rest.length()) {
            if(!rest.startsWith(nextS)) {
                return false;
            } else {
                next = next + 1;
                rest = rest.substring(i);
                nextS = String.valueOf(next);
                i = nextS.length();
            }
        }
        if(!rest.isEmpty()) {
            return false;
        }
        return true;
    }
}