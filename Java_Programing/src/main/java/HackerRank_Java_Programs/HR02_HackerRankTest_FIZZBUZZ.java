package HackerRank_Java_Programs;

public class HR02_HackerRankTest_FIZZBUZZ {

	/*
	 * Write a program that prints the numbers from 1 to n and for multiples of ‘3’
	 * print “Fizz” instead of the number and for the multiples of ‘5’ print “Buzz”.
	 * if number divisible by both 3 and 5 print FizzBuzz or else print number
	 */
	public static void fizzBuzz(int n) {

		for (int j = 1; j <= n; j++) {

			if (j % 3 == 0 || j % 5 == 0) {

				if (j % 3 == 0 && j % 5 != 0)
					System.out.println("Fizz");
				else if (j % 3 != 0 && j % 5 == 0)
					System.out.println("Buzz");
				else
					System.out.println("FizzBuzz");
			} else
				System.out.println(j);
		}
	}

	public static void main(String[] args) {

		fizzBuzz(15);

	}

}
