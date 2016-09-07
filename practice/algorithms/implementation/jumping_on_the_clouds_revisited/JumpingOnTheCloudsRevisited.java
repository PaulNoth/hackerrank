import java.util.*;

public class JumpingOnTheCloudsRevisited {

    public static void main(String[] args) {
        Scanner stdin = new Scanner(System.in);
        int n = stdin.nextInt();
        int k = stdin.nextInt();
        int[] clouds = new int[n];
        for(int i = 0; i < n; i++) {
            clouds[i] = stdin.nextInt();
        }
        int energy = 100;
        int pos = k % n;
        energy -= ((clouds[pos] == 1) ? 3 : 1);
        while(pos != 0) {
            pos = (pos + k) % n;
            energy -= ((clouds[pos] == 1) ? 3 : 1);
        }
        System.out.println(energy);
        stdin.close();
    }
}