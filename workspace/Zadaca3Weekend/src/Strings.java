import java.util.Scanner;

/*
 * STRINGS
 * Unijeti dva String-a preko konzole.
 * Napisati metodu koja ispisuje (ne vraca) na konzolu prvo slovo prvog, pa prvo slovo drugog, pa drugo slovo 
 * prvog, pa drugo slovo drugog, itd.
 * Primjer 1: Ukoliko su ta dva String-a „Java“ i „Bit“ onda treba isprintati „JBaivta“.
 * Primjer 2: Ukoliko su ta dva String-a „Programming“ i „int“ onda je „Pirnotgramming“.
 * 
 * Napisati metodu koja određuje da li se sva slova iz prvog String-a pojavljuju u drugom.
 * Primjer 1: Za String-ove „Java“ i „Ajvar“ vraca true 
 * Primjer 2: Za String-ove „Ajvar“ i „Java“ vaca false
 * 
 * Napisati metodu koja ispisuje koji String dolazi drugi u abecedi. 
 * Primjer 1: Ako su „Zadaca“ i „Spavanje“ onda izabrati „Zadaca“ 
 * Primjer 2: Ako su „Programirati“ i „Kafa“ onda izabrati „Programirati“
 * 
 * Napisati metodu koja odredjuje da li su ta dva String-a anagrami, tj. da li posjeduju ista slova. 
 * Primjer 1: Rijeci „byte“ i „tybe“ su anagrami 
 * Primjer 2: Rijeci „intt“ i „ntii“ nisu anagrami
 */
public class Strings {
	/**
	 * Writing one letter from first one from second string
	 * 
	 * @param str1
	 * @param str2
	 * @return
	 */
	public static void firstLetter(String str1, String str2) {
		String str3 = "";
		int length = 0;
		if (str1.length() > str2.length()) {
			length = str2.length();
		} else {
			length = str1.length();
		}
		for (int i = 0; i < length; i++) {
			char index1 = str1.charAt(i);
			char index2 = str2.charAt(i);
			str3 += index1;
			str3 += index2;
		}
		int length1 = 0;
		int temp = -1;
		if (str1.length() > str2.length()) {
			length1 = str1.length();
			temp = 0;
		} else {
			length1 = str2.length();
		}
		for (int i = length; i < length1; i++) {
			if (temp == 0) {
				char index1 = str1.charAt(i);
				str3 += index1;
			} else {
				char index1 = str2.charAt(i);
				str3 += index1;
			}
		}
		System.out.println(str3);
	}

	/**
	 * Returns true if letter is in other string
	 * 
	 * @param str1
	 * @param str2
	 * @return
	 */
	public static boolean isLetterInOtherString(String str1, String str2) {
		int counter = 0;
		for (int i = 0; i < str1.length(); i++) {
			for (int j = 0; i < str2.length(); j++) {
				if (str1.charAt(i) == str2.charAt(j)) {
					counter++;
					break;
				}
			}
		}
		if (counter == str1.length()) {
			return true;
		} else {
			return false;
		}
	}

	/**
	 * Returns second string compering alphabet
	 * 
	 * @param str1
	 * @param str2
	 * @return
	 */
	public static String stringABC(String str1, String str2) {
		int a = str1.compareTo(str2);
		if (a > 0) {
			return str1;
		} else {
			return str2;
		}

	}

	/**
	 * Returns true if string is anagram
	 * 
	 * @param str1
	 * @param str2
	 * @return
	 */
	public static boolean isAnagram(String str1, String str2) {
		int counter = 0;
		for (int i = 0; i < str1.length(); i++) {

			for (int j = 0; j < str2.length(); j++) {
				if (str1.charAt(i) == str2.charAt(j)) {
					counter++;
				}
			}
		}
		if (counter == str1.length()) {
			return true;
		} else {
			return false;
		}

	}

	/**
	 * main
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter string 1: ");
		String str1 = input.next();
		System.out.println("Enter string 2: ");
		String str2 = input.next();

		System.out.println("Mix of two strings is: ");
		firstLetter(str1, str2);
		System.out.println("Is letter in other string: ");
		System.out.println(isLetterInOtherString(str1, str2));

		System.out.println("Second alphabet: ");
		System.out.println(stringABC(str1, str2));

		System.out.println("is anagram: ");
		System.out.println(isAnagram(str1, str2));

		input.close();

	}

}
