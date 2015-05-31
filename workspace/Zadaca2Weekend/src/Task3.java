/*
 * The user enters a value of n on the console. On the console to print the last two digits 
 * (not including zero) in the sum of n !.
 */
import java.util.Scanner;
public class Task3 {

	public static void main(String[] args) {
		System.out.println("Input n: ");
		Scanner in = new Scanner(System.in);
		long n = in.nextInt();
		int num = 1;
		int factorial = 1;
		String rev = "";
		String rev1 = "";
		while (num < n) {
			num ++;
			factorial = factorial * num;
		}
		String fac = "";
		fac += factorial;
		int stl = fac.length();
		int counter = 0;
		for (int i=stl - 1; i >= 0; i --) {
			char c = fac.charAt(i);
			if (c == '0'){
				counter++;
			}else {
				break;
			}
		}
		for (int j = stl - (counter + 1); j > stl - (counter+3); j--) {
			char c1 = fac.charAt(j);
			rev +=c1;	
		}
		int revl = rev.length();
		for (int k = revl - 1; k >= 0; k--) {
			char c2 = rev.charAt(k);
			rev1 += c2;
		}
		fac = rev1;
		System.out.println(fac);
		in.close();
	}

}
