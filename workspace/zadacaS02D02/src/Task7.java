import java.util.Scanner;
public class Task7 {
/* Write a program that receives a number n, and prints all the numbers that are
 * smaller than magic number. The number is magical if the sum of its divisors is
 *  equal to the number
 */

	public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
		
		System.out.print("Input number: ");
		int num = input.nextInt();
		int sum = 0;
		
		for (int j = 1; j < num; j++) {
			sum = 0;
			for (int i = 1; i < j; i++) {
				if(j % i == 0){
					sum += i;
				}
			}
			if(sum == j){
				System.out.println("Number " + j + " is magic!");
			} else {
				System.out.println("Number is not magic!");
			}
		}
		input.close();
	}

}
