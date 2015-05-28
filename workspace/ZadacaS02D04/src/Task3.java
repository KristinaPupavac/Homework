/*
 * Text file contains n + 1 numbers. The first number is n. It indicates how the 
 * numbers appear after him. Print to console the smallest number that appeared 
 * in the file (not including n)
 */
public class Task3 {

	public static void main(String[] args) {
		//Reading input.txt file
		TextIO.readFile("src/text3.txt");
		//Variabe initialization
		int minimum = 0;
		int n = 0;
		int input = 0;
		
		n = TextIO.getInt();
		input = TextIO.getInt();
		minimum = input;
		
		for (int i = 1; i < n; i++ ) {
			input = TextIO.getInt();
			if(input < minimum) {
				minimum = input;
		    }
		}
		System.out.println("Minimum is: " + minimum);
	}

}

