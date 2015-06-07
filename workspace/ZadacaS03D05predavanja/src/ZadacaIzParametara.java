/*
 * Potrebno je da napravite klasu koja ce se zvati ZadaacaIzParametara.
 * Unutar klase trebate imati main funkciju u kojoj cete provjeriti da vam zadaca radi ispravno.
 * Sto se tice zadace, trebatnapraviti 4 static funkcije koje ce se sve zvati pomnozi.
 * 1. funkcija ce primati parametar tipa int, a kao povratni parametar ce takodje imati int i vracati ce 
 * kvadrat broja koji predan kao parametar.
 * 2. funkcija ce primati parametar tipa double, a kao povratni parametar ce takodje imati double i vracati ce 
 * kvadrat broja koji predan kao parametar.
 * 3. funkcija ce primati 2 parametra, oba ce biti tipa int. Povratni tip ce biti int, a funkcija ce vracati 
 * proizvod dva ulazna parametra.
 * 4. funkcija ce primati 2 parametra, oba ce biti tipa double. Povratni tip ce biti double, a funkcija ce vracati
 *  proizvod dva ulazna parametra.
 */
public class ZadacaIzParametara {
/**
 * Returns square of two integer number
 * @param number
 * @return
 */
	public static int squareInt (int number) {
		return number *number;
	}
/**
 * Returns square of two double number
 * @param number
 * @return
 */
	public static double squareDouble (double number) {
		return number * number;
	}
/**
 * Returns product of two integer number
 * @param number1
 * @param number2
 * @return
 */
	public static int productInt (int number1, int number2) {
		return number1 * number2;
	}
/**
 * Returns product of two double number
 * @param number1
 * @param number2
 * @return
 */
	public static double productDouble (double number1, double number2) {
		return number1 * number2;
	}
/**
 * main
 * @param args
 */
	public static void main(String[] args) {

        System.out.println("f(10) = " + squareInt(10));

        System.out.println("f(10.0) = " + squareDouble(10.0));

        System.out.println("f(10, 15) = " + productInt(10, 15));

        System.out.println("f(10.0, 15) = " + productDouble(10.0, 15));

		

	}

}
