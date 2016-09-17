import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner stdin = new Scanner(System.in);
        int n = Integer.parseInt(stdin.nextLine());
        char[][] grid = new char[n][];
        for(int i = 0; i < n; i++) {
            String line = stdin.nextLine();
            grid[i] = line.toCharArray();
        }

        int max = 0;
        int r = 0;
        for(int i = 1; i < n - 1; i++) {
            for(int j = 1; j < n - 1; j++) {
                // System.out.println("(" + i + "," + j + ")");
                char center = grid[i][j];
                if(center == '.') {
                    for(int distance = 1; distance < n; distance++) {
                        //System.out.println("distance: " + distance);
                        // up
                        if(i - distance < 0 || grid[i - distance][j] == '*') {
                            break;
                        }
                        // down
                        if(i + distance >= n || grid[i + distance][j] == '*') {
                            break;
                        }
                        // left
                        if(j - distance < 0 || grid[i][j - distance] == '*') {
                            break;
                        }
                        // right
                        if(j + distance >= n || grid[i][j + distance] == '*') {
                            break;
                        }
                        r = distance;
                    }
                }
                max = Math.max(max, r);
            }
        }
        System.out.println(max);
        stdin.close();
    }
}