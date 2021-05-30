package List_Java_Programs;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class TC03_Split_a_list_into_Two_Halves {

	public static void main(String[] args) {

		ArrayList<Integer> all = new ArrayList<Integer>(Arrays.asList(1, 2, 3, 4, 5, 6));
		int size = all.size();

		List<Integer> first = all.subList(0, (size / 2));
		List<Integer> Second = all.subList((size / 2), size);
		System.out.println("first = " + first);
		System.out.println("Second = " + Second);
	}

}
