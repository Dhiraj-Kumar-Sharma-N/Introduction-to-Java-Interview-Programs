package Basic_Java_Programs;

public class TC10_Display_All_Prime_Numbers_from_1_to_N {

	

	
	public static void main(String[] args) {
		
		int n = 20;
		int temp = 0;
		
		for (int i = 1; i <= n; i++) {
			
			for (int j = 2; j < i-1; j++) {
				
				if (i%j == 0) {
					
					temp= temp+1;
				}
			}
			
			if (temp == 0) {
				
				System.out.println(i);
			}
			else {
				temp = 0;
			}
			
		}

	}

}
