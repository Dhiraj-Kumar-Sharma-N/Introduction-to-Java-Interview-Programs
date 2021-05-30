package Basic_Java_Programs;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

// TC18_Find_Sum_of_Fibonacci_Series_Numbers_of_First_N_Even_Indexes
public class TC18_Find_Sum_of_FibSeries_Numbers_of_First_N_Even_Indexes {
	public static void main(String[] args) throws IOException {

		int a = 0;
		int b = 1;
		int c = 0;
		int num = 9;

		List<Integer> arr = new ArrayList<>(Arrays.asList(a, b));

		for (int i = 1; i <= num - 2; i++) {

			c = a + b;

			arr.add(c);
			a = b;
			b = c;

		}

		System.out.println(arr);

		int evenindex = 4;

		for (int i = 1; i <= arr.size(); i++) {

			if (i % 2 != 0 || arr.get(i) == 2) {
				arr.remove(i);

			}

		}

		System.out.println(arr);

		int sum = 0;
		for (int i = 0; i <= evenindex; i++) {

			sum = sum + arr.get(i);
		}
		System.out.println("sum is " + sum);
	}

}
