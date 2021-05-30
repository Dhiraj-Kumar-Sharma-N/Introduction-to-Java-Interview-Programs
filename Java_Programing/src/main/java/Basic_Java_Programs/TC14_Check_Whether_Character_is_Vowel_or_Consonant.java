package Basic_Java_Programs;

import java.util.Arrays;
import java.util.List;

public class TC14_Check_Whether_Character_is_Vowel_or_Consonant {

	public static void main(String[] args) {
		
		List<Character> vowelslist = Arrays.asList('a', 'i', 'o', 'u', 'e');

		char c = 'i';

		if (vowelslist.contains(c)) {
			System.out.println("Character " + c + " is a Vowel");
		} else {
			System.out.println("Character " + c + " is a Consonant");
		}
	}

}
