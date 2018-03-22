import java.io.*;
import java.util.*;

public class Solution {

    public static void insertionSort(int[] ar){
        for(int i = 1; i < ar.length; i++) {
            int num = ar[i];
            int swapPos = i - 1;
            int l = i - 1;
            boolean isSwap = false;
            while(l >= 0) {
                if(num < ar[l]) {
                    isSwap = true;
                    swapPos = l;
                    l--;
                } else {
                    break;
                }
            }
            if(isSwap) {
                for(int j = i - 1; j >= swapPos ; j--) {
                    ar[j + 1] = ar[j];
                }
                ar[swapPos] = num;
            }
        }
        printArray(ar);
    }


    static void printArray(int[] ar) {
        for(int n: ar){
            System.out.print(n+" ");
        }
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] ar = new int[n];
        for(int i=0;i<n;i++){
            ar[i]=in.nextInt();
        }
        insertionSort(ar);
    }
}
