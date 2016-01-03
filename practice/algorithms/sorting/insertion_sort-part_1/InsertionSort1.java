import java.util.*;

public class InsertionSort1 {
    
    public static void insertIntoSorted(int[] ar) {
        // Fill up this function
    	int num = ar[ar.length - 1];
    	boolean placed = false;
    	for(int j = ar.length - 2; j >= 0; j--)
    	{
    		if(ar[j] > num)
    		{
    			ar[j + 1] = ar[j];
    			printArray(ar);
    		}
    		else
    		{
    			ar[j + 1] = num;
    			printArray(ar);
    			placed = true;
    			break;
    		}
    	}
    	if(!placed)
    	{
    		ar[0] = num;
    		printArray(ar);
    	}
    }
    
    
/* Tail starts here */
     public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int s = in.nextInt();
        int[] ar = new int[s];
         for(int i=0;i<s;i++){
            ar[i]=in.nextInt(); 
         }
         insertIntoSorted(ar);
         in.close();
    }
    
    
    private static void printArray(int[] ar) {
      for(int n: ar){
         System.out.print(n+" ");
      }
        System.out.println("");
   }
    
    
}
 
