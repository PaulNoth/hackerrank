import java.util.*;

public class SplitPhoneNumbers {

    public static void main(String[] args) {
        Scanner stdin = new Scanner(System.in);
        int tests = Integer.parseInt(stdin.nextLine());
        for(int i = 0; i < tests; i++) {
            String[] splits = stdin.nextLine().split(" |\\-");
            System.out.println("CountryCode=" + splits[0]
                    + ",LocalAreaCode=" + splits[1] + ",Number=" + splits[2]);
        }
        stdin.close();
    }
}