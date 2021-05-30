package Pattern_Java_Programs;

public class TC10_Print_Daimond_with_Star_Pattern {

	public static void main(String[] args) {

		int n = 5;

		for (int i = 1; i < n; i++) {

			for (int j = n; j >= i; j--) {

				System.out.print("  ");
			}
			for (int j = 1; j < i; j++) {

				System.out.print("x ");
			}

			for (int j = 1; j <= i; j++) {

				System.out.print("x ");
			}
			System.out.println();
		}

		for (int i = 1; i <= n; i++) {

			for (int j = 1; j <= i; j++) {

				System.out.print("  ");
			}
			for (int j = n; j > i; j--) {

				System.out.print("x ");
			}

			for (int j = n; j >= i; j--) {

				System.out.print("x ");
			}

			System.out.println();
		}
	}

}



/* ===================== OUTPUT ================================
 * 


          x 
        x x x 
      x x x x x 
    x x x x x x x 
  x x x x x x x x x 
    x x x x x x x 
      x x x x x 
        x x x 
          x 

*/


