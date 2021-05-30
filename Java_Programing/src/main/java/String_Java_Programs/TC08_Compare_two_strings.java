package String_Java_Programs;

public class TC08_Compare_two_strings {

	public static void main(String[] args) {

		String string1 = new String("GameOfThrones");
		String string2 = new String("Practice");
		String string3 = new String("Game");
		String string4 = new String("Game");
		String string5 = new String("game");

		// Comparing for String 1 != String 2
		System.out.println("Comparing " + string1 + " and " + string2 + " : " + string1.equals(string2));

		// Comparing for String 3 = String 4
		System.out.println("Comparing " + string3 + " and " + string4 + " : " + string3.equals(string4));

		// Comparing for String 4 != String 5
		System.out.println("Comparing " + string4 + " and " + string5 + " : " + string4.equals(string5));

		// Comparing for String 4 != String 5
		System.out.println("Comparing with ignoring case " + string4 + " and " + string5 + " : " + string4.equalsIgnoreCase(string5));

		// Comparing for String 1 != String 4
		System.out.println("Comparing " + string1 + " and " + string4 + " : " + string1.equals(string4));
	}
}
