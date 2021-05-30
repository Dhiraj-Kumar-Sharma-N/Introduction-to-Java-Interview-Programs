package Pattern_Java_Programs;

public class TC01_Print_Square_Star_Pattern {

	public static void Square(int n) {
		int a, b;

		// outer loop to handle number of rows k in this case
		for (a = 0; a < n; a++) {

			// inner loop to handle number of columns values changing acc. to outer loop
			for (b = 0; b <= n; b++) {
				// printing stars
				System.out.print("* ");
			}

			// end-line
			System.out.println();
		}
	}

	public static void main(String[] args) {

		Square(5);

	}

}



/* ===================== OUTPUT ================================

* * * * * * 
* * * * * * 
* * * * * * 
* * * * * * 
* * * * * * 

*/