import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class PlusMinus 
{

    public static void main(String[] args) 
	{
        Scanner stdin = new Scanner(System.in);
        int n = Integer.parseInt(stdin.nextLine());
        String[] numbers = stdin.nextLine().split(" ");
        int positives = 0;
        int negatives = 0;
        int zeroes = 0;
        for(int i = 0; i < n; i++)
        {
            int num = Integer.parseInt(numbers[i]);
            if(num > 0)
            {
                positives++;    
            }
            else if(num < 0)
            {
                negatives++;
            }
            else
            {
                zeroes++;    
            }
        }
        System.out.println(String.format(Locale.ENGLISH, "%.3f", (double) positives / n));
        System.out.println(String.format(Locale.ENGLISH, "%.3f", (double) negatives / n));
        System.out.println(String.format(Locale.ENGLISH, "%.3f", (double) zeroes / n));
        stdin.close();
    }
}