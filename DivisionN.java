
public class DivisionN {
/* Your program contains a number n. Write code that determines how many times n 
 *  can divide before it becomes zero and print the result on the console.
 */
	public static void main(String[] args) {
		
		int number = 10;  
		int counter = 0; 
		int n = number; 
		
		while ( n / 2 > 0) { 
			counter++;
			n = n / 2;
		}
		
		System.out.println("Number " + number + " can " + counter + " times divide before it becames zero.");
		
	}

}
