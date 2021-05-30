package File_Java_Programs;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class TC05_Copy_Content_From_One_File_to_Another_File {

	public static void main(String[] args) throws IOException {
		
		File file = new File("C:\\Users\\dsharman\\FILEA.txt");
		File file1 = new File("C:\\Users\\dsharman\\FILEC.txt");
		FileInputStream fis = new  FileInputStream(file);
		FileOutputStream fos = new FileOutputStream(file1);
		file1.createNewFile();
		int ch;
		 while ((ch = fis.read()) != -1) {
             // write() function to write
             // the byte of data
             fos.write(ch);
         }

			fis.close();
			fos.close();

	}

}
