package Basic_Java_Programs;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class TC17_Sum_of_N_Number_Of_Fibonnaci_Series {

	public static void main(String[] args) {

		// PRINT N NUMBER OF FIBONNACI SERIES

		int a = 0;
		int b = 1;
		int c = 0;
		int num = 9;
		int sum1 = 0;
		List<Integer> arr = new ArrayList<>(Arrays.asList(a, b));

		for (int i = 1; i <= num - 2; i++) {

			c = a + b;

			arr.add(c);
			a = b;
			b = c;

		}

		System.out.println(arr);

		for (int i = 0; i < arr.size(); i++) {
			sum1 = sum1 + arr.get(i);
		}
		System.out.println("sum of all integer is " + sum1);

	}

}
