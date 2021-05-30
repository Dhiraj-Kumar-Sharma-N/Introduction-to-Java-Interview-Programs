package List_Java_Programs;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class TC08_Convert_a_List_of_String_to_Comma_Separated_String {

	public static void main(String[] args) {

		List<String> list = new ArrayList<String>();

		list.add("Geeks");
		list.add("For");
		list.add("ForGeeks");
		list.add("GeeksForGeeks");
		list.add("A computer portal");

		Collections.sort(list);
		String str = String.join(",", list);

		System.out.println(str);

	}

}
