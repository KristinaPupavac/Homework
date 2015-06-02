/*
 * Task 1
 * Napisati program koji koristi switch komandu i radi sljedece: Preko Scanner-a unijeti jedan cijeli broj koji 
 * oznacava dan (1 – Ponedjeljak, 2 – Utorak, ..., 7 – Nedjelja). Na ekran ispisati da li je taj uneseni dan
 * radni dan ili je vikend dan.
 * Primjer 1: Ulaz je 4. Na konzoli se pojavi “Work day”.
 * Primjer 2: Ulaz je 6. Na konzoli se pojavi “Weekend”.
 */
import java.util.Scanner;
public class Task1 {

	public static void main(String[] args) {
		
		System.out.println("Input day number: ");
		
		Scanner input = new Scanner (System.in);
		int day = input.nextInt();
		
		switch (day) {
		case 1:
			System.out.println("Moday!");
			System.out.println("Work day.");
			break;
		case 2:
			System.out.println("Tuesday!");
			System.out.println("Work day.");
			break;
		case 3:
			System.out.println("Wednesday!");
			System.out.println("Work day.");
			break;
		case 4:
			System.out.println("Thursday!");
			System.out.println("Work day.");
			break;
		case 5:
			System.out.println("Friday!");
			System.out.println("Work day.");
			break;
		case 6: 
			System.out.println("Saturday!");
			System.out.println("Weekend.");
			break;
		case 7:
			System.out.println("Sunday!");
			System.out.println("Weekend.");
			break;
		}
	}

}
