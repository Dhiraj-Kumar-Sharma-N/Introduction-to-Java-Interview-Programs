package Collection_Java_Programs;

//Java program to convert
//Set of Strings to Array of Strings

import java.util.Arrays;
import java.util.Set;
import java.util.HashSet;

class TC12_Convert_Set_of_String_to_Array_of_String {

	// Function to convert Set<String> to String[]
	public static String[] convert(Set<String> setOfString) {

		// Create String[] of size of setOfString
		String[] arrayOfString = new String[setOfString.size()];

		// Copy elements from set to string array
		// using advanced for loop
		int index = 0;
		for (String str : setOfString)
			arrayOfString[index++] = str;

		// return the formed String[]
		return arrayOfString;
	}

	public static void main(String[] args) {

		// Get the Set of String
		Set<String> setOfString = new HashSet<>(Arrays.asList("Geeks", "ForGeeks", "A Computer Portal"));

		// Print the setOfString
		System.out.println("Set of String: " + setOfString);

		// Convert Set to String array
		String[] arrayOfString = convert(setOfString);

		// Print the arrayOfString
		System.out.println("Array of String: " + Arrays.toString(arrayOfString));
	}

}
