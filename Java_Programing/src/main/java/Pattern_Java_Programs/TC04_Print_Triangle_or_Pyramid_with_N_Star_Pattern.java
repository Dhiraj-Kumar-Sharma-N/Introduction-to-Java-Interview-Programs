package Pattern_Java_Programs;

public class TC04_Print_Triangle_or_Pyramid_with_N_Star_Pattern {

	public static void main(String[] args) {

		int num = 5;

		for (int row = 1; row <= num; row++) {

			for (int column = num; column >= row; column--) {

				System.out.print(" ");
			}

			for (int i = 1; i <= row; i++) {
				System.out.print(" *");
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

 */