import java.util.*;

public class StringConstruction {

    public static void main(String[] args) {
        Scanner stdin = new Scanner(System.in);
        int tests = Integer.parseInt(stdin.nextLine());
        for(int i = 0; i < tests; i++) {
            String s = stdin.nextLine();
            System.out.println(cost(s));
        }
        stdin.close();
    }

    private static int cost(String s) {
        char[] chars = s.toCharArray();
        Map<Character, Boolean> charMap = new HashMap<>();
        for(int i = 0; i < chars.length; i++) {
            charMap.put(chars[i], true);
        }
        return charMap.size();
    }
}