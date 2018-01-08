import java.util.*;

public class Solution {

    static int makingAnagrams(String str1, String str2) {
        int[] counts1 = new int[256];
        int[] counts2 = new int[256];
        for(int i=0; i<str1.length();i++)
        {
            int index = (int)(str1.charAt(i));
            counts1[index] += 1;
        }
        for(int i=0; i<str2.length();i++)
        {
            int index = (int)(str2.charAt(i));
            counts2[index] += 1;
        }
        int ans = 0;
        for(int i=0; i<256;i++)
        {
            ans += Math.abs(counts1[i] - counts2[i]);
        }
        return ans;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s1 = in.next();
        String s2 = in.next();
        int result = makingAnagrams(s1, s2);
        System.out.println(result);
    }
}
