package weekly.week12;

import java.util.Arrays;
import java.util.Scanner;

/**
 * <b>Priyanka and Toys</b>
 * <p>
 * Little Priyanka visited a kids' shop. There are <tt>N</tt> toys and their
 * weight is represented by an array <tt>W=[w1,w2,... ,wN]</tt>. Each toy costs
 * 1 unit, and if she bought a toy with weight <tt>w'</tt>, then she gets all
 * other toys whose weight lie between <tt>[w',w'+4]</tt> free of cost.
 * </p>
 * <p>
 * Input Format<br>
 * The first line contains an integer <tt>N</tt> i.e. number of toys. Next line
 * will contain <tt>N</tt> integers, <tt>w1,w2,...,wN</tt>, representing the
 * weight array.
 * </p>
 * <p>
 * Output Format<br>
 * Minimum price with which Priyanka could buy all of toys.
 * </p>
 * <p>
 * Constraints<br>
 * 1<=N<=10<sup>5</sup><br>
 * 0<=wi<=10<sup>4</sup>,where i∈[1,N]
 * </p>
 * <p>
 * Sample Input<br>
 * 5<br>
 * 1 2 3 17 10
 * </p>
 * <p>
 * Sample Output<br>
 * 3
 * </p>
 * <p>
 * Explanation<br>
 * She bought 1st toy with weight 1 for one 1 unit and gets 2nd and 3rd toy for
 * free as their weight lies between [1,5]. And she had bought last two toys
 * separately.
 * </p>
 * 
 * @author Pidanic
 *
 */
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
