/*
 * Napisati program koji ucitava jedan niz iz args parametra. Odrediti koji je najmanji broj koji se pojavi kao 
 * parametar dat kroz terminal i ispisati na konzolu.
 * PRIMJERI
 * java –jar Task2.jar 5 4 0 1 -5 7 -2
 * Min. number is -5!
 * java –jar Task2.jar 1 0 4
 * Min. number is 0!
 * java –jar Task2.jar i 0 a
 * Please enter only numbers!
 */
public class Task2 {
	/**
	 * Finding minimum array element
	 * 
	 * @param arr
	 *            - input array
	 * @return - min array element
	 */
	public static int arrayMin(int[] arr) {
		if (arr.length == 0) {
			throw new IllegalArgumentException("You need at least one argument.");
		}
		int min = arr[0];
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] < min) {
				min = arr[i];
			}
		}
		return min;
	}

	/**
	 * main
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		try {
			int arr[] = new int[args.length];
			for (int i = 0; i < args.length; i++) {
				arr[i] = Integer.parseInt(args[i]);
			}
			System.out.println("Min array element is :" + arrayMin(arr));
		} catch (NumberFormatException ex) {
			System.out.println("NumberFormatException");
		}

	}

}
