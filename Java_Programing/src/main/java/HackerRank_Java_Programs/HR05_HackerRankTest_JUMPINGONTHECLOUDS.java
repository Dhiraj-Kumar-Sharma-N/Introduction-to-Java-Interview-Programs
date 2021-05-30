package HackerRank_Java_Programs;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class HR05_HackerRankTest_JUMPINGONTHECLOUDS {

	public static void main(String[] args) {

		List<Integer> c = new ArrayList<Integer>(Arrays.asList(0, 0, 1, 0, 0, 0, 0, 1, 0, 0));
		int lenght = c.size();
		int count = - 1;

		for (int i = 0; i < lenght;) {

			if ((i + 2) < lenght && c.get(i + 2) == 0) {
				i = i + 2;

			} else {
				i = i + 1;
			}

			count++;

		}
		System.out.println(count);

	}

}
