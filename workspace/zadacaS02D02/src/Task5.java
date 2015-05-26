import java.util.Scanner;
/*
 * Write a program that loads the number of users and then print that number but
 *  not zero appearing in the number
 */
public class Task5 {

	public static void main(String[] args) {
     Scanner input = new Scanner(System.in);
		
		
		System.out.println("-- NUMBER WITHOUT ZEROS --");
		System.out.print("Input number: ");
		int num = input.nextInt();
		int digit = 0;
		int newNum = 0;
		
	
		for (int i = 0; i < num; i = i * 10) {
			digit = num % 10;
			if(digit != 0){
				newNum = newNum * 10 + digit; 
			}
			num /= 10;
		}
		
		digit = 0;
		num = newNum;
		newNum = 0;
		
		for (int i = num; i > 0; i = i / 10) {
			digit = i % 10;
			newNum = newNum * 10 + digit;
		}
		
		
		System.out.println("Number without zeros: " + newNum);
		
		input.close();

	}

}
