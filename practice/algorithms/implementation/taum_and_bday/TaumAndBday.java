import java.math.BigInteger;
import java.util.Scanner;

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
