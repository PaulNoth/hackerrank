import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner stdin = new Scanner(System.in);
        int amount = stdin.nextInt();
        int keyboardCount = stdin.nextInt();
        int usbCount = stdin.nextInt();
        int[] keyboards = new int[keyboardCount];
        int[] usbs = new int[usbCount];
        for(int i = 0; i < keyboardCount; i++) {
            keyboards[i] = stdin.nextInt();
        }
        for(int i = 0; i < usbCount; i++) {
            usbs[i] = stdin.nextInt();
        }

        int spentAmount = -1;
        for(int i = 0; i < keyboardCount; i++) {
            for(int j = 0; j < usbCount; j++) {
                int sum = keyboards[i] + usbs[j];
                if(sum <= amount && sum > spentAmount) {
                    spentAmount = sum;
                }
            }
        }
        System.out.println(spentAmount);
        stdin.close();
    }
}