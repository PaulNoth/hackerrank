public class PerfectHiring 
{
	public static void main(String[] args) 
	{
		Scanner stdin = new Scanner(System.in);
		String[] lineInput = stdin.nextLine().split(" ");
		
		long candidates = Long.parseLong(lineInput[0]);
		long patience = Long.parseLong(lineInput[1]);
		long x = Long.parseLong(lineInput[2]);
		String[] hackerrankScores = stdin.nextLine().split(" ");
		long aplicantId = 0;
		long maxRating = Long.MIN_VALUE;
		for(int i = 0; i < candidates; i++)
		{
			long score = Long.parseLong(hackerrankScores[i]);
			long rating = patience * score;
			if(rating > maxRating)
			{
				aplicantId = i+1;
				maxRating = rating;
			}
			patience -= x;
		}
		System.out.println(aplicantId);
		
		
		stdin.close();
	}
}
