package Basic_Java_Programs;

public class TC06_Add_Two_Complex_numbers {

	// variables to hold real and imaginary part of complex number
    int real, image;
  
    // Constructor which will be used while creating complex number
    public TC06_Add_Two_Complex_numbers(int r, int i)
    {
        this.real = r;
        this.image = i;
    }
  
    // function to print real number
    public void showC()
    {
        System.out.print(this.real + " +i" + this.image);
    }
  
    // function for addition
    public static TC06_Add_Two_Complex_numbers add(TC06_Add_Two_Complex_numbers n1,
                                    TC06_Add_Two_Complex_numbers n2)
    {
  
        // creating blank complex number to store result
        TC06_Add_Two_Complex_numbers res = new TC06_Add_Two_Complex_numbers(0, 0);
  
        // adding real parts of both complex numbers
        res.real = n1.real + n2.real;
  
        // adding imaginary parts
        res.image = n1.image + n2.image;
  
        // returning result
        return res;
    }
  
    public static void main(String arg[])
    {
  
        // creating two complex numbers
        TC06_Add_Two_Complex_numbers c1 = new TC06_Add_Two_Complex_numbers(4, 5);
        TC06_Add_Two_Complex_numbers c2 = new TC06_Add_Two_Complex_numbers(10, 5);
  
        // printing complex numbers
          System.out.print("first Complex number: ");
        c1.showC();
          
        System.out.print("\nSecond Complex number: ");
        c2.showC();
  
        // calling add() to perform addition
        TC06_Add_Two_Complex_numbers res = add(c1, c2);
  
        // displaying addition
        System.out.println("\nAddition is :");
        res.showC();
    }
}


