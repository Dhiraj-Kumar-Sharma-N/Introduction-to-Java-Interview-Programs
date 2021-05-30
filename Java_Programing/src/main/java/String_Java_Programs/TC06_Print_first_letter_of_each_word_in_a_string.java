	package String_Java_Programs;
	
	public class TC06_Print_first_letter_of_each_word_in_a_string {
	
		public static void main(String[] args) {
	
			String input = "Game Of Thrones";
	
			String[] str = input.split(" ");
			String s = "";
			for (String string : str) {
	
				s = s + string.charAt(0);
			}
	
			System.out.println(s);
		}
	
	}
