import java.util.*;

public class CatsAndMouse {

    public static void main(String[] args) {
        Scanner stdin = new Scanner(System.in);
        int tests = Integer.parseInt(stdin.nextLine());
        for(int i = 0; i < tests; i++) {
            String line = stdin.nextLine();
            String[] abmString = line.split(" ");
            int[] abm = new int[3];
            for(int j = 0; j < 3; j++) {
                abm[j] = Integer.parseInt(abmString[j]);
            }
            int a = abm[0];
            int b = abm[1];
            int m = abm[2];
            int catACatchMouseSteps = Math.abs(a - m);
            int catBCatchMouseSteps = Math.abs(b - m);
            if(catACatchMouseSteps == catBCatchMouseSteps) {
                System.out.println("Mouse C");
            } else if(catACatchMouseSteps < catBCatchMouseSteps) {
                System.out.println("Cat A");
            } else {
                System.out.println("Cat B");
            }
        }
        stdin.close();
    }
}