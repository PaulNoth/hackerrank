package algorithms.implementation;

import java.util.Scanner;

/**
 * 
 * <b>Service Lane</b>
 * <p>
 * Calvin is driving his favorite vehicle on the 101 freeway. He notices that
 * the check engine light of his vehicle is on, and he wants to service it
 * immediately to avoid any risks. Luckily, a service lane runs parallel to the
 * highway. The length of the highway and the service lane is N units. The
 * service lane consists of N segments of unit length, where each segment can
 * have different widths.
 * </p>
 * <p>
 * Calvin can enter into and exit from any segment. Let’s call the entry segment
 * as index i and the exit segment as index j. Assume that the exit segment lies
 * after the entry segment(j>i) and i ≥ 0. Calvin has to pass through all
 * segments from index i to indexj (both inclusive).
 * </p>
 * <p>
 * Calvin has three types of vehicles - bike, car and truck, represented by 1, 2
 * and 3 respectively. These numbers also denote the width of the vehicle. We
 * are given an array width[] of length N, where width[k] represents the width
 * of kth segment of our service lane. It is guaranteed that while servicing he
 * can pass through at most 1000 segments, including entry and exit segments.
 * </p>
 * If width[k] is 1, only the bike can pass through kth segment. <br>
 * If width[k] is 2, the bike and car can pass through kth segment. <br>
 * If width[k] is 3, any of the bike, car or truck can pass through kth segment.
 * <p>
 * Given the entry and exit point of the Calvin’s vehicle in service lane,
 * output the type of largest vehicle which can pass through the service lane
 * (including the entry & exit segment)
 * </p>
 * <p>
 * Input Format The first line of input contains two integers - N & T, where N
 * is the length of the freeway, and T is the number of test cases. The next
 * line has N space separated integers which represents the width array.
 * </p>
 * <p>
 * T test cases follow. Each test case contains two integers - i & j, where i is
 * the index of segment through which Calvin enters the service lane and j is
 * the index of the lane segment where he exits.
 * </p>
 * Output Format<br>
 * For each test case, print T number that represents the largest vehicle type
 * that can pass through the service lane. <br>
 * <br>
 * Constraints <br>
 * 2 <= N <= 100000 <br>
 * 1 <= T <= 1000 <br>
 * 0 <= i < j < N <br>
 * 2 <= j-i+1 <= min(N,1000) <br>
 * 1 <= width[k] <= 3, where 0 <= k < N
 * 
 * <br>
 * <br>
 * Sample Input #00 <br>
 * 8 5 <br>
 * 2 3 1 2 3 2 3 3 <br>
 * 0 2 <br>
 * 0 1 <br>
 * 6 7 <br>
 * 3 5 <br>
 * 0 7 <br>
 * <br>
 * Sample Output #00<be>
 * 
 * 1 <br>
 * 2<br>
 * 3 <br>
 * 2 <br>
 * 1
 * 
 * @author Pidanic
 *
 */
public class ServiceLane
{
	private static final int BIKE = 1;

	// private static final int CAR = 2;

	private static final int TRUCK = 3;

	public static void main(String[] args)
	{
		Scanner scanner = new Scanner(System.in);
		int laneLength = scanner.nextInt();
		int testCases = scanner.nextInt();
		int[] laneWidth = new int[laneLength];
		for (int i = 0; i < laneLength; i++)
		{
			laneWidth[i] = scanner.nextInt();
		}

		for (int j = 0; j < testCases; j++)
		{
			int laneEntry = scanner.nextInt();
			int laneExit = scanner.nextInt();
			System.out.println(largestVehicle(laneWidth, laneEntry, laneExit));
		}
		scanner.close();
	}

	private static int largestVehicle(int[] laneWidth, int laneEntry,
			int laneExit)
	{
		int car = TRUCK;
		// for (int i = laneEntry; i <= laneExit; i++)
		// {
		// if(laneWidth[i] < car)
		// {
		// car = laneWidth[i];
		// }
		// }

		while (car > BIKE && laneExit >= laneEntry)
		{
			if(laneWidth[laneEntry] < car)
			{
				car = laneWidth[laneEntry];
			}
			laneEntry++;
		}
		return car;
	}
}
