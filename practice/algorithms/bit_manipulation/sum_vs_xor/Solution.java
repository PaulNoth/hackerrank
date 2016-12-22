import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner stdin = new Scanner(System.in);
        long n = stdin.nextLong();
        String binary = Long.toBinaryString(n);
        long zeroes = 0L;
        for(int i = 0; i < binary.length(); i++) {
            if(binary.charAt(i) == '0') {
                zeroes++;
            }
        }
        if(n == 0L) {
            zeroes = 0;
        }
        long result = (long) Math.pow(2, zeroes);
        System.out.println(result);
        stdin.close();
    }
}