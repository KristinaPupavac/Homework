/*
 * Last number -1 in the file marks the end. Print on
 * Console sum contained in the file, not including -1
 */
public class Task2 {

	public static void main(String[] args) {
		//Reading nm.txt file
	    TextIO.readFile("src/numbers.txt");
	    
	    int sum = 0;
	    int n = -1;

	   System.out.print("Numbers from n to m are :");
	   do {
		 //Geting value from numbers.txt file
		     n = TextIO.getInt();
	    	 if (n != -1) {
	    		 TextIO.put(" " + n + " ");
	    		 sum = sum + n;
	    	 }
	    } while (n != -1);
	   //Printing
	    System.out.println();
	    System.out.println("Sum of numbers is: " + sum);
	}

}
