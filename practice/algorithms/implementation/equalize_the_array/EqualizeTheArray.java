import java.util.*;

public class EqualizeTheArray {

    public static void main(String[] args) {
        Scanner stdin = new Scanner(System.in);
        int n = stdin.nextInt();
        int[] array = new int[n];
        for(int i = 0; i < n; i++) {
            array[i] = stdin.nextInt();
        }
        Map<Integer, Integer> numCount = new HashMap<>();
        for(int i = 0; i < n; i++) {
            int count = numCount.getOrDefault(array[i], 0);
            numCount.put(array[i], count + 1);
        }
        int maxCount = numCount.values().stream().max(
                (Integer o1, Integer o2) -> o1 - o2
        ).orElse(0);

        System.out.println(n - maxCount);
        stdin.close();
    }
}