package Pattern_Java_Programs;

public class TC07_Print_Reverse_Triangle_or_Pyramid_with_N_Star_Pattern {

	public static void main(String[] args) {

		int n = 5;

		for (int i = 1; i <= n; i++) {

			for (int j = 1; j <= i; j++) {

				System.out.print(" ");
			}
			for (int j = n; j >= i; j--) {

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
