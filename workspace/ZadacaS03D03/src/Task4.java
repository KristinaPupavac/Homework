import java.util.Arrays;
import java.util.Scanner;

/*
 * Napisati program gdje korisnik unosi cijeli broj N. Pored toga vi imate fiksiran jedan niz od deset
 * elemanata tipa char. Shiftati taj niz u desno, ukoliko je N > 0, ili u lijevo, ukoliko je N < 0, za N
 * puta. Naravno, ukoliko je N = 0 onda nije potrebno ništa uraditi.
 */
public class Task4 {

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		System.out.print("Input n: ");
		int N = in.nextInt();
		char[] arr = { 'I', 'N', 'G', 'B', 'I', 'T', 'C', 'A', 'M', 'P' };

		if (N > 0) {
			char last = arr[arr.length - 1];
			for (int i = arr.length - 1; i < 0; i--) {
				arr[i] = arr[i - 1];
			}
			arr[0] = last;
			N--;

		} else if (N < 0) {
			char last = arr[0];
			for (int i = 0; i < arr.length - 1; i++) {
				arr[i] = arr[i + 1];
			}
			arr[arr.length - 1] = last;
			N++;
		}
		System.out.println(Arrays.toString(arr));
		in.close();
	}

}
