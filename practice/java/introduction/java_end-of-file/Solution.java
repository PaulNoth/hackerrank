import java.util.*;

class Solution {
    public static void main(String [] args) {
        Scanner sc = new Scanner(System.in);
        int line = 1;
        while (sc.hasNextLine()) {
            System.out.println(line ++ + " " + sc.nextLine());
        }
        sc.close();
    }
}
