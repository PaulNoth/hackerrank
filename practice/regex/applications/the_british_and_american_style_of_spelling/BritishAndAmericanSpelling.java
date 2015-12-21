import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class BritishAndAmericanSpelling {
    public static void main(String[] args) {
        Scanner stdin = new Scanner(System.in);
        int n = Integer.parseInt(stdin.nextLine());
        List<String> words = new ArrayList<>();
        for(int i = 0; i < n; i++) {
            String[] s = stdin.nextLine().split(" ");
            words.addAll(Arrays.asList(s));
        }
        int tests = Integer.parseInt(stdin.nextLine());
        for(int i = 0; i < tests; i++) {
            int count = 0;
            String american = stdin.nextLine();
            String british = american.replaceAll("ze", "se");
            for(int j = 0; j < words.size(); j++) {
                if(words.get(j).matches(american) || words.get(j).matches(british)) {
                    count++;
                }
            }
            System.out.println(count);
        }

        stdin.close();
    }
}
