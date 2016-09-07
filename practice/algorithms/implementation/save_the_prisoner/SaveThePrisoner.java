import java.util.*;

public class SaveThePrisoner {

    public static void main(String[] args) {
        Scanner stdin = new Scanner(System.in);
        int tests = Integer.parseInt(stdin.nextLine());
        for(int i = 0; i < tests; i++) {
            System.out.println(savedPrisoner(stdin.nextLine()));
        }
        stdin.close();
    }

    private static long savedPrisoner(String line) {
        String[] numbers = line.split(" ");
        long prisoners = Long.valueOf(numbers[0]);
        long sweets = Long.valueOf(numbers[1]);
        long startId = Long.valueOf(numbers[2]);

        long saved = (((sweets % prisoners) + startId) % prisoners) - 1;
        if (saved == 0) {
            return prisoners;
        } else {
            return saved;
        }
    }
}