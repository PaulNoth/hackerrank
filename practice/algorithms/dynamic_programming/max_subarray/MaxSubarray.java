import java.util.*;

public class MaxSubarray {

    public static void main(String[] args) {
        Scanner stdin = new Scanner(System.in);
        int tests = stdin.nextInt();
        for(int i = 0; i < tests; i++) {
            int elementCount = stdin.nextInt();
            int[] arr = new int[elementCount];
            for(int j = 0; j < elementCount; j++) {
                arr[j] = stdin.nextInt();
            }
            int contiguousSum = kadane(arr);
            int nonContiguousSum;
            if(hasPositiveElement(arr)) {
                nonContiguousSum = sumPositiveElement(arr);
            } else {
                nonContiguousSum = max(arr);
            }
            System.out.println(contiguousSum + " " + nonContiguousSum);
        }
        stdin.close();
    }

    private static int kadane(int[] arr) {
        int maxSoFar = arr[0];
        int maxEndings = arr[0];
        for(int j = 1; j < arr.length; j++) {
            int el = arr[j];
            maxEndings = Math.max(el, maxEndings + el);
            maxSoFar = Math.max(maxSoFar, maxEndings);
        }
        return maxSoFar;
    }

    private static boolean hasPositiveElement(int[] arr) {
        for(int j = 0; j < arr.length; j++) {
            if(arr[j] > 0) {
                return true;
            }
        }
        return false;
    }

    private static int sumPositiveElement(int[] arr) {
        int sum = 0;
        for(int j = 0; j < arr.length; j++) {
            if(arr[j] > 0) {
                sum += arr[j];
            }
        }
        return sum;
    }
    private static int max(int[] arr) {
        int max = Integer.MIN_VALUE;
        for(int j = 0; j < arr.length; j++) {
            if(arr[j] > max) {
                max = arr[j];
            }
        }
        return max;
    }
}