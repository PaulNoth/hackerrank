import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;
import java.util.stream.Collectors;

public class ManasaAndStones {
    public static void main(String[] args) {
        Scanner stdin = new Scanner(System.in);
        int tests = stdin.nextInt();
        for(int i = 0; i < tests; i++) {
            int n = stdin.nextInt();
            int a = stdin.nextInt();
            int b = stdin.nextInt();
            Set<Integer> set = new TreeSet<Integer>();
            set.add(0);
            for(int j = 1; j < n; j++) {
                Set<Integer> newSet = new TreeSet<Integer>();
                for(int el : set) {
                    newSet.add(el + a);
                    newSet.add(el + b);
                }
                set = newSet;
            }
            System.out.println(set.stream()
                    .map(item -> item.toString()).collect(Collectors.joining(" ")));
        }
    }
}
