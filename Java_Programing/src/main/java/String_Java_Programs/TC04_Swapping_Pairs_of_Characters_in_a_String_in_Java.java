package String_Java_Programs;

public class TC04_Swapping_Pairs_of_Characters_in_a_String_in_Java {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String input = "GameOfThrones";
		
		int lenght = input.length();
		char[] ch = input.toCharArray();
		char temp ;
		
		if (lenght%2 != 0) {
			
			for (int i = 0; i < ch.length - 1; i+=2) {
				
				// Swapping the characters
	            	temp = ch[i];
	            ch[i] = ch[i + 1];
	            ch[i + 1] = temp;
				
			}
			System.out.println(ch);
		
		}
	}

}
