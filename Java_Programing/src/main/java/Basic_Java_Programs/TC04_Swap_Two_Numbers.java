package Basic_Java_Programs;

public class TC04_Swap_Two_Numbers {

	// Function to swap two numbers Using temporary variable

	static void swapValuesUsingThirdVariable(int m, int n) {
		// Swapping the values
		int temp = m;
		m = n;
		n = temp;
		System.out.println("Value of m is " + m + " and Value of n is " + n);
	}

	static void swapValuesWithoutUsingThirdVariable(int m, int n) {

		// Difference of 2nd from 1st is stored in first variable
		m = m - n;
		// Sum is stored in second variable
		n = m + n;
		// Difference of 1st from 2nd is replaced in first variable
		m = n - m;
		// Print numbers
		System.out.println("Value of m is " + m + " and Value of n is " + n);
	}


	public static void main(String[] args) {

		swapValuesUsingThirdVariable(3, 5);

		swapValuesWithoutUsingThirdVariable(2, 3);

	}

}
