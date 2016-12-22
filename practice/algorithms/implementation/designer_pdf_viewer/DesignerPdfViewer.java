import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner stdin = new Scanner(System.in);
        Object[] heights = Arrays.stream(stdin.nextLine().split(" "))
                .map(Integer::parseInt).toArray();
        String word = stdin.nextLine();
        int maxHeight = 0;
        for(int i = 0; i < word.length(); i++) {
            int charIndex = word.charAt(i) - 'a';
            int height = (int) heights[charIndex];
            if(height > maxHeight) {
                maxHeight = height;
            }
        }

        long square = word.length() * maxHeight;
        System.out.println(square);
        stdin.close();
    }
}