import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class NameScores
{
    private static Map<Character, Integer> alphabet;
    static
    {
        alphabet = new HashMap<>(26);
        alphabet.put('A', 1);
        alphabet.put('B', 2);
        alphabet.put('C', 3);
        alphabet.put('D', 4);
        alphabet.put('E', 5);
        alphabet.put('F', 6);
        alphabet.put('G', 7);
        alphabet.put('H', 8);
        alphabet.put('I', 9);
        alphabet.put('J', 10);
        alphabet.put('K', 11);
        alphabet.put('L', 12);
        alphabet.put('M', 13);
        alphabet.put('N', 14);
        alphabet.put('O', 15);
        alphabet.put('P', 16);
        alphabet.put('Q', 17);
        alphabet.put('R', 18);
        alphabet.put('S', 19);
        alphabet.put('T', 20);
        alphabet.put('U', 21);
        alphabet.put('V', 22);
        alphabet.put('W', 23);
        alphabet.put('X', 24);
        alphabet.put('Y', 25);
        alphabet.put('Z', 26);
    }

    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        int namesCount = Integer.parseInt(scanner.nextLine());
        List<String> namesList = new ArrayList<>(namesCount);
        for (int i = 0; i < namesCount; i++)
        {
            String name = scanner.nextLine();
            namesList.add(name);
        }
        Collections.sort(namesList);
        Map<String, Integer> names = new HashMap<>();
        for (int i = 1; i <= namesList.size(); i++)
        {
            names.put(namesList.get(i - 1), i);
        }
        int queries = Integer.parseInt(scanner.nextLine());
        for (int i = 0; i < queries; i++)
        {
            String query = scanner.nextLine();
            int score = nameScore(names, query);
            System.out.println(score);
        }
        scanner.close();
    }

    private static int nameScore(Map<String, Integer> names, String name)
    {
        int result = 0;
        for (int i = 0; i < name.length(); i++)
        {
            result += alphabet.get(name.charAt(i));
        }
        result *= names.get(name);
        return result;
    }
}
