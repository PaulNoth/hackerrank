import java.util.*;

public class FindHackerrank {

    public static void main(String[] args) {
        Scanner stdin = new Scanner(System.in);
        int tests = Integer.parseInt(stdin.nextLine());
        for(int i = 0; i < tests; i++) {
            String input = stdin.nextLine();
            System.out.println(findHackerrank(input));
        }
        stdin.close();
    }

    private static int findHackerrank(String line) {
        if(line.matches("^hackerrank$") || line.matches("^hackerrank.*hackerrank$"))
            return 0;
        else if(line.matches("^hackerrank.*"))
            return 1;
        else if(line.matches(".*hackerrank$"))
            return 2;
        else
            return -1;
    }
}
