package Basic_Java_Programs;

public class TC16_Print_N_Number_Of_Fibonnaci_Series {

	public static void main(String[] args) {

		// PRINT N NUMBER OF FIBONNACI SERIES

		int a = 0;
		int b = 1;
		int c = 0;
		int num = 5;
		System.out.println(a + "\n" + b);

		for (int i = 1; i <= num - 2; i++) {

			c = a + b;
			System.out.println("" + c);
			a = b;
			b = c;

		}
	}

}
