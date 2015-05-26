import java.util.Scanner;
/*
 * Write a program that for two numbers find the greatest common divisor.
 */
public class Task10 {

	public static void main(String[] args) {
		 Scanner in = new Scanner(System.in);
		 System.out.println("Input two numbers: ");
	     int num1 = in.nextInt();
	     int num2 = in.nextInt();
	     int GCD = 0;
	     int num = 0;
	     if(num1 < num2)
	    	 num = num1;
	     else
	    	 num = num2;
	     for(int i=1;i<=num;i++){
	    	 if(num1 % i == 0 && num2 % i == 0)
	    		 GCD = i;
	     }
	     System.out.println("Greatest common divisor: " + GCD);
	     in.close();

	}

}
