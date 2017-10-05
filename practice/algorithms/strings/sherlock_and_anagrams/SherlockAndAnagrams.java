import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class SherlockAndAnagrams
{
    public static void main(String[] args)
    {
        Scanner stdin = new Scanner(System.in);
        int tests = Integer.parseInt(stdin.nextLine());
        for (int i = 0; i < tests; i++)
        {
            String string = stdin.nextLine();
            int stringLength = string.length();
            long resultPairs = 0;
            for (int length = 1; length <= stringLength; length++)
            {
                for (int start1 = 0; start1 < stringLength; start1++)
                {
                    for (int start2 = start1 + 1; start2 < stringLength; start2++)
                    {
                        int end1 = start1 + length;
                        int end2 = start2 + length;
                        if(end1 <= stringLength && end2 <= stringLength)
                        {
                            String substring1 = string.substring(start1, end1);
                            String subString2 = string.substring(start2, end2);
                            if(toCharacterCount(substring1).equals(
                                    toCharacterCount(subString2)))
                            {
                                resultPairs++;
                            }
                        }
                    }
                }
            }
            System.out.println(resultPairs);
        }
        stdin.close();
    }

    private static Map<Character, Integer> toCharacterCount(String word)
    {
        Map<Character, Integer> result = new HashMap<>();
        for (char c : word.toCharArray())
        {
            if(result.containsKey(c))
            {
                result.put(c, result.get(c) + 1);
            }
            else
            {
                result.put(c, 1);
            }
        }
        return result;
    }
}
