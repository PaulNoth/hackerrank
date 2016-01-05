import java.util.Arrays;
import java.util.Scanner;

public class Pairs 
{
	public static void main(String[] args)
	{
		 Scanner in = new Scanner(System.in);
		 int n = in.nextInt();
		 int k = in.nextInt();
		 int[] ar = new int[n];
		 for(int i = 0; i < n; i++){
			 ar[i] = in.nextInt(); 
		 }
		 Arrays.sort(ar);
		 
		 int pairs = 0;
		 for(int i = 0; i < ar.length; i++)
		 {
			 for(int j = i + 1; j < ar.length; j++)
			 {
				 if(ar[j] - ar[i] == k)
				 {
					 pairs++;
					 break;
				 }
			 }
		 }
		 System.out.println(pairs);
		 in.close();
	}
}
