package Advanced_Java_Programs;

import java.util.ArrayList;
import java.util.List;

public class TC02_Get_Nth_Term_of_Geometric_Progression {

	public static int nthTermOfGP(int a, int r, int n) {

		List<Integer> l = new ArrayList<Integer>();
		l.add(a);

		for (int i = 1; i <= n; i++) {
			int num = a * (int) Math.pow(r, i);
			l.add(num);

		}

		System.out.println(l);
		return l.get(n - 1);
	}

	public static void main(String[] args) {

		System.out.println(nthTermOfGP(5, 9, 10));
		System.out.println(nthTermOfGP(2, 2, 4));
	}

}
