import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class WeightedUniformStrings {
    public static void main(String[] args) {
        Scanner stdin = new Scanner(System.in);
        String line = stdin.nextLine();
        List<Integer> queries = new ArrayList<>();
        while (stdin.hasNext()) {
            int q = Integer.parseInt(stdin.nextLine());
            queries.add(q);
        }
        queries = queries.subList(1, queries.size());
        List<String> subs = uniformSubstrings(line, new ArrayList<>());
        Set<Integer> substringWeights = subs.stream().flatMap(s -> {
            int c = s.charAt(0) - 'a' + 1;
            List<Integer> lengts = new ArrayList<>();
            for(int i = 1; i <= s.length(); i++) {
                lengts.add(i * c);
            }
            return lengts.stream();
        }).collect(Collectors.toSet());

        for(int q : queries) {
            if(substringWeights.contains(q)) {
                System.out.println("Yes");
            } else {
                System.out.println("No");
            }
        }
    }

    private static List<String> uniformSubstrings(String s, List<String> strings) {
        if(s.length() > 0) {
            char c = s.charAt(0);
            int substringIndex = takeWhile(s, c);
            String substring = s.substring(0, substringIndex);
            strings.add(substring);
            return uniformSubstrings(s.substring(substringIndex), strings);
        }
        return strings;
    }

    private static int takeWhile(String s, char c) {
        for(int i = 0; i < s.length(); i++) {
            if(s.charAt(i) != c) {
                return i;
            }
        }
        return s.length();
    }
}
