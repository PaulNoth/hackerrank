import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class FindSubstring {

    public static void main(String[] args) {
        Scanner stdin = new Scanner(System.in);
        int linesCount = Integer.parseInt(stdin.nextLine());
        String[] lines = new String[linesCount];
        for(int i = 0; i < linesCount; i++) {
            lines[i] = stdin.nextLine();
        }
        int substringCount = Integer.parseInt(stdin.nextLine());
        String[] substrings = new String[substringCount];
        for(int i = 0; i < substringCount; i++) {
            substrings[i] = stdin.nextLine();
        }
        for(int j = 0; j < substrings.length; j++) {
            int count = 0;
            String pattern = "\\w+" + substrings[j] + "\\w+";
            for(int i = 0; i < lines.length; i++) {
                String line = lines[i];
                Pattern p = Pattern.compile(pattern);
                Matcher m = p.matcher(line);
                while(m.find()) {
                    m.group();
                    count++;
                }
            }
            System.out.println(count);
        }
        stdin.close();
    }
}