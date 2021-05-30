package Collection_Java_Programs;

import java.util.ArrayList;
import java.util.List;
import java.util.Vector;

public class TC10_Convert_a_Vector_to_List {

	public static void main(String[] args) {

		Vector<Object> v = new Vector<Object>();
		v.add("1");
		v.add("2");
		v.add("3");
		v.add("4");
		v.add("5");

		System.out.println("Vector: " + v);

		// List l = Collections.list(v.elements());

		List<Object> l = new ArrayList<Object>(v);

		System.out.println("List: " + l);

	}

}
