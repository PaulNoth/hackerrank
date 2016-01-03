import java.util.*;

public class ValidPanFormat {

    private static final String PAN = "[A-Z]{5}\\d{4}[A-Z]";

    public static void main(String[] args) {
        Scanner stdin = new Scanner(System.in);
        int tests = Integer.parseInt(stdin.nextLine());
        for(int i = 0; i < tests; i++) {
            System.out.println(isPan(stdin.nextLine()));
        }
        stdin.close();
    }

    private static String isPan(String s) {
        if(s.matches(PAN)) {
            return "YES";
        } else {
            return "NO";
        }
    }
}