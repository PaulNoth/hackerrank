import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class BetweenTwoSets {

    public static void main(String[] args) {
        Scanner stdin = new Scanner(System.in);
        String firstLine = stdin.nextLine();
        List<Integer> a = Arrays.stream(stdin.nextLine().split(" ")).map(Integer::parseInt).collect(Collectors.toList());
        List<Integer> b = Arrays.stream(stdin.nextLine().split(" ")).map(Integer::parseInt).collect(Collectors.toList());
        int aMax = a.stream().max((Integer o1, Integer o2) -> o1 - o2).get();
        int bMin = b.stream().min((Integer o1, Integer o2) -> o1 - o2).get();
        List<Integer> result = IntStream.range(aMax, bMin + 1).filter(num -> a.stream().allMatch(i -> num % i == 0) && b.stream().allMatch(j -> j % num == 0))
                .mapToObj(i -> i).collect(Collectors.toList());
        System.out.println(result.size());
        stdin.close();
    }
}