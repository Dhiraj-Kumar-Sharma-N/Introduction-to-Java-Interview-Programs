package Basic_Java_Programs;

public class TC12_Check_Armstrong_Number_btn_Two_Integers {

	public static void main(String[] args) {
		int start = 100, end = 2700;

		for (int k = start; k <= end; k++) {
			int value = k;

			int lenght = 0;

			int num = value;
			int mul = 0;
			int arm = 0, rem;

			while (value != 0) {

				value = value / 10;
				lenght = lenght + 1;
			}

			// System.out.println("Lenght of Number is "+lenght);

			while (num != 0) {

				rem = num % 10;
				mul = 1;
				for (int i = 1; i <= lenght; i++) {

					mul = mul * rem;

				}
				num = num / 10;
				arm = arm + mul;

			}

			if (k == arm) {
				System.out.println("Armstrong number  is " + arm);
			}

		}

	}

}
