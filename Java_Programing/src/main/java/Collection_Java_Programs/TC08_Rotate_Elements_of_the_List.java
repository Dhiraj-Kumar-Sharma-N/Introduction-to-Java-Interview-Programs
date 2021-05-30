package Collection_Java_Programs;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class TC08_Rotate_Elements_of_the_List {

	public static void RotateElement() {
		// creating array list
		List<Integer> my_list = new ArrayList<>(Arrays.asList(10, 20, 30, 40, 50, 60, 70));

		// Printing list before rotation
		System.out.println("List Before Rotation : " + Arrays.toString(my_list.toArray()));

		// Rotating the list at distance 4

		Collections.rotate(my_list, 4);

		// Printing list after rotation
		System.out.println("List After Rotation :  " + Arrays.toString(my_list.toArray()));
	}

	public static void main(String[] args) {

		int n = 4;

		List<Integer> L = new ArrayList<Integer>(Arrays.asList(10, 20, 30, 40, 50, 60, 70));
		List<Integer> numarr = new ArrayList<Integer>();
		System.out.println("Size of the List is = " + L.size());

		System.out.println("List before Rotation : " + L);

		for (int i = 0; i < L.size() - (n - 1); i++) {

			int num = L.get(i);
			numarr.add(num);

		}

		L.removeAll(numarr);
		L.addAll(numarr);

		System.out.println(numarr);
		System.out.println("List After Rotation : " + L);

	}

}
