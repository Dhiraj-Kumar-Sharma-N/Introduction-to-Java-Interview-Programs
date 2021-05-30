package Collection_Java_Programs;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class TC13_find_the_Entry_with_largest_Key_in_a_Java_Map {

	public static void main(String[] args) {

		Map<Object, Object> m = new HashMap<Object, Object>();
		m.put(1, 40);
		m.put(2, 30);
		m.put(3, 60);
		m.put(5, 30);
		m.put(4, 80);
		m.put(3, 70);

		System.out.println("Entered Map is " + m);

		Set<Object> so = m.keySet();

		System.out.println("All the keys are " + so);

		List<Object> l = new ArrayList<Object>(so);
		System.out.println(l.size());

		Object maxnum = l.get(l.size() - 1);

		System.out.println("Maximum in the key set is " + maxnum);

		Set<Entry<Object, Object>> so1 = m.entrySet();

		Iterator<Entry<Object, Object>> itr = so1.iterator();

		while (itr.hasNext())

		{
			Entry<Object, Object> e = (Entry<Object, Object>) itr.next();

			System.out.println(e.getValue());
		}

		System.out.println("Maximim key is " + maxnum + " and its value is " + m.get(maxnum));

	}

}