package Pattern_Java_Programs;

public class TC08_Print_Pyramid_with_Star_Pattern {

	public static void main(String[] args) {

		int n = 5;

		for (int i = 1; i <= n; i++) {

			for (int j = n; j >= i; j--) {

				System.out.print("  ");
			}
			for (int k = 1; k < i; k++) {

				System.out.print("* ");
			}

			for (int l = 1; l <= i; l++) {

				System.out.print("* ");
			}

			System.out.println();
		}

	}

}


/* ===================== OUTPUT ================================
 * 
          * 
        * * * 
      * * * * * 
    * * * * * * * 
  * * * * * * * * * 

*/
