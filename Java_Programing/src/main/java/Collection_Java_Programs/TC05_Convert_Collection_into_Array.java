package Collection_Java_Programs;

import java.util.ArrayList;
import java.util.List;

public class TC05_Convert_Collection_into_Array {

	public static void main(String[] args) {

		List<String> L = new ArrayList<String>();
		L.add("Dhiraj ");
		L.add("Kumar ");
		L.add("Sharma ");
		L.add("N ");
		L.add("Arun ");

		System.out.println("Size of the List is = " + L.size());
		System.out.println("List is = " + L);
		// Converting list to an array
		String[] str = L.toArray(new String[0]);

		// Iterating over elements of array
		for (int i = 0; i < str.length; i++) {
			String data = str[i];

			// Printing elements of an array
			System.out.print(data);
		}
	}
}
