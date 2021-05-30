package List_Java_Programs;

import java.util.ArrayList;
import java.util.Collections;

public class TC07_Get_First_and_Last_Elements_from_an_Array_List {

	public static void main(String[] args) {

		ArrayList<String> list = new ArrayList<String>();

		list.add("Geeks");
		list.add("For");
		list.add("ForGeeks");
		list.add("GeeksForGeeks");
		list.add("A computer portal");

		Collections.sort(list);
		System.out.println(list);
		System.out.println("First Element is = " + list.get(0));

		System.out.println("Last Element is = " + list.get(list.size() - 1));
	}

}
