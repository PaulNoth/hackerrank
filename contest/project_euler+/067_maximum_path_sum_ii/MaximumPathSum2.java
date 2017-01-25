import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MaximumPathSum2 
{
    public static void main(String[] args)
    {
        Scanner stdin = new Scanner(System.in);
        int tests = stdin.nextInt();
        for (int t = 0; t < tests; t++)
        {
            List<List<Long>> rows = new ArrayList<>();
            int rowCount = stdin.nextInt();
            for (int i = 0; i < rowCount; i++)
            {
                List<Long> row = new ArrayList<>();
                for (int j = 0; j < i + 1; j++)
                {
                    row.add(stdin.nextLong());
                }
                rows.add(row);
            }
            
            for (int i = rows.size() - 2; i >= 0; i--)
            {
                List<Long> tempRow = new ArrayList<>();
                for (int j = 0; j < rows.get(i).size(); j++)
                {
                    List<Long> upperRow = rows.get(i);
                    List<Long> bottomRow = rows.get(i + 1);
                    long sumLeft = upperRow.get(j) + bottomRow.get(j);
                    long sumRight = upperRow.get(j) + bottomRow.get(j + 1);
                    long max = sumLeft > sumRight ? sumLeft : sumRight;
                    tempRow.add(max);
                }
                rows.remove(i + 1);
                rows.set(i, tempRow);
            }

            System.out.println(rows.get(0).get(0));
        }
        stdin.close();
    }
}
