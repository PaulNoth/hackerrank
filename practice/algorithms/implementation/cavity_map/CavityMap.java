import java.util.Arrays;
import java.util.Scanner;

public class CavityMap {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = Integer.parseInt(in.nextLine());
		String[] map = new String[n];
		for (int i = 0; i < n; i++) {
			map[i] = in.nextLine();
		}
		String[] cavity = cavity(map);
		for (int i = 0; i < cavity.length; i++) {
			System.out.println(cavity[i]);
		}
		in.close();
	}

	private static String[] cavity(String[] map) {
		String[] result = Arrays.copyOf(map, map.length);
		for (int i = 1; i < map.length - 1; i++) {
			for (int j = 1; j < map.length - 1; j++) {
				if (isCavity(map, i, j)) {
					char[] c = Arrays.copyOf(result[i].toCharArray(), result[i].toCharArray().length);
					c[j] = 'X';
					result[i] = String.valueOf(c);
				}
			}
		}
		return result;
	}

	private static boolean isCavity(String[] map, int i, int j) {
		int depth = Character.digit(map[i].charAt(j), 10);
		if (depth <= Character.digit(map[i - 1].charAt(j), 10)) {
			return false;
		}
		if (depth <= Character.digit(map[i].charAt(j - 1), 10)) {
			return false;
		}
		if (depth <= Character.digit(map[i + 1].charAt(j), 10)) {
			return false;
		}
		if (depth <= Character.digit(map[i].charAt(j + 1), 10)) {
			return false;
		}
		return true;
	}
}
