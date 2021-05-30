package Advanced_Java_Programs;

import java.util.ArrayList;
import java.util.List;

public class TC01_Get_Nth_Term_of_Arthematic_Progression {

	public static int nthTermOfAP(int A1, int A2, int N) {

		int dif = A2 - A1;
		List<Integer> l = new ArrayList<Integer>();
		l.add(A1);
		l.add(A2);
		for (int i = 0; i <= N; i++) {
			int num = A2 + dif;
			l.add(num);
			A2 = num;

		}

		return l.get(N - 1);
	}

	public static int nthTermOfAPOpt(int A1, int A2, int N) {
		// calculating common difference
		int difference = A2 - A1;
		// calculating nth term
		int nthTerm = A1 + (N - 1) * difference;
		return nthTerm;
	}

	public static void main(String[] args) {

		System.out.println(nthTermOfAP(2, 4, 10));
		System.out.println(nthTermOfAPOpt(3, 5, 4));
	}

}
