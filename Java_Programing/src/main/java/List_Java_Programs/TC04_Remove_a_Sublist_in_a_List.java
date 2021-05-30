package List_Java_Programs;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class TC04_Remove_a_Sublist_in_a_List {

	public static void main(String[] args) {

		ArrayList<Integer> arr = new ArrayList<Integer>(Arrays.asList(1, 4, 9, 25, 36));

		List<Integer> arr1 = arr.subList(2, 4);

		arr.removeAll(arr1);
		
		System.out.println("Aftering removing sublist from list = "+arr);
	}

}
