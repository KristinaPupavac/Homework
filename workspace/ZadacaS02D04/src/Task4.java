/*
 * Text file input.txt in the first row contains the numbers n and m. Number n indicates 
 * how many numbers appear after n and m, while m  indicates the required number.
 * Print the console whether the required number m exist in these n numbers.
 */
public class Task4 {

	public static void main(String[] args) {
		//Reading input.txt file
		TextIO.readFile("src/input.txt");
		int n = 0;
		int m = 0;
		boolean number = true;
		
	    //Geting value from input.txt file
		 n = TextIO.getInt();
		 System.out.println("Number of n: " + n);
		
	     m = TextIO.getInt();
	     System.out.println("Wanted number: " + m);
	     
	     for (int i = 0; i < n; i++) {
	    	 n = TextIO.getInt();
	    	
	    	 if (n == m) {
	    		 number = true;
	    	 } else if (number == true) {
	    		 System.out.println("Wanted number exist.");
	    	 } else {
	    		 System.out.println("Wanted number not exist.");
	    	 }
	     }
	}
}

