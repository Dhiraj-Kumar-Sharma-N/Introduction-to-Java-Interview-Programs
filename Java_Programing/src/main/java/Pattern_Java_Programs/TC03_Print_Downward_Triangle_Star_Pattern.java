package Pattern_Java_Programs;

public class TC03_Print_Downward_Triangle_Star_Pattern {

	public static void main(String[] args) {
		int num = 5;
		
		for (int row = 0; row < num; row++) {
			
			for (int column = num; column > row ; column--) {
				
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