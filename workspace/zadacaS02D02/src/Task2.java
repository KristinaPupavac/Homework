import java.util.Scanner;

public class Task2 {
/* Fibonacci sequence is a series in which each element is equal to the sum of
 *  the previous two elements. 
 */
	public static void main(String[] args) {
		
		//Input n and initialization of variables
		Scanner in = new Scanner(System.in);
		System.out.println("Input n: ");
		int n = in.nextInt();
		
		int fibonaciFirst = 0;
		int counter = 1;
		int sum = 1; 
		int fibonaciSecond = 1;
	
		//Checking out input
		if (n > 1 && n <= 50) {
			while(counter < n){
			sum = fibonaciFirst + fibonaciSecond;
			fibonaciFirst = fibonaciSecond;
			fibonaciSecond = sum;
			counter++;
			}
		System.out.println(n + ". element of the Fibonacci row is: " + sum);
		} else {
			System.out.println("Out of range!");
		}
		in.close();
	
	}

}
