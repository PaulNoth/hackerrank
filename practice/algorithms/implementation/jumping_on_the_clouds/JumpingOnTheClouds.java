import java.util.*;

public class JumpingOnTheClouds {

    public static void main(String[] args) {
        Scanner stdin = new Scanner(System.in);
        int n = Integer.parseInt(stdin.nextLine());
        String[] numbers = stdin.nextLine().split(" ");
        int[] clouds = new int[n];
        for(int i = 0; i < n; i++) {
            clouds[i] = Integer.parseInt(numbers[i]);
        }

        int steps = 0;
        int index = 0;
        while (index < clouds.length - 1) {
            if((index + 2 < clouds.length) && clouds[index + 2] != 1) {
                index = index + 2;
            } else {
                index = index + 1;
            }
            steps += 1;
        }
        System.out.println(steps);
        stdin.close();
    }
}