import java.util.*;

public class CutTheSticks {

    public static void main(String[] args) {
        Scanner stdin = new Scanner(System.in);
        int tests = stdin.nextInt();
        List<Integer> sticks = new LinkedList<>();
        for(int i = 0; i < tests; i++) {
            sticks.add(stdin.nextInt());
        }

        while(!sticks.isEmpty()) {
            System.out.println(sticks.size());
            Collections.sort(sticks);
            int min = sticks.get(0);
            List<Integer> filtered = new LinkedList<>();
            for(int j = 0; j < sticks.size(); j++) {
                if(sticks.get(j) > min) {
                    filtered.add(sticks.get(j));
                }
            }
            sticks = filtered;
        }
        stdin.close();
    }
}