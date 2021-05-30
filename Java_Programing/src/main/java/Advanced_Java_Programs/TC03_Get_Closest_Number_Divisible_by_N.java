package Advanced_Java_Programs;

public class TC03_Get_Closest_Number_Divisible_by_N {

	public static void main(String[] args) {

		int N = -15;
		int M = 6;
		int Q = N / M;
		int n2, Result;
		int n1 = M * Q;

		if (M * N > 0) {
			n2 = M * (Q + 1);
		} else {
			n2 = M * (Q - 1);
		}

		if (Math.abs(N - n1) < Math.abs(N - n2)) {
			Result = n1;
		} else {
			Result = n2;
		}
		System.out.println("Closest number dividing" + N + " When devided by " + M + "is = " + Result);

	}
}
