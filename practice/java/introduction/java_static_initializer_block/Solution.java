import java.util.*;

class Solution {
    private static int B;
    private static int H;
    private static boolean flag = false;
    static {
        Scanner stdin = new Scanner(System.in);
        B = stdin.nextInt();
        H = stdin.nextInt();
        flag = B > 0 && H > 0;
        if(!flag) {
            System.out.println("java.lang.Exception: Breadth and height must be positive");
        }
        stdin.close();
    }

    public static void main(String [] args) {
        if(flag){
            int area = B * H;
            System.out.print(area);
        }
    }
}
