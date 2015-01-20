package algorithms.graphtheory;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 * <b>Even Tree</b>
 * <p>
 * You are given a tree (a simple connected graph with no cycles). You have to
 * remove as many edges from the tree as possible to obtain a forest with the
 * condition that : Each connected component of the forest should contain an
 * even number of vertices.
 * </p>
 * <p>
 * Your task is to calculate the number of removed edges in such a forest.
 * </p>
 * <p>
 * Input Format <br>
 * The first line of input contains two integers N and M. N is the number of
 * vertices and M is the number of edges. The next M lines contain two integers
 * ui and vi which specifies an edge of the tree. (1-based index)
 * </p>
 * <p>
 * Output Format<br>
 * Print the answer, a single integer.
 * </p>
 * <p>
 * Constraints <br>
 * 2 <= N <= 100.
 * </p>
 * <p>
 * Note: The tree in the input will be such that it can always be decomposed
 * into components containing even number of nodes.
 * </p>
 * <p>
 * Sample Input<br>
 * 10 9 <br>
 * 2 1 <br>
 * 3 1 <br>
 * 4 3 <br>
 * 5 2<br>
 * 6 1<br>
 * 7 2<br>
 * 8 6 <br>
 * 9 8 <br>
 * 10 8
 * </p>
 * <p>
 * Sample Output <br>
 * 2
 * </p>
 * <p>
 * Explanation On removing the edges (1, 3) and (1, 6), we can get the desired
 * result.
 * </p>
 * 
 * @author Pidanic
 *
 */
// www.careercup.com/question?id=14587020} <br>
public class EvenTree
{
	public static void main(String[] args)
	{
		Scanner scanner = new Scanner(System.in);
		int vertices = scanner.nextInt();
		int edges = scanner.nextInt();
		int[] tree = new int[vertices + 1];

		Map<Integer, Integer> map = new HashMap<>();

		for (int i = 0; i < edges; i++)
		{
			int connected = scanner.nextInt();
			int parent = scanner.nextInt();
			tree[connected] = parent;

			if(map.get(parent) == null)
			{
				map.put(parent, 1);
			}
			if(map.get(connected) == null)
			{
				map.put(connected, 1);
			}

			int count = map.get(parent);
			map.put(parent, ++count);
		}

		int result = 0;
		for (int nodeIndex = tree.length - 1; nodeIndex > 1; nodeIndex--)
		{
			if(map.get(nodeIndex) % 2 == 0)
			{
				boolean hasEven = false;
				for (int i = tree.length - 1; i > 1; i--)
				{
					if(tree[i] == nodeIndex)
					{
						int node = i;
						// System.out.println(node);
						if(map.get(node) % 2 == 0)
						{
							hasEven = true;
						}
					}
				}
				if(!hasEven)
				{
					result++;
					// System.out.println("cut " +nodeIndex);
					int parent = tree[nodeIndex];
					tree[nodeIndex] = 0;
					// System.out.println("parent " + parent);
					int count = map.get(parent);
					map.put(parent, --count);
				}
				// System.out.println();
			}
		}
		System.out.println(result);
		scanner.close();
	}
}
