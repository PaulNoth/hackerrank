import java.util.Scanner;

public class LoveLetterMystery {
    public static void main(String[] args) {
        Scanner stdin = new Scanner(System.in);
        int tests = stdin.nextInt();
        for(int i = 0; i < tests; i++) {
            String s = stdin.next();
            int diff = 0;
            for(int j = 0; j < s.length() / 2; j++) {
                diff += Math.abs(Character.codePointAt(s, j) - Character.codePointAt(s, s.length() - j - 1));
            }
            System.out.println(diff);
        }
        stdin.close();
    }
}
