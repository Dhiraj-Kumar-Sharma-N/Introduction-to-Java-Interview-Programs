package List_Java_Programs;

import java.util.ArrayList;
import java.util.Arrays;

public class TC10_Find_Common_Elements_in_Two_ArrayList {

	public static void main(String[] args) {

		ArrayList<String> arr = new ArrayList<String>(Arrays.asList("Hii", "Geeks", "for", "Geeks"));
		ArrayList<String> arr1 = new ArrayList<String>(Arrays.asList("Hii", "Geeks", "Gaurav"));

		for (int i = 0; i < arr.size(); i++) {

			if (arr1.contains(arr.get(i))) {

			} else {
				arr.remove(i);
			}
		}

		System.out.println("Common elements are " + arr);
	}

}
