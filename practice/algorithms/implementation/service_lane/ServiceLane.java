import java.util.Scanner;

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
