import java.util.*;

public class LonelyInteger {

    public static void main(String[] args) {
        Scanner stdin = new Scanner(System.in);
        int n = stdin.nextInt();
        Map<Integer, Integer> array = new HashMap<>();
        for(int i = 0; i < n; i++) {
            int num = stdin.nextInt();
            Integer count = array.get(num);
            if(count == null) {
                array.put(num, 1);
            } else {
                array.put(num, count + 1);
            }
        }
        for(Integer key : array.keySet()) {
            if(array.get(key) == 1) {
                System.out.println(key);
                break;
            }
        }

        stdin.close();
    }
}
