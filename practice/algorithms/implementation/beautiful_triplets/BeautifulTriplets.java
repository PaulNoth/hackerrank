import java.util.*;

public class BeautifulTriplets {

    public static void main(String[] args) {
        Scanner stdin = new Scanner(System.in);
        int n = stdin.nextInt();
        int d = stdin.nextInt();
        int[] array = new int[n];
        for(int i = 0; i < n; i++) {
            array[i] = stdin.nextInt();
        }

        int triplets = 0;
        for(int i = 0; i < n - 2; i++) {
            for(int j = i + 1; j < n - 1; j++) {
                if(array[j] - array[i] > d) break;
                for(int k = j + 1; k < n; k++) {
                    if(array[k] - array[j] > d) break;
                    if((array[k] - array[j] == d) && (array[j] - array[i] == d)) {
                        triplets++;
                    }
                }
            }
        }
        System.out.println(triplets);
        stdin.close();
    }
}