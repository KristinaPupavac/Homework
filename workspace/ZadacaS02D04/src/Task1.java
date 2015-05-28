/*
 * Reload the two numbers (n and m) from text file and print to the console all
 *  the numbers that are between n and m. 
 */
public class Task1 {

	public static void main(String[] args) {
		//Reading nm.txt file
		TextIO.readFile("src/nm.txt");
		//Geting value from nm.txt file
		int n = TextIO.getInt();
		int m = TextIO.getInt();
		//Printing
		System.out.print("Numbers between " + n + " and " + m + " are: ");
	    //Counting numbers between n and m 
		for (int i = n + 1; i < m; i++) {
			//Printing
			System.out.print(i + " ");
		}
	}

}
