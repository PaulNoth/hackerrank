import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner stdin = new Scanner(System.in);
        int cities = stdin.nextInt();
        int stationCount = stdin.nextInt();
        int[] stations = new int[stationCount];
        for(int i = 0; i < stationCount; i++) {
            stations[i] = stdin.nextInt();
        }
        Arrays.sort(stations);
        int max = 0;
        for(int i = 0; i < stations.length - 1; i++) {
            int citiesInside = stations[i + 1] - stations[i] - 1;
            int d = (int) Math.ceil(citiesInside / 2.0);
            if(d > max) {
                max = d;
            }
        }
        if(stations[0] - 0 > max) {
            max = stations[0] - 0;
        }
        if(cities - 1 - stations[stationCount - 1] > max) {
            max = cities - 1 - stations[stationCount - 1];
        }
        System.out.println(max);
        stdin.close();
    }
}