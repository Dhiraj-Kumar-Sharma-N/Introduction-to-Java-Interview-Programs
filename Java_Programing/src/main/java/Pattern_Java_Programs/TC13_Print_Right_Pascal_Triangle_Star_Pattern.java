package Pattern_Java_Programs;

public class TC13_Print_Right_Pascal_Triangle_Star_Pattern {

	public static void RightPascal(int n) {
		int a, b;

		// outer loop to handle number of rows k in this case
		for (a = 0; a < n; a++) {

			// inner loop to handle number of columns values changing acc. to outer loop
			for (b = 1; b <= a; b++) {
				// printing stars
				System.out.print("* ");
			}

			// end-line
			System.out.println();
		}
		int num = n;

		for (int row = 0; row < num; row++) {

			for (int column = num; column > row; column--) {

				System.out.print("* ");
			}
			System.out.println();
		}
	}

	public static void main(String[] args) {

		RightPascal(8);

	}

}

/*
 * ===================== OUTPUT ================================
 
* 
* * 
* * * 
* * * * 
* * * * * 
* * * * 
* * * 
* * 
* 

 */