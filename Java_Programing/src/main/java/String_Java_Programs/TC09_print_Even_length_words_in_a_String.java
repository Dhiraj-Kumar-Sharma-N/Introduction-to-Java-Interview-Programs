package String_Java_Programs;

public class TC09_print_Even_length_words_in_a_String {

	public static void main(String[] args) {
	
		String Input = "This is a java programming language";
		String[] str = Input.split(" ");
		
		for (String string : str) {
			if (string.length() % 2 == 0) {
				System.out.println(string);
			}else {
				
			}
		}
		
	}

}
