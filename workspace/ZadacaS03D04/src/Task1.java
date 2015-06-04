/*
 * Napisati metodu koja vraca najmanji broj od data dva cijela broja. Pored toga, napisati drugu metodu koja 
 * vraca najmanji broj od data tri cijela broja, ali je napisati koristeci prvu metodu.
 * Metoda 1: int getMin2(int a, int b)
 * Metoda 2: int getMin3(int a, int b, int c)
 * PRIMJERI
 * getMin2(2, 5) = 2
 * getMin2(5, 5) = 5
 * getMin3(2, 3, 1) = 1
 * getMin3(0, -5, 10) = -5
 */
public class Task1 {
	public static int getMin1(int a, int b) {
		int min1 = Math.min(a, b);
		return min1;
	}

	public static int getMin2(int a, int b, int c) {
		int min2 = Math.min(getMin1(a, b), c);
		return min2;
	}

	public static void main(String[] args) {
		System.out.println(getMin1(2, 3));
		System.out.println(getMin2(1, 5, 3));

	}

}
