import java.util.Scanner;

public class ConnectingTowns {
    public static void main(String[] args) {
        Scanner stdin = new Scanner(System.in);
        int cases = stdin.nextInt();
        for(int i = 0; i < cases; i++) {
            int l = stdin.nextInt();
            int routes = 1;
            for(int j = 0; j < l - 1; j++) {
                routes *= stdin.nextInt();
                routes %= 1234567;
            }
            System.out.println(routes);
        }
        stdin.close();
    }
}
