package List_Java_Programs;

import java.util.ArrayList;
import java.util.Arrays;

public class TC05_Remove_Duplicates_from_an_Array_List {

	public static void main(String[] args) {

		ArrayList<Integer> arr = new ArrayList<Integer>(Arrays.asList(25, 1, 4, 36, 9, 25, 36));
		ArrayList<Integer> newlist = new ArrayList<Integer>();

		for (int i = 0; i < arr.size(); i++) {

			if (newlist.contains(arr.get(i)) != true) {

				newlist.add(arr.get(i));
			}
		}

		System.out.println("Before removing Duplicates from list = " + arr);
		System.out.println("Aftering removing Duplicates from list = " + newlist);
	}

}
