package File_Java_Programs;

import java.io.File;
import java.io.IOException;

public class TC04_Comparing_Path_of_Two_Files {

	public static void main(String[] args) {
		boolean result;
		File file = new File("C:\\Users\\dsharman\\Sample.txt");
		File file1 = new File("C:\\Users\\dsharman\\Sample.txt");
		try {
			result = file.createNewFile(); // creates a new file
			if (result) // test if successfully created a new file
			{
				System.out.println("file created " + file.getCanonicalPath()); // returns the path string
			} else {
				System.out.println("File already exist at location: " + file.getCanonicalPath());

			}
		} catch (IOException e) {
			e.printStackTrace(); // prints exception if any
		}

		if (file.compareTo(file1) == 0) {

			System.out.println("Path matches");
		} else {
			System.out.println("Path does not matches");
		}
	}

}
