package HackerRank_Java_Programs;

public class HR06_HackerRankTest_REPEATEDSTRING {

	public static void main(String[] args) {

		String s = "aba";
		String finalstring = null;
		char searchchar = 'a';
		long n = 10;
		long occurence = 0;

		long num = n / s.length();

		for (int i = 0; i < num; i++) {
			finalstring = finalstring + s;
		}

		String str = finalstring.substring(4);

		long reminder = n - str.length();

		for (int i = 0; i < reminder; i++) {
			char c = str.charAt(i);

			str = str + c;
		}

		char[] carr = str.toCharArray();

		for (int i = 0; i < carr.length; i++) {

			if (carr[i] == searchchar) {
				occurence++;
			}
		}

		System.out.println("Occurence of character" + searchchar + "is = " + occurence);
	}

}
