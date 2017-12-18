import java.util.*;

public class Solution {

    public static void insertionSortPart2(int[] ar) {
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
            printArray(ar);
        }
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int s = in.nextInt();
        int[] ar = new int[s];
        for(int i=0;i<s;i++){
            ar[i]=in.nextInt();
        }
        insertionSortPart2(ar);

    }
    private static void printArray(int[] ar) {
        for(int n: ar){
            System.out.print(n+" ");
        }
        System.out.println("");
    }
}
