package Collection_Java_Programs;

import java.util.ArrayList;
import java.util.List;

public class TC11_Convert_String_to_a_List_of_Characters {

	public static void main(String[] args) {

		String str = "Dhiraj";
		List<Object> l = new ArrayList<Object>();
		char[] carr = str.toCharArray();

		System.out.println(carr);

		for (int i = 0; i < carr.length; i++) {

			l.add(carr[i]);
		}
		System.out.println(l);
	}

}
