
public class PerfectNumber {
/* Your program contains a number n. Write a program that determines is a given 
 * number n perfect or not.
 */
	public static void main(String[] args) {
		int number = 6;
		int sum = 0;
		int counter = 1;

		while (counter < number) {
			
			if (number % counter == 0) {
				sum += counter;
			}
			counter++;
		}
		
		if (sum == number) {
			System.out.println(number + " is a perfect number!");
		} else {
			System.out.println( number + " is not a perfect number!");
		}


	}

}
