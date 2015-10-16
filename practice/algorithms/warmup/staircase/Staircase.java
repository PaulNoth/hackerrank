import java.util.*;

public class Staircase 
{

    public static void main(String[] args) 
	{
        Scanner stdin = new Scanner(System.in);
        int height = Integer.parseInt(stdin.nextLine());
        for(int i = 0; i < height; i++)
        {
           for(int j = 0; j < height; j++)
           {
                if(height - i - 2 < j)
                {
                    System.out.print("#");
                }
               else
               {
                   System.out.print(" ");
               }
           }
            System.out.println();
        }
        stdin.close();
    }
}