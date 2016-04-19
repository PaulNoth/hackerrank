import java.util.*;

public class SherlockAndSquares {

    public static void main(String[] args) {
        Scanner stdin = new Scanner(System.in);
        int tests = Integer.parseInt(stdin.nextLine());
        for(int i = 0; i < tests; i++) {
            String[] parts = stdin.nextLine().split(" ");
            int lower = Integer.parseInt(parts[0]);
            int upper = Integer.parseInt(parts[1]);
            int squareNumbers;
            if(lower == upper) {
                if (Math.sqrt(lower) == Math.ceil(Math.sqrt(lower))) {
                    squareNumbers = 1;
                }
                else {
                    squareNumbers = 0;
                }
            }
            else {
                squareNumbers = (int)(Math.floor(Math.sqrt(upper)) - (Math.ceil(Math.sqrt(lower))) + 1);
            }
            System.out.println(squareNumbers);
        }
        stdin.close();
    }
}