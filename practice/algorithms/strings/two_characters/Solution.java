import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int len = in.nextInt();
        String s = in.next();

        Set<Character> distinct = new HashSet<>();
        for (int i = 0; i < len; i++) {
            distinct.add(s.charAt(i));
        }

        List<Character> distinctList = new ArrayList<>(distinct);

        int max = 0;
        for(int i = 0; i < distinct.size() - 1; i++) {
            for(int j = i + 1; j < distinct.size() ; j++) {
                char c1 = distinctList.get(i);
                char c2 = distinctList.get(j);
                String subset = s.replaceAll("[^" + c1 + "" + c2 + "]", "");
                if(isAlternating(subset)) {
                    int l = subset.length();
                    max = l > max ? l : max;
                }
            }
        }

        System.out.println(max);
    }

    private static boolean isAlternating(String s) {
        for(int i = 0; i < s.length() - 1; i++) {
            if(s.charAt(i) == s.charAt(i + 1)) {
                return false;
            }
        }
        return true;
    }

}
