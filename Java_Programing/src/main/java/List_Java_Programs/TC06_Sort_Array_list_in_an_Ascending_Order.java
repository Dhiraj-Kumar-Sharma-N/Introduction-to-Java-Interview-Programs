package List_Java_Programs;

import java.util.ArrayList;
import java.util.Collections;

public class TC06_Sort_Array_list_in_an_Ascending_Order {

	public static void main(String[] args) {

		ArrayList<String> list = new ArrayList<String>();


		list.add("Geeks");
        list.add("For");
        list.add("ForGeeks");
        list.add("GeeksForGeeks");
        list.add("A computer portal");
        System.out.println("list before sorting = " + list);
        
		 Collections.sort(list);
		
		System.out.println("list after sorting = " + list);
	}

}
