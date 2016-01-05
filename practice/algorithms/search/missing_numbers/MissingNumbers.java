import java.util.*;
import java.util.stream.Collectors;

public class MissingNumbers {

    public static void main(String[] args) {
        Scanner stdin = new Scanner(System.in);
        int length1 = stdin.nextInt();
        Map<Integer, Integer> numHash1 = new HashMap<>();
        for(int i = 0; i < length1; i++) {
            int value = stdin.nextInt();
            int count = numHash1.getOrDefault(value, 0);
            numHash1.put(value, count + 1);
        }
        int length2 = stdin.nextInt();
        Map<Integer, Integer> numHash2 = new HashMap<>();
        for(int i = 0; i < length2; i++) {
            int value = stdin.nextInt();
            int count = numHash2.getOrDefault(value, 0);
            numHash2.put(value, count + 1);
        }

        List<Integer> missingNumbers = new LinkedList<>();
        for(int numKey : numHash2.keySet()) {
            if(numHash1.get(numKey) == null || numHash2.get(numKey) > numHash1.get(numKey)) {
                missingNumbers.add(numKey);
            }
        }
        Collections.sort(missingNumbers);
        System.out.println(missingNumbers.stream().map(i -> i.toString()).collect(Collectors.joining(" ")));
        stdin.close();
    }
}