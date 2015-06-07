import java.util.Scanner;

//import java.util.Scanner;

/*
 * LOOPS
 * Unijeti jedan cijeli broj N preko Scanner-a.
 * Napisati metodu koja ispisuje (ne vraca) N, ali sa zarezom nakon svake tri cifre.
 * Primjer 1: Broj 123456789 ce biti 123,456,789.
 * Primjer 2: Broj 9999 ce biti 9,999.
 * 
 * Napisati metodu koja odredjuje koliko cifara ima N i isprintati na konzolu. 
 * Primjer 1: Broj 12543 ima 5 cifara. 
 * Primjer 2: Broj 205 ima 3 cifre.
 * 
 * Napisati metodu koja vraca broj Q, koji predstavlja broj N kada se zadnja i prva cifra promijene.
 * Primjer 1: Broj 12345 postaje 52341. 
 * Primjer 2: Broj 2 (p)ostaje 2
 * 
 * Napisati metodu koja odredi koliko ima brojeva izmedju N i Q.
 * Ukoliko se nalazi neparni broj brojeva između N i Q onda isprintati sve neparne, u suprotnom isprintati sve 
 * parne brojeve. Ukoliko nema nikako brojeva izmedju onda ništa ne uraditi
 */
public class Loops {
	/**
	 * Returns number with ,
	 * 
	 * @param n
	 */
	public static void writing(int n) {
		String num = "" + n;
		String num1 = "";
		int counter = 0;

		for (int i = num.length() - 1; i > 0; i--) {
			counter++;
			if (counter % 3 != 0) {
				num1 = num.charAt(i) + num1;
			} else {
				num1 = "." + num.charAt(i) + num1;
			}
		}
		num1 = num.charAt(0) + num1;
		System.out.print(num1 + " ");
	}

	/**
	 * Returns number of digits
	 * 
	 * @param n
	 * @return
	 */
	public static int digitN(int n) {
		int counter = 0;
		while (n % 10 != 0) {
			n /= 10;
			counter++;
		}
		return counter;
	}

	/**
	 * Returns q = lasdigit(n) + rest + fristdigit(n)
	 * 
	 * @param n
	 * @return
	 */
	public static int returnQ(Integer n) {
		if (n < 10) {
			return n;
		} else {
			String numb = "" + n;
			String numb1 = "";
			char firstDigit = numb.charAt(0);
			char lastDigit = numb.charAt(numb.length() - 1);
			for (int i = 1; i < numb.length() - 1; i++) {
				char rest = numb.charAt(i);
				numb1 = numb1 + rest;
			}
			numb1 = lastDigit + numb1 + firstDigit;
			int q = Integer.parseInt(numb1);
			return q;
		}
	}

	/**
	 * If num
	 * 
	 * @param n
	 * @param q
	 * @return
	 */
	public static void oddNumbers(int n, int q) {
		int counter = 0;
		for (int i = n + 1; i < q; i++) {
			counter++;
		}
		if (counter % 2 == 0) {
			for (int i = n; i < q; i++) {
				if (i % 2 == 0) {
					writing(i);
				}
			}
		} else if (counter % 2 != 0) {
			for (int i = n; i < q; i++) {
				if (i % 2 != 0) {
					writing(i);
				}
			}
		}
	}	
	/**
	 * main
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter n: ");
		int n = input.nextInt();

		System.out.println("Write n with . : ");
		writing(n);

		System.out.println("Number of digits: ");
		System.out.println(digitN(n));

		System.out.println("Q modified n: ");
		System.out.println(returnQ(n));

		System.out.println("Print numbers: ");
		oddNumbers(n, returnQ(n));

		input.close();
	}

}
