import java.util.*;

public class LatitudeLongitudePairs {

    private static final String LATITUDE_LONGITUDE_PATTERN =
            "^\\([+-]?((90(\\.0+)?)|([1-8][0-9](\\.[0-9]+)?)|([0-9](\\.[0-9]+)?)),\\s*[+-]?(((([1-9][0-9])|([0-9]))(\\.[0-9]+)?)|(1((80(\\.0+)?)|([0-7][0-9](\\.[0-9]+)?))))\\)$";

    public static void main(String[] args) {
        Scanner stdin = new Scanner(System.in);
        int tests = Integer.parseInt(stdin.nextLine());
        for(int i = 0; i < tests; i++) {
            System.out.println(validatePair(stdin.nextLine()));
        }
        stdin.close();
    }

    private static final String validatePair(String s) {
        if(s.matches(LATITUDE_LONGITUDE_PATTERN)) {
            return "Valid";
        } else {
            return "Invalid";
        }
    }
}