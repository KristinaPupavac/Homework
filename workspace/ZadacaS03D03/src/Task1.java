import java.util.Arrays;

/*
 * Napisati program koji popuni niz od 100 elemenata pocevsi od 0, uvecavajuci za 1, a kada dodje do
 * 9 ponovo se vratiti na 0, tj. 0, 1, 2, 3, ..., 9, 0, 1, ..., 8, 9, 0, ... . Isprintati taj niz na konzolu
 */
public class Task1 {

	public static void main(String[] args) {
		int arr[] = new int[100];
		int counter = 0;
		for (int i = 0; i < arr.length; i++) {
			arr[i] = counter;
			counter++;
			if (counter > 9) {
				counter = 0;
			}
			System.out.println(Arrays.toString(arr));
		}
	}

}
