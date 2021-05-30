package Collection_Java_Programs;

import java.util.*;

public class TC07_Replace_Elements_in_a_List {
	public static void main(String args[]) {

		List<String> playersList = new ArrayList<String>(Arrays.asList("Virat", "Sachin", "Rohit", "Bumrah"));

		System.out.println("List Before replacement " + playersList);

		for (int i = 0; i < playersList.size(); i++) {

			if (playersList.get(i).toString().equalsIgnoreCase("Sachin")) {

				playersList.set(i, "Tendulkar");

			}
		}

		System.out.println("List after replacement " + playersList);
	}
}
