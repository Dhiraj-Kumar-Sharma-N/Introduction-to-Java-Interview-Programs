package Basic_Java_Programs;

public class TC09_Find_GCD_or_HCF_of_2_numbers {

	static int GCD(int x, int y) {
		int GCD = 0;

		for (int i = 1; i <= x && i <= y; i++) {

			if (x % i == 0 && y % i == 0) {

				GCD = i;
			}
		}

		return GCD;
	}

	public static void main(String[] args) {

		int x = 100, y = 88;
		System.out.println("GCD/HCF of " + x + " and " + y + " is " + GCD(x, y));

	}

}
