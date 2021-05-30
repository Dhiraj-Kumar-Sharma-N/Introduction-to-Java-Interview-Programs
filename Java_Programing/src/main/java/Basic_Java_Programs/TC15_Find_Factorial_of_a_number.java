package Basic_Java_Programs;

public class TC15_Find_Factorial_of_a_number {

	public static void main(String[] args) {
		int num = 6;
		int res = 1;

		for (int i = num; i >= 1; i--) {

			res = res * i;
		}

		System.out.println("Factorial of " + num + " is " + res);

	}
}
