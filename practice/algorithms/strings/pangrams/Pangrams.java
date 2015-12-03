import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;


public class Pangrams 
{
	public static void main(String[] args)
	{
		Scanner stdin = new Scanner(System.in);
		String string = stdin.nextLine().toLowerCase();
		Set<Character> alphabet = new HashSet<>();
		for(int i = 0; i < string.length(); i++)
		{
			if(string.charAt(i) != ' ')
			{
				alphabet.add(string.charAt(i));
			}
		}
		
		if(alphabet.size() == 26)
		{
			System.out.println("pangram");
		}
		else 
		{
			System.out.println("not pangram");
		}
		stdin.close();
	}
}
