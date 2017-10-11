import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class SequenceEquation {
    public static void main(String[] args) {
        Scanner stdin = new Scanner(System.in);
        int tests = Integer.parseInt(stdin.nextLine());
        List<Integer> elements = Arrays.stream(stdin.nextLine().split(" ")).map(Integer::parseInt).collect(Collectors.toList());
        List<Integer> result = new ArrayList<>();
        for(int i = 1; i <= tests; i++) {
            int index = elements.indexOf(i);
            int value1 = index + 1;
            int index2 = elements.indexOf(value1);
            result.add(index2 + 1);
        }
        for (int elem : result) {
            System.out.println(elem);
        }
        stdin.close();
    }
}
