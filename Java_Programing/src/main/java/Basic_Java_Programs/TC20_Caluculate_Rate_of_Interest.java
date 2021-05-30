package Basic_Java_Programs;

public class TC20_Caluculate_Rate_of_Interest {

	public static void main(String[] args) {


        double principle = 10000, rate = 10.25, time = 5;
        
        /* Calculate compound interest */
        double CI = principle *
                    (Math.pow((1 + rate / 100), time));
          
        System.out.println("Compound Interest is "+ CI);
	}

}
