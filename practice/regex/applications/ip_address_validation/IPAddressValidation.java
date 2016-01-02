import java.util.*;

public class IPAddressValidation {

    private static final String IP6_PATTERN = "([a-f0-9]{1,4}:){7}\\b[0-9a-f]{1,4}\\b";
    private static final String IP4_PATTERN =
            "\\b(((2[0-5][0-5])|(1[0-9][0-9])|(\\b[1-9][0-9]\\b)|(\\b\\d\\b))\\.){3}((2[0-5][0-5])|(1[0-9][0-9])|(\\b[1-9][0-9]\\b)|(\\b\\d\\b))\\b";

    public static void main(String[] args) {
        Scanner stdin = new Scanner(System.in);
        int tests = Integer.parseInt(stdin.nextLine());
        for(int i = 0; i < tests; i++) {
            System.out.println(ipValidation(stdin.nextLine()));
        }
        stdin.close();
    }

    private static String ipValidation(String address) {
        if(address.matches(IP6_PATTERN))
            return "IPv6";
        else if(address.matches(IP4_PATTERN))
            return "IPv4";
        else
            return "Neither";
    }
}