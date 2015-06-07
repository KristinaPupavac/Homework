import java.util.Scanner;

/*
 * SWITCH
 * Unijeti jedan cijeli broj N preko Scanner-a. 
 * Broj N predstavlja koliko je sati. Odrediti da li je tada predavanje, vjezbe, zadace ili spavanje.
 * Predavanja su od 9 h do 13 h. Vježbe su od 14h do 17h. Zadace su od 18h do 1h. Spavanje je od 2h do 8h.
 * Obavezno koristiti switch i fall through!
 */
public class Switch {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter hour: ");
		int n = input.nextInt();
		int hour = 0;

		if (n >= 9 && n <= 13) {
			 hour = 0;
		} else if (n >= 14 && n <= 17) {
			 hour = 1;
		} else if (n >= 18 && n <= 1) {
			 hour = 2;
		} else if (n >= 2 && n <= 8) {
			 hour = 3;
		}

		switch (hour) {
		case 0:
			System.out.println("It's lecture time!");
			break;
		case 1:
			System.out.println("It's exercise time! ");
			break;
		case 2:
			System.out.println("It's homework time!");
			break;
		case 3:
			System.out.println("It's sleeping time!");
		}
//		switch (n) {
//		case 9:
//			System.out.println("It's lecture time!");
//		case 10:
//			System.out.println("It's lecture time!");
//		case 11:
//			System.out.println("It's lecture time!");
//		case 12:
//			System.out.println("It's lecture time!");
//		case 13:
//			System.out.println("It's lecture time!");
//			break;
//		case 14:
//			System.out.println("It's exercise time! ");
//		case 15:
//			System.out.println("It's exercise time! ");
//		case 16:
//			System.out.println("It's exercise time! ");
//		case 17:
//			System.out.println("It's exercise time! ");
//			break;
//		case 18:
//			System.out.println("It's homework time!");
//		case 19:
//			System.out.println("It's homework time!");
//		case 20:
//			System.out.println("It's homework time!");
//		case 21:
//			System.out.println("It's homework time!");
//		case 22:
//			System.out.println("It's homework time!");
//		case 23:
//			System.out.println("It's homework time!");
//		case 24:
//			System.out.println("It's homework time!");
//		case 1:
//			System.out.println("It's homework time!");
//			break;
//		case 2:
//			System.out.println("It's sleeping time!");
//		case 3:
//			System.out.println("It's sleeping time!");
//		case 4:
//			System.out.println("It's sleeping time!");
//		case 5:
//			System.out.println("It's sleeping time!");
//		case 6:
//			System.out.println("It's sleeping time!");
//		case 7:
//			System.out.println("It's sleeping time!");
//		case 8:
//			System.out.println("It's sleeping time!");
//			break;
//		}

		input.close();
	}

}
