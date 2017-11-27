import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner stdin = new Scanner(System.in);
        int tests = stdin.nextInt();
        int[] elements = new int[tests];
        for(int i = 0; i < tests; i++) {
            elements[i] = stdin.nextInt();
        }

        Arrays.sort(elements);
        int maxDiffCount = 0;
        for(int i = 0; i < elements.length - 1; i++) {
            for (int j = i + 1; j < elements.length; j++) {
                int diff = Math.abs(elements[i] - elements[j]);
                if (diff > 1) {
                    break;
                }
                int diffCount = j - i;
                if(diffCount > maxDiffCount) {
                    maxDiffCount = diffCount;
                }
            }
        }

        System.out.println(maxDiffCount + 1);
        stdin.close();
    }
}