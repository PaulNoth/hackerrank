import java.util.*;

public class SuperReducedString {

    public static void main(String[] args) {
        Scanner stdin = new Scanner(System.in);
        String s = stdin.nextLine();
        String acc = "";
        for(int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if(acc.length() > 0 && acc.charAt(acc.length() - 1) == c) {
                acc = acc.substring(0, acc.length() - 1);
            } else {
                acc += c;
            }
        }
        System.out.println(acc.isEmpty() ? "Empty String" : acc);
        stdin.close();
    }
}