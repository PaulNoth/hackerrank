import java.util.*;

public class JavaStringsIntroduction {

    public static void main(String[] args) {

        Scanner stdin = new Scanner(System.in);
        String a = stdin.next();
        String b = stdin.next();
        int length = a.length() + b.length();
        String lexLager = a.compareToIgnoreCase(b) > 0 ? "Yes" : "No";
        String capitalizedA = a.substring(0, 1).toUpperCase() + a.substring(1);
        String capitalizedB = b.substring(0, 1).toUpperCase() + b.substring(1);
        System.out.println(length);
        System.out.println(lexLager);
        System.out.println(capitalizedA + " " + capitalizedB);
    }
}
