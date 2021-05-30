package Collection_Java_Programs;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class TC01_Compare_Integer_Elements_in_a_Collection {

	public static void main(String[] args) {
	
			List<Integer> L = new ArrayList<Integer>(Arrays.asList(3, 5, 18, 4, 6));
			
			System.out.println("Size of the List is = " + L.size());
			
			Collections.sort(L);
			
			
			int min = Collections.min(L);
			int max = Collections.max(L);
			
			System.out.println(L);
			
			System.out.println("Min value of our list : "+ min);
			
			System.out.println("Max value of our list : "+ max);

	}

}
