import java.util.*;

public class GameOfThrones1 {

    public static void main(String[] args) {
        Scanner stdin = new Scanner(System.in);
        String line = stdin.nextLine();
        Map<Character, Integer> charMap = new HashMap<>();
        for(int i = 0; i < line.length(); i++) {
            char c = line.charAt(i);
            int count = charMap.getOrDefault(c, 0);
            charMap.put(c, count + 1);
        }
        System.out.println(isPalindrome(line.length(), charMap));
        stdin.close();
    }

    private static String isPalindrome(int length, Map<Character, Integer> charMap) {
        boolean isPalindrome = true;
        if(length % 2 == 0) {
            for(char key : charMap.keySet()) {
                if(charMap.get(key) % 2 != 0) {
                    isPalindrome = false;
                    break;
                }
            }
        }
        if(length % 2 != 0) {
            int oddCount = 0;
            for(char key : charMap.keySet()) {
                if(charMap.get(key) % 2 != 0) {
                    oddCount++;
                }
            }
            isPalindrome = oddCount == 1;
        }
        if(isPalindrome) {
            return "YES";
        } else {
            return "NO";
        }
    }
}