package String_Java_Programs;

public class TC02_Replace_a_Character_at_a_Specific_Index {

	public static void main(String[] args) {

		String str = "Game_of_Thrones";

		int index = 5;

		char ch = 'X';
		String str1 = str = str.substring(0, index) + ch + str.substring(index + 1);

		System.out.println("String after Replacement is " + str1);

	}

}
