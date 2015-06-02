import java.util.Scanner;

/*
 * Napisati program koji ce ucitati file i ispisati na ekran faktorijel broja koji se nalazi u file-u. Bitno je
 * naglasiti da korisnik preko Scanner-a unosi ime file-a, a i da file moze sadrzavati razne stvari.
 * Obratiti paznju na sljedece stvari:
 * Korisnik unosi ime file-a sto znaci da je realna opcija da pogrijesi ime. Koristite exception handling da 
 * sanirate taj moguci problem, tj. da na konzoli ispisete da taj file ne postoji.
 * File moze sadrzavati bilo sto. Vama je zadatak da izracunate faktorijel od prvog broja samo. Ukoliko file 
 * sadrzi vise stvari onda to ignorisati. Ukoliko broj nije na pocetku onda, pomocu exception handlinga, ispisati
 * na konzolu da nije broj prvi.
 */
public class Task2 {

	public static void main(String[] args) {

		try {
			Scanner input = new Scanner(System.in);
			System.out.print("Input file name: "); //Input: src/text.txt
			String file = input.next();
	
			TextIO.readFile(file);
			
			String str = TextIO.getln();
			int number = Integer.parseInt(str);
			long factorial = 1;
			
			for (int i = 1; i <= number; i++) {
				factorial *= i;
			}
			System.out.println("Factorial: " + number + " is: " + factorial);
			
			input.close();
		
		} catch (NumberFormatException e) {
			System.out.println("There is no number in first line of file!");
		} catch (IllegalArgumentException e) { 
			System.out.println("There is no file by that name!");
		}
	}

}
