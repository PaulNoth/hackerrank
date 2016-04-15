import java.util.*;

public class ModifiedKaprekarNumbers {

    public static void main(String[] args) {
        Scanner stdin = new Scanner(System.in);
        int lower = stdin.nextInt();
        int upper = stdin.nextInt();
        List<Integer> kaprekars = new ArrayList<>();
        for(int i = lower; i <= upper; i++) {
            if(isKaprekar(i)) {
                kaprekars.add(i);
            }
        }
        if(kaprekars.isEmpty()) {
            System.out.println("INVALID RANGE");
        } else {
            for(int k : kaprekars) {
                System.out.print(k + " ");
            }
        }
        stdin.close();
    }

    private static boolean isKaprekar(int num) {
        String square = Long.valueOf((long) Math.pow(num, 2)).toString();
        if(square.length() > 1) {
            long l = Long.parseLong(square.substring(0, square.length() / 2));
            long r = Long.parseLong(square.substring(square.length() / 2));
            return (l + r) == num;
        } else {
            return Long.parseLong(square) == num;
        }
    }
}