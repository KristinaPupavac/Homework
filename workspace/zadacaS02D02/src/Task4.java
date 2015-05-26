import java.util.Scanner;

public class Task4 {
/*
 * The sum of all divisors of n
 */

	public static void main(String[] args) {
		
			Scanner in = new Scanner(System.in);
			int num = -1;
			int sum = 0;
			while(num != 0){
				sum = 0;
			System.out.println("Imput number: ");
			num = in.nextInt();
			for(int i = 1; i <= num; i++){
				if(num % i ==0)
					sum += i;
			}
			if(sum != 0)
			System.out.println("Sum of all divisors number "+ num +" is "+ sum);
			}
			
			System.out.println("End");
			
			in.close();
	}

}
