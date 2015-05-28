
public class EvenNumbersSum {
/* Your program contains a number n. Write code that that finds the sum of all 
 * the even numbers from 1 to n, excluding number n.
 */
	public static void main(String[] args) {
		
		int number = 14;
		int counter = 0;
		int sum = 0;
		int n = number;
		
		while (counter < n) {
			counter = counter +2;
			if (counter < n) {
				sum += counter;
			}
		}
			if (number % 2 == 0) {
				System.out.println("Sum of all even numbers from 0 to " + number + " is " + sum + " without number  " + number + ".");
			} else {
				System.out.println("Sum of all even numbers from 0 to "	+ number + " is " + sum + ".");
					}
				
		}
		

	}

