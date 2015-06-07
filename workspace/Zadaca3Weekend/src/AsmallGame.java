import java.util.Arrays;
//import java.util.InputMismatchException;
import java.util.Scanner;

/*
 * A SMALL GAME
 * Napisati metodu koja vraca niz od 5 int elemenata koji imaju random vrijednosti od 1 do 4.
 * Napisati metodu koja odredjuje da li dati niz od 5 elemenata ima sve nule.
 * Napisati metodu koja prima jedan int niz od 5 elemenata i jedan broj, koji oznacava indeks niza. Koristiti 
 * exception handling da se sanira slucaj kada dati indeks ide preko 4 ili ispod 0. Ukoliko izabrani indeks niza 
 * odgovara broju koji je paran onda povecati za toliko elemente sa njegove lijeve i desne strane (ako postoje).
 * Ukoliko izabrani indeks niza odgovara broju koji je neparan onda smanjiti za toliko elemente sa njegove lijeve 
 * i desne strane (ako postoje). U oba slucaja smanjiti izabrani element za jedan. Ukoliko je vrijednost izabranog
 * elementa nula onda nista ne uraditi. Jako je bitno napomenuti da nikada vrijednost elementa ne smije preci preko 
 * 4 i ne smije ici ispod 0. Ukoliko se desi da pređe preko 4 onda staviti vrijednost da je 4, a ako ode ispod 0 onda 
 * fiksirati na 0.
 * Koristeći metode iznad napraviti malu igru sa sljedecim pravilima. Cilj igre je smanjiti sve elemente niza od
 * pet clanova na nula. Koristite prvu metodu da vam generise niz koji ce se koristiti za igru. Korisnik ce
 * unositi vrijednosti (preko Scanner-a) sve dok cijeli niz ne bude sadržavao sve nule.
 * Primjer jednog generisanog niza:
 * Kada bi korisnik izabrao indeks 1:
 * Kada bi onda izabrao indeks 3:
 * Kada bi onda izabrao indeks 0:
 * Da bi završio igru, igrac mora sve elemente svesti na nula. Tada je potrebno da se ispiše koliko je vremena
 * korisniku trebalo da zavrsi (koristiti currentTimeMillis metodu.
 */
public class AsmallGame {
	/**
	 * 
	 * @param n
	 * @return
	 */
	public static int[] randomArray() {
		int[] arr = new int[5];

		for (int i = 0; i < 5; i++) {
			arr[i] = (int) (Math.random() * 4 + 1);
		}
		return arr;
	}
/**
 * 
 * @param array
 * @return
 */
	public static boolean isNull(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == 0) {
				return true;
			} else {
				return false;
			}
		}
		return false;
	}
/**
 * 
 * @param Array
 * @param num
 * @return
 */
