import java.util.*;

public class BeautifulBinaryString {

    public static void main(String[] args) {
        Scanner stdin = new Scanner(System.in);
        int l = Integer.parseInt(stdin.nextLine());
        String s = stdin.nextLine();
        String beautiful = s.replaceAll("010", "b");
        int changes = beautiful.replaceAll("[01]", "").length();
        System.out.println(changes);
        stdin.close();
    }
}