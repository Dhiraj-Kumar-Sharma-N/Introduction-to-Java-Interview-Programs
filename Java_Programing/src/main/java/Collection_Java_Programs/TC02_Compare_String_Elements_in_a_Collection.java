package Collection_Java_Programs;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class TC02_Compare_String_Elements_in_a_Collection {

	public static void main(String[] args) {
	
			List<Character> L = new ArrayList<Character>(Arrays.asList('a','z','b','l','A','Z'));
			
			System.out.println("Size of the List is = " + L.size());
			
			Collections.sort(L);
			
			
			System.out.println(L);
			
			System.out.println("Min value of our list : "+ L.get(0));
			
			System.out.println("Max value of our list : "+ L.get(L.size()-1));

	}

}
