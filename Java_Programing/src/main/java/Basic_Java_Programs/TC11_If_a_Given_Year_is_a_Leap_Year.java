package Basic_Java_Programs;

public class TC11_If_a_Given_Year_is_a_Leap_Year {

	public static void isLeapYear(int Year) {
		if (Year % 4 == 0) {

			if (Year % 100 == 0) {

				if (Year % 400 == 0) {
					System.out.println("Its a Leap Year");
				} else {
					System.out.println("Its not a Leap Year");
				}
			} else {
				System.out.println("Its a Leap Year");
			}

		} else {
			System.out.println("Its not a Leap Year");
		}
	}

	public static void main(String[] args) {

		int Year = 2012;
		isLeapYear(Year);
	}
}
