package vjezbes02d01;
//Program koji sadrzi pozitivni cijeli broj n. Ispisati na konzolu n!.

public class Factorial {

	public static void main(String[] args) {
		int n = 5;
		int num = 1;
		int factorial = 1;
		while (num < n){
			num ++; 
			factorial = factorial * num;
		}
		System.out.println(factorial);

	}

}
