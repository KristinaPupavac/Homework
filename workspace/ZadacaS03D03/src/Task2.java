import java.util.Scanner;

/*
 * Napisati program u kojem korisnik unosi vrijednosti u dva niza velicine pet i tipa int. Ispisati na
 * ekran da li su data dva niza identicna, tj. imaju iste elemente na istim indeksima. Zabranjeno
 * koristiti Arrays klasu.
 */
public class Task2 {

	public static void main(String[] args) {

		int arr1[] = new int[5];
		int arr2[] = new int[5];
		int counter = 0;
		Scanner in = new Scanner(System.in);

		System.out.println("Enter first array elements: ");
		for (int i = 0; i < arr1.length; i++) {
			arr1[i] = in.nextInt();
		}
		System.out.println("Enter second array elements: ");
		for (int i = 0; i < arr2.length; i++) {
			arr2[i] = in.nextInt();
		}
		for (int i = 0; i < arr1.length; i++) {
			if (arr1[i] == arr2[i]) {
				counter++;
			} else {
				System.out.println("Arrays are not equal.");
				break;
			}
		}
		if (counter == 5) {
			System.out.println("Arrays are equal.");
		}

		in.close();
	}

}
