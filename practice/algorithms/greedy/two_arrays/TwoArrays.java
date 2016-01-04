import java.util.*;

public class TwoArrays {

    private static class Descending implements Comparator<Integer> {
        @Override
        public int compare(Integer i, Integer j) {
            return j - i;
        }
    }

    public static void main(String[] args) {
        Scanner stdin = new Scanner(System.in);
        int tests = stdin.nextInt();
        for(int i = 0; i < tests; i++) {
            int n = stdin.nextInt();
            int sum = stdin.nextInt();
            Integer[] array1 = new Integer[n];
            Integer[] array2 = new Integer[n];
            for(int j = 0; j < n; j++){
                array1[j] = stdin.nextInt();
            }
            for(int j = 0; j < n; j++){
                array2[j] = stdin.nextInt();
            }
            Arrays.sort(array1);
            Arrays.sort(array2, new Descending());
            System.out.println(isCorrect(array1, array2, sum));
        }
        stdin.close();
    }

    private static String isCorrect(Integer[] array1, Integer[] array2, int sum) {
        for(int i = 0; i < array1.length; i++) {
            if(array1[i] + array2[i] < sum) {
                return "NO";
            }
        }
        return "YES";
    }
}