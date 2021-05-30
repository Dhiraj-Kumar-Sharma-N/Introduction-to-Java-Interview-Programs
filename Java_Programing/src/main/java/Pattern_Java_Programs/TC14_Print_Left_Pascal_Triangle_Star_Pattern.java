package Pattern_Java_Programs;

public class TC14_Print_Left_Pascal_Triangle_Star_Pattern {

	public static void main(String[] args) {

		int num = 5;
		int row, column;
		for (row = 0; row <= num; row++) {

			for (column = num; column > row; column--) {

				System.out.print("  ");
			}

			for (column = 0; column <= row; column++) {

				System.out.print("* ");
			}
			System.out.println();

		}
		for (row = 0; row < num; row++) {

			for (column = 0; column <= row; column++) {

				System.out.print("  ");
			}

			for (column = num; column > row; column--) {

				System.out.print("* ");
			}

			System.out.println();
		}

	}

}

/*
 * ===================== OUTPUT ================================
 
 		  * 
        * * 
      * * * 
    * * * * 
  * * * * * 
* * * * * * 
  * * * * * 
    * * * * 
      * * * 
        * * 
          * 

 */