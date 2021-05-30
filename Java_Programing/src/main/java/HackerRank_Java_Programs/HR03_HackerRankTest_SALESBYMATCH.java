package HackerRank_Java_Programs;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/*
There is a large pile of socks that must be paired by color. 
Given an array of integers representing the color of each sock,
determine how many pairs of socks with matching colors there are.

Example

n= 9;

array= 10 20 20 10 10 30 50 10 20;

There is one pair of color  and one of color . 
There are three odd socks left, one of each color. The number of pairs is 2 .

*/
public class HR03_HackerRankTest_SALESBYMATCH {

	public static void main(String[] args) {

		int count = 0;

		List<Integer> ar1 = new ArrayList<Integer>(Arrays.asList(10, 20, 20, 10, 10, 30, 50, 10, 40, 50));

		Collections.sort(ar1);

		System.out.println(ar1);
		int n = ar1.size();
		for (int j = 0; j < n - 1; j++) {
			if (j < n && ar1.get(j) == ar1.get(j + 1)) {
				count++;
				j = j + 1;
			}
		}

		System.out.println(count);

	}

}
