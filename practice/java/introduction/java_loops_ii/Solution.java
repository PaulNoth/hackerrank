import java.util.*;

class Solution{
    public static void main(String []argh){
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        for(int i = 0; i < t; i ++){
            int a = in.nextInt();
            int b = in.nextInt();
            int n = in.nextInt();
            long prev = 0;
            for(int j = 0; j < n; j++) {
                long val = prev + ((long)Math.pow(2, j) * b);
                System.out.print((val + a) + " ");
                prev = val;
            }
            System.out.println();
        }
        in.close();
    }
}
