import java.util.Scanner;

public class AngryProfessor
{
    public static void main(String[] args)
    {
        Scanner stdin = new Scanner(System.in);
        int tests = Integer.parseInt(stdin.nextLine());
        for (int i = 0; i < tests; i++)
        {
            String[] inputs = stdin.nextLine().split(" ");
            int students = Integer.parseInt(inputs[0]);
            int classCancelation = Integer.parseInt(inputs[1]);
            String[] arrivals = stdin.nextLine().split(" ");
            if(classCancelation > studentsBeforeClass(arrivals))
            {
                System.out.println("YES");
            }
            else
            {
                System.out.println("NO");
            }
        }
        stdin.close();
    }

    private static int studentsBeforeClass(String[] arrivals) {
		int result = 0;
		for(int i = 0; i < arrivals.length; i++)
		{
		    if(Integer.parseInt(arrivals[i]) <= 0)
		    {
		        result++;
		    }
		}
		return result;
	}
}
