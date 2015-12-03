import java.util.Scanner;

public class Anagram {
    public static void main(String[] args) {
        Scanner stdin = new Scanner(System.in);
        int tests = stdin.nextInt();
        for(int i = 0; i < tests; i++) {
            String s = stdin.next();
            System.out.println(deletions(s));
        }
        stdin.close();
    }

    private static int deletions(String s) {
        if(s.length() % 2 != 0) {
            return -1;
        }
        String half1 = s.substring(0, s.length() / 2);
        String half2 = s.substring(s.length() / 2);
        for(int i = 0; i < half1.length(); i++) {
            if(half2.contains(half1.substring(i, i + 1))) {
                half2 = half2.replaceFirst(half1.substring(i, i + 1), "");
            }
        }
        return half2.length();
    }
}
