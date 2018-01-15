import java.util.*;

public class Solution {

    static void countingSort(int[] arr) {
        int[] counts = new int[100];
        for(int i = 0; i < arr.length; i++) {
            counts[arr[i]]++;
        }

        for (int i = 0; i < counts.length; i++) {
            for(int j = 0; j < counts[i]; j++) {
                System.out.print(j + " ");
            }
        }
        System.out.println("");
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] arr = new int[n];
        for(int arr_i = 0; arr_i < n; arr_i++){
            arr[arr_i] = in.nextInt();
        }
        countingSort(arr);

        in.close();
    }
}
