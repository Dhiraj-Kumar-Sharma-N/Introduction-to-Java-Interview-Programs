package String_Java_Programs;

public class TC03_Reverse_a_String {

	public static void main(String[] args) {

		// METHOD 1 : Using String Builder Class

		String str = "Game_of_Thrones";

		StringBuilder s = new StringBuilder();
		s.append(str);
		System.out.println(s.reverse());

		// METHOD 2 : Using toCharArray() on string

		String strA = "Temple";

		char[] carr = strA.toCharArray();
		String s1 = "";

		for (int i = carr.length - 1; i >= 0; i--) {

			s1 = s1 + carr[i];
		}

		System.out.println(s1);

		// METHOD 3 : GENERAL
		String str2 = "Austin town";

		String s2 = "";

		for (int i = str2.length() - 1; i >= 0; i--) {

			s2 = s2 + str2.charAt(i);
		}
		System.out.println(s2.replace(" ", ""));

	}

}
