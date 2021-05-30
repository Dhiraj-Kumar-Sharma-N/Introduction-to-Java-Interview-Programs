package List_Java_Programs;

import java.util.LinkedList;
import java.util.List;

public class TC09_Add_Element_at_First_and_Last_Position_of_a_Linked_list {

	public static void main(String[] args) {

		List<String> list = new LinkedList<String>();
		list.add("Game");
		list.add("of");
		list.add("Thrones");
		System.out.println(list);

		list.add(0, "HBO PRESENTS");

		list.add(list.size(), "Season 8");
		
		System.out.println("List After inserting element in first and last position " + list);
	}

}
