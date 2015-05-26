import java.util.Scanner;

public class Task6 {
/*
 * Write a program that accepts two parameters, the first parameter represents a
 *  number of other parameter number.
 */
	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		System.out.println("Input number: ");
		int num1 = in.nextInt();
		System.out.println("Imput wich digit do you want to the right side of your number: ");
		int num2 = in.nextInt();
		int digit = 0;
		int counter = 1;
		while(counter < num2){
			num1 /= 10;
			counter++;
		}
		digit = num1 % 10;
		System.out.println("Digit is:  "+ digit);
		in.close();

	}

}
