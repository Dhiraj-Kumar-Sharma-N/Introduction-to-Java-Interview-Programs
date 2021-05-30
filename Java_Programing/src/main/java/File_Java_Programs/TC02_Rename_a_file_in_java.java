package File_Java_Programs;

import java.io.File;
import java.io.IOException;

public class TC02_Rename_a_file_in_java {

	public static void main(String[] args) {
		boolean result;
		File file = new File("C:\\Users\\dsharman\\Sample.txt");
		File file1 = new File("C:\\Users\\dsharman\\Demo2.txt");
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

		file.renameTo(file1);
	}

}
