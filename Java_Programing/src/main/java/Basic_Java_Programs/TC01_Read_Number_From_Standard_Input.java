package Basic_Java_Programs;

import java.io.IOException;
import java.util.Scanner;

public class TC01_Read_Number_From_Standard_Input {

	public static void main(String[] args) throws IOException {
		// Declare the variables
		int num;
		double num1;
		Float num2;

		// Input the integer
		System.out.println("Enter the integer: ");

		// Create Scanner object
		Scanner scnObj = new Scanner(System.in);

		// Read the next integer from the screen
		num = scnObj.nextInt();

		System.out.println("Entered integer is: " + num);

		System.out.println("Enter the Double: ");

		num1 = scnObj.nextDouble();

		System.out.println("Entered Double  is: " + num1);

		System.out.println("Enter the Float: ");

		num2 = scnObj.nextFloat();

		System.out.println("Entered Float  is: " + num2);

		scnObj.close();
	}

}

/*
 * =================================== OUTPUT ================================

 * Enter the integer: 1
 * Entered integer is: 1 
 * Enter the Double: 123.33 Entered
 * Double is: 123.33 
 * Enter the Float: 101.123456789123 
 * Entered Float is:101.12346

 */