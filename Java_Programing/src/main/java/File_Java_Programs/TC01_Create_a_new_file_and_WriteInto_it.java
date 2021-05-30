package File_Java_Programs;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

public class TC01_Create_a_new_file_and_WriteInto_it {

	public static void CreatefileInputStream() {
		try

		{
			Scanner sc = new Scanner(System.in); // object of Scanner class
			System.out.print("Enter the file name: ");
			String name = sc.nextLine(); // variable name to store the file name
			FileOutputStream fos = new FileOutputStream(name, true); // true for append mode
			System.out.print("Enter file content: ");
			String str = sc.nextLine() + "\n"; // str stores the string which we have entered
			byte[] b = str.getBytes(); // converts string into bytes
			fos.write(b); // writes bytes into file
			fos.close(); // close the file
			System.out.println("file saved.");
			sc.close();
		} catch (Exception e) {
		}

	}

	public static void main(String args[]) throws IOException {
		boolean result;
		File file = new File("C:\\Users\\dsharman\\Sample.txt");
		try {
			result = file.createNewFile(); // creates a new file
			if (result) // test if successfully created a new file
			{
				System.out.println("file created " + file.getCanonicalPath()); // returns the path string
			} else {
				System.out.println("File already exist at location: " + file.getCanonicalPath());

				file.delete();
			}
		} catch (IOException e) {
			e.printStackTrace(); // prints exception if any
		}

		CreatefileInputStream();
	}

}