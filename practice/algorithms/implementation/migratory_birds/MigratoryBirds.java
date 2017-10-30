import java.util.*;

public class MigratoryBirds {

    public static void main(String[] args) {
        Scanner stdin = new Scanner(System.in);
        int tests = stdin.nextInt();
        int[] birdTypes = new int[tests];
        for(int i = 0; i < tests; i++) {
            birdTypes[i] = stdin.nextInt();
        }

        Map<Integer, Integer> birdTypeCount = new HashMap<>();
        for(int i = 0; i < tests; i++) {
            int birdType = birdTypes[i];
            birdTypeCount.put(birdType, birdTypeCount.getOrDefault(birdType, 0) + 1);
        }

        Map.Entry<Integer, Integer> max = null;
        for(Map.Entry<Integer, Integer> birdCount : birdTypeCount.entrySet()) {
            int actualMax;
            if(max == null) {
                actualMax = 0;
            } else {
                actualMax = max.getValue();
            }
            if(birdCount.getValue() > actualMax) {
                max = birdCount;
            }
        }
        System.out.println(max.getKey());
        stdin.close();
    }
}