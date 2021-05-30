package Collection_Java_Programs;

//Convert an Array into Collection in Java

//import java util library
import java.util.*;

//class for writing logic of the problem
public class TC06_Convert_an_Array_into_Collection {
	public static void main(String args[]) {
		// array input
		String playersArray[] = { "Virat", "Sachin", "Rohit", "Bumrah" };

		// printing input elements for comparision
		System.out.println("Array input: " + Arrays.toString(playersArray));

		// converting array into Collection
		// with asList() function
		List<String> playersList = Arrays.asList(playersArray);

		// print converted elements
		System.out.println("Converted elements: " + playersList);
	}
}
