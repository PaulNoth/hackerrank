import java.util.*;

public class ArraysDS {

    public static void main(String[] args) {
        Scanner stdin = new Scanner(System.in);
        int length = stdin.nextInt();
        int[] array = new int[length];
        for(int i = 0; i < length; i++) {
            array[i] = stdin.nextInt();
        }
        for(int i = length - 1; i >= 0; i--) {
            System.out.print(array[i] + " ");
        }
        stdin.close();
    }
}
