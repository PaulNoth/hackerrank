import java.util.*;

public class MarsExploration {

    public static void main(String[] args) {
        Scanner stdin = new Scanner(System.in);
        String msg = stdin.nextLine();
        int result = 0;
        for(int i = 0; i < msg.length(); i += 3) {
            if(msg.charAt(i) != 'S') {
                result++;
            }
            if(msg.charAt(i + 1) != 'O') {
                result++;
            }
            if(msg.charAt(i + 2) != 'S') {
                result++;
            }
        }
        System.out.println(result);
        stdin.close();
    }
}