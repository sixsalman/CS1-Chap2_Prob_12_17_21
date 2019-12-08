import java.util.*; // all java utilities imported

/**
	Author: Salman
	
	This program takes the amount of principal originally deposited,
	the annual interest rate, number of times per year the interest is compounded and
	specified number of years and calculates and amount in account after the specified number of
	years.
*/
public class ProbTwentyOne{

	/**
	 Main handles the driver code for the program. Inputs are taken,
	 processed and outputted in this method.
	 */
	public static void main (String[] args){
		
		Scanner kbd = new Scanner(System.in); // new scanner created
		
		System.out.print("Enter the amount of principal originally deposited into the account: ");
		double P = kbd.nextDouble(); // principal amount obtained from user and stored in a double variable called 'P'
		
		System.out.print("Enter annual interest rate: ");
		double r = kbd.nextDouble(); // annual interest rate obtained from user and stored in a double variable called 'r'
		
		System.out.print("Enter the number of times per year that the interest is compounded: ");
		int n = kbd.nextInt(); // number of times per year that the interest in compounded obtained from user and stored in an integer variable called 'n'
		
		System.out.print("Enter the number of years the account will be left to earn interest: ");
		int t = kbd.nextInt(); // specified number of years obtained from user and stored in an integer variable called 't'
		
		double A = P*Math.pow(1.0+r/n, n*t); // amount of money after specified number of years in calculated
		
		System.out.printf("The amount of money in the account after %d year(s) will be $%.2f", t, A); // amount of money after specified number of years is displayed
		
		kbd.close(); // scanner closed
		
	}
	
}