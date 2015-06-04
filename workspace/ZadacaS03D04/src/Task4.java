/*
 * Napisati metodu koja za dati parametar N koji predstavlja broj dobijenih bodova na ispitu, i M, koji 
 * predstavlja maksimalni broj bodova na ispitu, odredjuje koliko je procenata dobijeno (0 – 100).
 * Metoda: double getPercentage(int N, int M)
 * PRIMJERI
 * getPercentage(25, 100) = 25.0
 * getPercentage(10, 20) = 10.0
 * getPercentage(30, 35) = 85.7142
 * getPercentage(3, 10) = 33.333
 */
public class Task4 {
	public static double getPercentage(int N, int M) {
		double percentages = (double) (N * 100.0 / M);
		return percentages;
	}

	public static void main(String[] args) {
		System.out.println(getPercentage(25, 100));

	}

}
