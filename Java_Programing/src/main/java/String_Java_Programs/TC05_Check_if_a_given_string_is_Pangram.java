package String_Java_Programs;

import java.util.Arrays;

public class TC05_Check_if_a_given_string_is_Pangram {

	public static void main(String[] args) {

		String All = "abcdefghijklmnopqrstuvwxyz";
		char[] Allchar = All.toCharArray();
		char[] carr = null;
		String input = "test";

		if (input.isEmpty()) {
			System.out.println("No values entered");
		} else {
			carr = input.toCharArray();

		}
		boolean Flag = Arrays.equals(Allchar, carr);
		if (Flag == true) {
			System.out.println("Given string is a Pangram");
		} else {
			System.out.println("Given string is NOT a Pangram");
		}
	}

}
