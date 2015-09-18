import java.util.Arrays;
import java.util.Scanner;

public class PriyankaAndToys
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        String[] weights = scanner.nextLine().split("\\s+");

        int[] toyWeights = new int[n];
        for (int i = 0; i < n; i++)
        {
            toyWeights[i] = Integer.parseInt(weights[i]);
        }

        Arrays.sort(toyWeights);
        int price = 1;
        int lastWeight = toyWeights[0];

        for (int i = 1; i < toyWeights.length; i++)
        {
            if(lastWeight + 4 >= toyWeights[i])
            {
                // lastWeight = toys[i];
            }
            else
            {
                price++;
                lastWeight = toyWeights[i];
            }
        }
        System.out.println(price);
        scanner.close();
    }
}
