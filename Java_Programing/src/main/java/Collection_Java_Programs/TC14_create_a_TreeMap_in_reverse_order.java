package Collection_Java_Programs;

import java.util.Collections;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;

public class TC14_create_a_TreeMap_in_reverse_order {

		public static void main(String args[])
		{
			// Map to store the elements
			Map<String, String> treemap =
				new TreeMap<String, String>(Collections.reverseOrder());

			// Put elements to the map
			treemap.put("1", "Welcome");
			treemap.put("2", "to");
			treemap.put("3", "the");
			treemap.put("4", "Geeks");
			treemap.put("5", "Community");

			Set<Entry<String, String>> set = treemap.entrySet();
			Iterator<Entry<String, String>> i = set.iterator();

			// Traverse map and print elements
			while (i.hasNext()) {
				@SuppressWarnings("rawtypes")
				Map.Entry me = (Map.Entry)i.next();
				System.out.print(me.getKey() + ": ");
				System.out.println(me.getValue());
			}
		}
	}
