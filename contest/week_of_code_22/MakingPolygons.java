import java.util.*;

public class MakingPolygons {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int a[] = new int[n];
        for(int a_i=0; a_i < n; a_i++){
            a[a_i] = in.nextInt();
        }

        boolean res = allSticks(a);
        System.out.println("" + (res ? "0" : 1 + (n < 3 ? 3 - n : 0)));
    }

    private static boolean isPolygon(int[] array, int index) {
        int sum = 0;
        for(int i = 0; i < array.length; i++) {
            //if(i != index) {
            sum += array[i];
            //}
        }
        return array[index] < sum / 2.0;
    }

    private static boolean allSticks(int[] array) {
        for (int i = 0; i < array.length; i++) {
            if(!isPolygon(array, i)) {
                return false;
            }
        }
        return true;
    }
}