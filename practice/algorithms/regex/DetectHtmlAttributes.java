package algorithms.regex;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * <b>Detect HTML Attributes</b>
 * <p>
 * Charlie's second assignment was given by the Professor as soon as he
 * submitted the first one. Professor asked Charlie to create a list of all the
 * attributes of every tag found in HTML pages.
 * </p>
 * <p>
 * {@code <p>
 * <p>
 * This is a paragraph
 * </p> } <br>
 * The above HTML string has p as its tag but no attributes. </p>
 * 
 * <p>
 * {@code
 * <a href="http://www.quackit.com/html/tutorial/html_links.cfm">Example
 * Link</a>} <br>
 * This string has a as a tag and href as an attribute.
 * </p>
 * <p>
 * Input Format <br>
 * The first line contains N, the number of lines in the HTML fragment. This is
 * followed by lines from a valid HTML document or fragment.
 * </p>
 * <p>
 * Constraints <br>
 * Number of characters in the test fragments <= 10000 characters. Characters
 * will be restricted to ASCII. Fragments for the tests will be picked up from
 * Wikipedia. Attributes are all lowercase alphabets.
 * </p>
 * <p>
 * Output Format <br>
 * Each tag must be separated by a newline arranged in lexicographic order Each
 * attribute noted for a given tag must be arranged next to a tag in
 * lexicographic order. <br>
 * The output will be of the format <br>
 * <code>tag-1:attribute-1,attribute-2,attribute-3....</code><br>
 * <code>tag-2:attribute-1,attribute-2,attribute-3....</code><br>
 * <code>tag-3:attribute-1,attribute-2,attribute-3....</code><br>
 * <code>...</code><br>
 * <code>tag-n:attribute-1,attribute-2,attribute-3....</code><br>
 * Where tag-1 is lexicographically smaller than tag-2 and attribute-1 is
 * lexicographically smaller than attribute-2
 * </p>
 * <p>
 * Sample Input:1<br>
 * 2<br>
 * {@code <p><a href="http://www.quackit.com/html/tutorial/html_links.cfm">Example Link</a></p>}
 * <br>
 * {@code <div class="more-info"><a href="http://www.quackit.com/html/examples/html_links_examples.cfm">More Link Examples...</a></div>}
 * </p>
 * <p>
 * Sample Output:1<br>
 * a:href <br>
 * div:class<br>
 * p:
 * </p>
 * 
 * @author Pidanic
 *
 */
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
