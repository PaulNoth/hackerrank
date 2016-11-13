import java.util.*;

public class RepeatedString {

    public static void main(String[] args) {
        Scanner stdin = new Scanner(System.in);
        String s = stdin.nextLine();
        long n = Long.parseLong(stdin.nextLine());
        long as = s.chars().filter(c -> c == 'a').count();
        long times = n / s.length();
        long rest = n % s.length();

        long totalAs = times * as
                + s.substring(0, (int) rest).chars().filter(c -> c == 'a').count();
        System.out.println(totalAs);
        stdin.close();
    }
}