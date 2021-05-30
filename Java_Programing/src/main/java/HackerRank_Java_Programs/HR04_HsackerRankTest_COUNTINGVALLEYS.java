package HackerRank_Java_Programs;

import java.util.Arrays;

public class HR04_HsackerRankTest_COUNTINGVALLEYS {

	public static void main(String[] args) {

		int U = 1;
		int D = -1;
		int count = 0;
		int sum = 0;

		// String path = "UDDDUDUU";
		String path = "DUDDUUUUDDD";
		char[] carr = path.toCharArray();

		System.out.println(Arrays.toString(carr));

		for (int i = 0; i < carr.length; i++) {
			if (carr[i] == 'U') {
				sum = sum + U;
				if (sum == 0) {
					count++;
				}
			} else if (carr[i] == 'D') {
				sum = sum + D;
			}

		}

		System.out.println("Total Number of Valleys only " + count);

	}

}
