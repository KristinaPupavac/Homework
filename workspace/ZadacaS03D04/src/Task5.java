/*
 * Napisati metodu koja za dati String vrati taj isti String sa uklonjenim slovima i specijalnim znakovima, tj. samo cifre ostaju.
 * Metoda: String getNumbersOnly(String s)
 * PRIMJERI
 * getNumbersOnly(“41d4 K. :9”) = 4149
 * getNumbersOnly(“22.42o15”) = 224215
 * getNumbersOnly(“:r:(:S”) = 0
 * getNumbersOnly(“”) = 0
 */
public class Task5 {

	public static String getNumbersOnly(String s) {
		String str = "";
		for (int i = 0; i < s.length(); i++) {
			if (s.charAt(i) >= 48 && s.charAt(i) <= 57) {
				str = str + s.charAt(i);
			}
		}
		return str;
	}

	public static void main(String[] args) {
		System.out.println(getNumbersOnly("kristina2"));
	}

}
