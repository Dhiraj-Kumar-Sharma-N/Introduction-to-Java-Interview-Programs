package List_Java_Programs;

import java.util.ArrayList;
import java.util.Arrays;


public class TC02_Get_Minimum_and_Maximum_From_a_List {

	public static void main(String[] args) {
		
		ArrayList<Integer> arr = new ArrayList<Integer>(Arrays.asList(10, 400, 3, 2, 1, -1));
		
		int max = arr.get(0) ;
		int min = arr.get(0) ;
		
		for (int i = 1; i < arr.size(); i++) {
			
			if (arr.get(i) > max) {
				
				max = arr.get(i);
			}else {
				
				min=arr.get(i);
			}
		}
		System.out.println("Max number is " + max);
		System.out.println("Min number is " + min);
	
	}

}
