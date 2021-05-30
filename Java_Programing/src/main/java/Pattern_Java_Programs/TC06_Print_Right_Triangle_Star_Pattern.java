package Pattern_Java_Programs;

public class TC06_Print_Right_Triangle_Star_Pattern {

	public static void main(String[] args) {

		int num = 5;

		for (int i = 1; i <= num; i++) {

			for (int k = 1; k <= i; k++) {                    // Right  Triangle

				System.out.print("  ");
			}

			for (int j = num; j >= i; j--) {                   // Left Triangle

				System.out.print("* ");
			}

			System.out.println();
		}

	}

}


/* ===================== OUTPUT ================================

  * * * * * 
    * * * * 
      * * * 
        * * 
          * 


*/