import java.util.Scanner;

/*
 * Napisati program u kojem korisnik unosi i dužinu niza i elemente niza tipa int. Pored toga, korisnik
 * unosi i jedan broj Q. Ispisati da li broj Q postoji u nizu. Zabranjeno koristiti Arrays klasu.
 */
public class Task6 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		System.out.println("Input array lenght: ");
		int length = in.nextInt();
		int arr[] = new int[length];
		boolean isQ = true;
		
		System.out.println("Input array elements: ");
		for (int i = 0; i < length; i++) {
			arr[i] = in.nextInt();
		}
		System.out.println("Input Q: ");
		int Q = in.nextInt();

		for (int i = 0; i < length; i++) {
			if (arr[i] == Q) {
				isQ = true;
			}
		}
		System.out.println("Is number Q = " + Q + " is in array: " + isQ);
		in.close();
	}
}
