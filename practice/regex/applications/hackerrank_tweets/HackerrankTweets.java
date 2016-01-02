import java.util.*;

public class HackerrankTweets {

    public static void main(String[] args) {
        Scanner stdin = new Scanner(System.in);
        int tests = Integer.parseInt(stdin.nextLine());
        int count = 0;
        for(int i = 0; i < tests; i++) {
            if(stdin.nextLine().toLowerCase().matches(".*hackerrank.*")) {
                count++;
            }
        }
        System.out.println(count);
        stdin.close();
    }
}