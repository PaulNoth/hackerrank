import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class DetectHtmlTags {

    private static final String TAG_PATTERN = "<\\s*[a-z0-9]+";

    public static void main(String[] args) {
        Scanner stdin = new Scanner(System.in);
        int lines = Integer.parseInt(stdin.nextLine());
        Set<String> tags = new TreeSet<>();
        for(int i = 0; i < lines; i++) {
            String line = stdin.nextLine();
            Pattern pattern = Pattern.compile(TAG_PATTERN);
            Matcher matcher = pattern.matcher(line);
            while (matcher.find()) {
                tags.add(matcher.group().replaceAll("<", ""));
            }
        }
        Collector col = Collectors.joining(";");
        System.out.println(tags.stream().collect(col));
        stdin.close();
    }
}
