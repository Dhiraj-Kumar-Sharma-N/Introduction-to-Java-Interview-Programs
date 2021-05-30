package Basic_Java_Programs;

public class TC19_Caluculate_simple_interest {

	public static void main(String[] args) {
		  // We can change values here for
        // different inputs
        float P = 5, R = 6, T = 2;
  
        /* Calculate simple interest */
        float SI = (P * T * R) / 100;
        System.out.println("Simple interest = " + SI);
	}

}
