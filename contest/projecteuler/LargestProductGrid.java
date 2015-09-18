import java.util.Scanner;

public class LargestProductGrid
{
	private static final int N = 20;

	private static final int ADJACENT = 4;

	public static void main(String[] args)
	{
		Scanner scanner = new Scanner(System.in);
		int[][] visited = new int[N][N];
		int[][] matrix = new int[N][N];
		for (int i = 0; i < N; i++)
		{
			for (int j = 0; j < N; j++)
			{
				matrix[i][j] = scanner.nextInt();
			}
		}
		System.out.println(max(matrix, visited));

		scanner.close();
	}

	private static long max(int[][] matrix, int[][] visited)
	{
		long max = 0;
		for (int i = 0; i < N; i++)
		{
			for (int j = 0; j < N; j++)
			{
				long product = productToRight(matrix, i, j);
				if (product > max)
				{
					max = product;
				}

				product = productToDown(matrix, i, j);
				if (product > max)
				{
					max = product;
				}

				product = productToDiagRight(matrix, i, j);
				if (product > max)
				{
					max = product;
				}

				product = productToDiagLeft(matrix, i, j);
				if (product > max)
				{
					max = product;
				}
			}
		}

		return max;
	}

	private static long productToRight(int[][] matrix, int i, int j)
	{
		long product = 1;
		if (j <= N - ADJACENT)
		{
			for (int r = j; r < j + ADJACENT; r++)
			{
				product *= matrix[i][r];
			}
		}
		return product;
	}

	private static long productToDown(int[][] matrix, int i, int j)
	{
		long product = 1;
		if (i <= N - ADJACENT)
		{
			for (int r = i; r < i + ADJACENT; r++)
			{
				product *= matrix[r][j];
			}
		}
		return product;
	}

	private static long productToDiagRight(int[][] matrix, int i, int j)
	{
		long product = 1;
		int s = j;
		if (i <= N - ADJACENT && j <= N - ADJACENT)
		{
			for (int r = i; r < i + ADJACENT; r++)
			{
				product *= matrix[r][s++];
			}
		}
		return product;
	}

	private static long productToDiagLeft(int[][] matrix, int i, int j)
	{
		long product = 1;
		if (i <= N - ADJACENT && j >= ADJACENT - 1)
		{
			for (int r = i; r < i + ADJACENT; r++)
			{
				product *= matrix[r][j--];
			}
		}
		return product;
	}
}
