package Collection_Java_Programs;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class TC04_Reverse_a_Collection {

	public static void main(String[] args) {

		List<Integer> L = new ArrayList<Integer>(Arrays.asList(3, 5, 18, 4, 6));

		System.out.println("Size of the List is = " + L.size());

		System.out.println("Before Shuffling Elements of Collection: " + L);

		Collections.reverse(L);

		System.out.println("After Shuffling Elements of Collection: " + L);

	}

}
