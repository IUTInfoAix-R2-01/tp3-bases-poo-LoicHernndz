package part3.ex1;
import java.util.Scanner;

public class MyComplexApp {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		double real, imag;
		
		System.out.print("Enter complex number 1 (real and imaginary part): ");
		
		real = in.nextDouble();
		imag = in.nextDouble();
		MyComplex Z1 = new MyComplex(real, imag);

		System.out.print("Enter complex number 2 (real and imaginary part): ");
		MyComplex Z2 = new MyComplex(in.nextDouble(), in.nextDouble());
	
		System.out.println("\nNumber 1 is: " + Z1);
		System.out.println(Z1 + " is" + ((Z1.isReal()) ? " " : " NOT ") 
						   	  + "a pure real number");
		System.out.println(Z1 + " is" + ((Z1.isImaginary()) ? " " : " NOT ") 
			   	  			  + "an pure imaginary number");
		
		System.out.println("\nNumber 2 is: " + Z2);
		System.out.println(Z2 + " is" + ((Z2.isReal()) ? " " : " NOT ") 
			   	  			  + "a pure real number");
		System.out.println(Z2 + " is" + ((Z2.isImaginary()) ? " " : " NOT ") 
 	  			  			  + "an pure imaginary number");

		System.out.println("\n" + Z1 + " is" + ((Z1.equals(Z2)) ? " " : " NOT ") 
		  			  		+ "equal to " + Z2);
		System.out.println("("+Z1+") + ("+Z2+") = "+ Z1.addNew(Z2));
	}
}
