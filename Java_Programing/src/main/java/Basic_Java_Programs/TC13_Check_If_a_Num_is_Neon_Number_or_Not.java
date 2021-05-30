package Basic_Java_Programs;

import java.io.IOException;

public class TC13_Check_If_a_Num_is_Neon_Number_or_Not {

	public static void main(String[] args) throws IOException {
		int num = 10;
		int result = num * num;
		int rem = 0;
		int temp = 0;
		int div = 0;
		rem = result % 10;
		div = result / 10;
		temp = div + rem;

		if (temp == num && num != 10) {
			System.out.println(num + " is a neon number");
		} else {
			System.out.println(num + "is not a neon number");
		}
	}

}
