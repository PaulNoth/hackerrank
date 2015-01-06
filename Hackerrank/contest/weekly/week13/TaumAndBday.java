package weekly.week13;

import java.math.BigInteger;
import java.util.Scanner;

/**
 * <b>Taum and B'day</b>
 * <p>
 * Taum is planning to celebrate the birthday of his friend Diksha. There are
 * two types of gifts that Diksha wants from Taum: one is black and the other is
 * white. To make her happy, Taum has to buy <tt>B</tt> number of black gifts
 * and <tt>W</tt> number of white gifts.
 * </p>
 * <p>
 * <ul>
 * <li>The cost of each black gift is <tt>X</tt> units
 * <li>and the cost of every white gift is <tt>Y</tt>
 * <li>units and the cost of converting each black gift into white or white into
 * black is <tt>Z</tt> units.
 * </ul>
 * Help Taum by deducing the minimum amount he needs to spend on Diksha's gifts?
 * </p>
 * <p>
 * Input Format<br>
 * The first line will contain an integer <tt>T</tt> which will be the number of
 * test cases. There will be <tt>T</tt> pair of lines. The first line of each
 * test case will contain the value of <tt>B</tt> and <tt>W</tt>. Another line
 * of each test will contain the value of <tt>X</tt>,<tt>Y</tt> and <tt>Z</tt>.
 * </p>
 * <p>
 * Constraints<br>
 * 1<=T<=10<br>
 * 0<=X,Y,Z,B,W<=10<sup>9</sup>
 * </p>
 * <p>
 * Output Format<br>
 * <tt>T</tt> lines each containing output for a particular test case.
 * </p>
 * <p>
 * Sample Input 1<br>
 * 10 10<br>
 * 1 1 1
 * </p>
 * <p>
 * Sample Output<br>
 * 20
 * </p>
 * <p>
 * Explanation<br>
 * There is no benefit in converting the white gift into the black or the black
 * gift into the white, So He will have to buy each gift for 1 unit.
 * </p>
 * 
 * @author Pidanic
 *
 */
public class TaumAndBday
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        int tests = Integer.parseInt(scanner.nextLine());
        for (int i = 0; i < tests; i++)
        {
            String[] counts = scanner.nextLine().split("\\s+");
            BigInteger black = new BigInteger(counts[0]);
            BigInteger white = new BigInteger(counts[1]);
            String[] costs = scanner.nextLine().split("\\s+");
            BigInteger blackCost = new BigInteger(costs[0]);
            BigInteger whiteCost = new BigInteger(costs[1]);
            BigInteger convertCost = new BigInteger(costs[2]);

            BigInteger ansWithoutConvert = black.multiply(blackCost).add(
                    white.multiply(whiteCost));

            BigInteger blackConvertCost = black.multiply(convertCost);
            BigInteger ansWhite = white.add(black).multiply(whiteCost)
                    .add(blackConvertCost);

            BigInteger whiteConvertCost = white.multiply(convertCost);
            BigInteger ansBlack = black.add(white).multiply(blackCost)
                    .add(whiteConvertCost);

            BigInteger min = ansWithoutConvert;
            if(ansBlack.compareTo(min) < 0)
            {
                min = ansBlack;
            }
            if(ansWhite.compareTo(min) < 0)
            {
                min = ansWhite;
            }
            System.out.println(min);
        }
        scanner.close();
    }
}
