import java.util.*;

public class CircularArrayRotation {

    public static void main(String[] args) {
        Scanner stdin = new Scanner(System.in);
        int n = stdin.nextInt();
        int k = stdin.nextInt();
        int q = stdin.nextInt();
        List<Integer> numbers = new ArrayList<>(n);
        for(int i = 0; i < n; i++) {
            numbers.add(stdin.nextInt());
        }
        int[] queries = new int[q];
        for(int i = 0; i < q; i++) {
            queries[i] = stdin.nextInt();
        }
        int rotationPos = k % n;
        List<Integer> part1 = numbers.subList(0, numbers.size() - rotationPos);
        List<Integer> part2 = numbers.subList(numbers.size() - rotationPos, numbers.size());
        List<Integer> finalList = new ArrayList<>(part2);
        finalList.addAll(part1);

        for(int i = 0; i < q; i++) {
            System.out.println(finalList.get(queries[i]));
        }
        stdin.close();
    }
}