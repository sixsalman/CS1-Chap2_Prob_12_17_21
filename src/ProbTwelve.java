import java.util.*; // all java utilities imported

/**
	Author: Salman
	
	This program takes the name of user's favourite city and outputs it
	in uppercase, lowercase, its length and the first letter in it.
*/
public class ProbTwelve{

	/**
	 Main handles the driver code for the program. Inputs are taken,
	 processed and outputted in this method.
	 */
	public static void main (String[] args){
		
		Scanner kbd = new Scanner(System.in); // new scanner created
		System.out.print("Enter name of your favorite city: ");
		String name = kbd.nextLine(); // name obtained from user and stored in a string variable called 'name'
		System.out.println(name.length()); // no. of characters in the name displayed
		System.out.println(name.toUpperCase()); // name displayed in uppercase
		System.out.println(name.toLowerCase()); // name displayed in lowercase
		System.out.println(name.charAt(0)); // first character of name displayed
		kbd.close(); // scanner closed
		
	}
	
}