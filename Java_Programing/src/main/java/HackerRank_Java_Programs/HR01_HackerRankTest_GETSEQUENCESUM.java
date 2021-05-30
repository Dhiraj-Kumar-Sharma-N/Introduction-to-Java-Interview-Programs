package HackerRank_Java_Programs;

public class HR01_HackerRankTest_GETSEQUENCESUM {

	/*
	 * given three integers i, j,k a sequence sum to be the value of
	 * i+(i+1)+(i+2)+...j+(j-1)+(j-2)+...+ k. (increment from i until it equals j,
	 * then decrement from j until it equals k). given values i, j,k, calculate the
	 * sequence sum as described. i=5,j=9,k=6. sum all the values from i to j and
	 * back to k: 5+6+7+8+9+8+7+6=56. complete the function getsequencesum in editor
	 * below getsequencesum has following parameters: int i, int j, int k : three
	 * integers. return: long: the value of the sequence sum
	 * 
	 * ​
	 */
	public static void main(String[] args) {

		int i = 5;
		int j = 9;
		int k = 6;
		int sum1 = 0;
		int sum2 = 0;

		for (int k2 = i; k2 <= j; k2++) {

			sum1 = sum1 + k2;

		}

		for (int l = j - 1; l >= k; l--) {
			sum2 = sum2 + l;

		}
		System.out.println(sum2 + sum1);
	}

}
