import java.util.*;

public class CamelCase {

    public static void main(String[] args) {
        Scanner stdin = new Scanner(System.in);
        String text = stdin.nextLine();
        String[] words = text.split("[A-Z]");
        System.out.println(words.length);
        stdin.close();
    }
}