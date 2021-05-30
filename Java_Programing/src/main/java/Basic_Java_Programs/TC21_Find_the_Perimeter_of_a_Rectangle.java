package Basic_Java_Programs;

public class TC21_Find_the_Perimeter_of_a_Rectangle {

	static void perimeter(int length, int breadth) {
		// Calculate the 'perimeter' using the formula
		int perimeter = 2 * (length + breadth);

		System.out.println("The perimeter of the given rectangle of length " + length + " and breadth " + breadth
				+ " = " + perimeter);
	}

	public static void main(String[] args) {
		
		// Initialize a variale length that stores length of the given rectangle
		int length = 10;

		// Initialize a variale breadth that stores breadth of the given rectangle
		int breadth = 20;

		// Call the perimeter method on these length and breadth
		perimeter(length, breadth);
	}

}
