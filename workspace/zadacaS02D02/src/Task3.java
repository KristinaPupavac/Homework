import java.util.Scanner;

public class Task3 {
/*
 * The sum of input number digits.
 */
	public static void main(String[] args) {
		
        Scanner input = new Scanner(System.in);
		
		System.out.print("Input number: ");
		int num = input.nextInt();
		int digit = 0;
		int sum = 0;
		
		for (int i = num; i > 0; i /= 10) {
			digit = i % 10;
			sum += digit;
		}
		
		System.out.println("Sum of its digits is " + sum + ".");
		
		input.close();
	}

}
