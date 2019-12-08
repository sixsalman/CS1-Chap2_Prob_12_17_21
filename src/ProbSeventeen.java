import java.util.*; // all java utilities imported

/**
	Author: Salman
	
	This program takes the number of cockies the user wants to make and 
	outputs the amount of sugar butter and flour needed to make them.
*/
public class ProbSeventeen{

	/**
	 Main handles the driver code for the program. Inputs are taken,
	 processed and outputted in this method.
	 */
	public static void main (String[] args){
		
		Scanner kbd = new Scanner(System.in); // new scanner created
		System.out.println("How many cookies do you want to make?");
		int num = kbd.nextInt(); // desired number of cockies obtained and stored in float variable 'num'
		System.out.printf("You will need %.2f cup(s) of sugar, %.2f"
		+ " cup(s) of butter and %.2f cup(s) of flour.", 1.5*num/48,
		num/48.0, 2.75*num/48); // calculations for each of the ingredients made and displayed
		kbd.close(); // scanner closed
		
	}
	
}