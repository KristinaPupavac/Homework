import java.util.Scanner;

/*
 * Napisati slican program prijasnjem, ali ovaj put da se dva niza smatraju identicnim ukoliko imaju
 * iste elemente, koji ne moraju biti na istim indeksima. Zabranjeno koristiti Arrays klasu.
 */
public class Task3 {

	public static void main(String[] args) {
		int arr1[] = new int[5];
		int arr2[] = new int[5];
		int counter = 0;
		Scanner in = new Scanner(System.in);

		System.out.println("Enter first arrays elements: ");
		for (int i = 0; i < arr1.length; i++) {
			arr1[i] = in.nextInt();
		}
		System.out.println("Enter second arrays elements: ");
		for (int i = 0; i < arr2.length; i++) {
			arr2[i] = in.nextInt();
		}
		for (int i = 0; i < arr1.length; i++) {
			for (int j = 0; i < arr2.length; j++) {
				if (arr1[i] == arr2[j]) {
					counter++;
				} 
				if(counter != i){
					break;
				}
			}
		}
		if (counter == 5) {
			System.out.println("Arrays are equal.");
		}
		in.close();
	}

}