// nije moje!!!
//	public static int[] confusingMethods(int Array[], int num) {
//
//		int element = Array[num];
//
//		// Case 1. Entered number is 0 and element is even
//		if (num == 0 && element % 2 == 0) {
//			Array[num] = Array[num] - 1;
//			if (Array[num] < 0) {
//				Array[num] = 0;
//			}
//			Array[num + 1] = Array[num + 1] + element;
//			if (Array[num + 1] > 4) {
//				Array[num + 1] = 4;
//				return Array;
//			} else
//				return Array;
//
//		}
//		// Case 2. Entered number is 0 and and element is odd
//		else if (num == 0 && element % 2 != 0) {
//			Array[num] = Array[num] - 1;
//			if (Array[num] < 0) {
//				Array[num] = 0;
//			}
//			Array[num + 1] = Array[num + 1] - element;
//			if (Array[num + 1] < 0) {
//				Array[num + 1] = 0;
//				return Array;
//			} else
//				return Array;
//		}
//		// Case 3. Entered number is 4 and element is even
//		else if (num == 4 && element % 2 == 0) {
//			Array[num] = Array[num] - 1;
//			if (Array[num] < 0) {
//				Array[num] = 0;
//			}
//			Array[num - 1] = Array[num - 1] + element;
//			if (Array[num - 1] > 4) {
//				Array[num - 1] = 4;
//				return Array;
//			} else
//				return Array;
//		}
//		// Case4. Entered number is 4 and element is odd
//		else if (num == 4 && element % 2 != 0) {
//			Array[num] = Array[num] - 1;
//			if (Array[num] < 0) {
//				Array[num] = 0;
//			}
//			Array[num - 1] = Array[num - 1] - element;
//			if (Array[num - 1] < 0) {
//				Array[num - 1] = 0;
//				return Array;
//			} else
//				return Array;
//		}
//		// Case5. The element is zero
//		else if (element == 0) {
//			for (int i = 0; i < Array.length; i++) {
//				Array[i] = Array[i];
//			}
//			return Array;
//		}
//		// Case6. Entered number is odd
//		else if (num != 0 && num != 4 && element % 2 != 0) {
//			Array[num] = Array[num] - 1;
//			Array[num - 1] = Array[num - 1] - element;
//			Array[num + 1] = Array[num + 1] - element;
//			if (Array[num - 1] < 0) {
//				Array[num - 1] = 0;
//			}
//			if (Array[num + 1] < 0) {
//				Array[num + 1] = 0;
//			}
//			return Array;
//		}
//		// Case7. Entered number is even
//		else if (num != 0 && num != 4 && element % 2 == 0) {
//			Array[num] = Array[num] - 1;
//			Array[num + 1] = Array[num + 1] + element;
//			Array[num - 1] = Array[num - 1] + element;
//			if (Array[num - 1] > 4) {
//				Array[num - 1] = 4;
//			}
//			if (Array[num + 1] > 4) {
//				Array[num + 1] = 4;
//			}
//			return Array;
//		}
//		return Array;
//
//	}
/**
 * main
 * @param args
 */
	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		System.out.println("Random generated array:");
		System.out.println(Arrays.toString(randomArray()));
		
		System.out.println("Is array full of zeros: ");
		System.out.println(isNull(randomArray()));

//		// A SMALL GAME
//		System.out.println("      ~ TIME IS FOR GAME ~ ");
//		System.out.println(" ~ YOU NEED GET ALL ZERO IN A ARRAY ~");

//		// Declaration of assistant variables
//		int Array[] = randomArray();
//		boolean finish = false;
//		double currentTimeMillis;
//		int counter = 0;
//		long start = (System.currentTimeMillis() / 1000);

//		// Start of exception handling
//		do {
//			try {
//				// Start of game
//				do {
//
//					// Input of the number
//					System.out.println();
//					System.out.println("Please enter the number:");
//					int num = input.nextInt();
//
//					// Printing the array used to the game
//					System.out.println(Arrays.toString(Array));
//
//					// Start a game code using methods
//					int Array1[] = confusingMethods(Array, num);
//					System.out.println(Arrays.toString(Array1));
//					Array = Array1;
//					finish = isNull(Array1);
//					counter++;
//				} while (finish != true);
//
//				// Catch possible exception in game
//			} catch (ArrayIndexOutOfBoundsException e) {
//				// e.printStackTrace();
//				System.out.println("Sorry you can entered only number between 0 and 4 !!!");
//				System.out.println("Enter 1 to continue");
//				input.nextInt();
//			} catch (InputMismatchException d) {
//				// d.printStackTrace();
//				System.out.println("Sorry you can onlny entered the numbers(0-4) !!!");
//				input.nextLine();
//			}
//
//		} while (finish == false);
//
//		// End of game,calculating gaming time and attempts
//		long end = (System.currentTimeMillis() / 1000);
//		long time = end - start;
//		System.out.print("Congratulations you've completed the game for " + time + " second with " + counter + " attempts.");
		
		input.close();
	}

}
