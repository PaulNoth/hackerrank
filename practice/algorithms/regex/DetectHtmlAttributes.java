import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class DetectHtmlAttributes
{
	private static final String REGEX = "<[a-z0-9]+(\\s+[a-z]+=[\\\"\\'][a-zA-Z\\[\\]\\-\\/\\\\:\\.\\s_\\?!\\d;\\(\\),#@\\{\\}=%\\&\\|\\+\\*]*[\\\"\\'])*(\\s+/)?>";

	public static void main(String[] args)
	{
		Scanner scanner = new Scanner(System.in);
		Pattern regex = Pattern.compile(REGEX);

		int tests = Integer.parseInt(scanner.nextLine());
		List<String> tagsWithAttributes = new ArrayList<>();
		for(int i = 0; i < tests; i++)
		{
			String line = scanner.nextLine();

			Matcher matcher = regex.matcher(line);

			while(matcher.find())
			{
				tagsWithAttributes.add(matcher.group());
			}
		}

		Map<String, Set<String>> map = new TreeMap<>();

		for(String tagAtt : tagsWithAttributes)
		{
			Pattern tagPattern = Pattern.compile("<[a-z0-9]+");
			Matcher tagMatcher = tagPattern.matcher(tagAtt);
			String tag = null;
			Set<String> attributes = new TreeSet<>();
			if(tagMatcher.find())
			{
				tag = tagMatcher.group().replace("<", "");
			}

			Pattern attPattern = Pattern
					.compile("[a-z]+=[\\\"\\'][a-zA-Z\\[\\]\\-\\/\\\\:\\.\\s_\\?!\\d;\\(\\),#@\\{\\}=%\\&\\|\\+\\*]*[\\\"\\']");
			Matcher attMatcher = attPattern.matcher(tagAtt);
			while(attMatcher.find())
			{
				attributes
						.add(attMatcher
								.group()
								.trim()
								.replaceAll(
										"=[\\\"\\'][a-zA-Z\\[\\]\\-\\/\\\\:\\.\\s_\\?!\\d;\\(\\),#@\\{\\}=%\\&\\|\\+\\*]*[\\\"\\']",
										""));
			}
			Set<String> mapSet = map.get(tag);
			if(mapSet != null && !mapSet.isEmpty())
			{
				mapSet.addAll(attributes);
				map.put(tag, mapSet);
			}
			else
			{
				map.put(tag, attributes);
			}
		}

		StringBuilder sb = new StringBuilder();
		for(String tag : map.keySet())
		{
			sb.append(tag);
			sb.append(":");
			for(String attribute : map.get(tag))
			{
				sb.append(attribute);
				sb.append(",");
			}
			if(!map.get(tag).isEmpty())
			{
				sb.deleteCharAt(sb.length() - 1);
			}
			System.out.println(sb);
			sb.delete(0, sb.length());
		}
		scanner.close();
	}
}
