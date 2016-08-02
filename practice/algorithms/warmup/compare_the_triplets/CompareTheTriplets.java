import java.util.*;

public class CompareTheTriplets {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a0 = in.nextInt();
        int a1 = in.nextInt();
        int a2 = in.nextInt();
        int b0 = in.nextInt();
        int b1 = in.nextInt();
        int b2 = in.nextInt();

        int aliceScore = 0;
        int bobScore = 0;

        if(a0 > b0) {
            aliceScore++;
        }
        if(a1 > b1) {
            aliceScore++;
        }
        if(a2 > b2) {
            aliceScore++;
        }

        if(a0 < b0) {
            bobScore++;
        }
        if(a1 < b1) {
            bobScore++;
        }
        if(a2 < b2) {
            bobScore++;
        }

        System.out.println(aliceScore + " " + bobScore);

        in.close();
    }
}