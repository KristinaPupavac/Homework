/*
 * Napisati metodu koja za dati String ispisuje koliko taj String u sebi ima brojeva. Napisati javadoc za istu tu 
 * metodu i napisati program tako da radi preko args parametara.
 * Metoda: int getCountOfNumbers(String s)
 * PRIMJERI
 * java –jar Task3.jar p4r4meters
 * p4r4meters contains 2 numbers!
 * java –jar Task3.jar meter
 * meter does not contain any numbers!
 * java –jar Task3.jar abc ddef
 * Please pass only one String to the program.
 * java –jar Task3.jar
 * Please pass one String to the program.
 */
public class Task3 {
	/**
	 * Counting how much numbers is in string
	 * 
	 * @param str - string
	 *            
	 * @return - number of numbers in string
	 */
	public static int getCountOfNumbers(String str) {

		int counter = 0;
		for (int i = 0; i < str.length(); i++) {
			if (Character.isDigit(str.charAt(i))) {
				counter++;
			}
		}
		return counter;
	}

	/**
	 * main
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		if (args.length == 0) {
			throw new IllegalArgumentException("You need at least one argument.");
		} else if (args.length != 0) {
			String str = args[0] + " ";
			System.out.println("How much number is in string?");
			System.out.println(args[0] + " contains " + getCountOfNumbers(str) + " numbers.");
		} else if (args.length > 1) {
			System.out.println("Please pass only one String to the program.");
		} else {
			System.out.println("Please pass one String to the program.");
		}
	}

}
