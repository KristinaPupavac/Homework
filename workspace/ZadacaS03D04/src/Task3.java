/*
 * Napisati metodu koja za dati String određuje da li taj String u sebi ima brojeva.
 * Metoda: boolean hasNumbers(String s)
 * PRIMJERI
 * hasNumbers(“P4rametri”) = true
 * hasNumbers(“substring”) = false
 * hasNumbers(“index0f”) = true
 * hasNumbers(“1”) = true
 * hasNumbers(“”) = false
 */
public class Task3 {

	public static boolean hasNUmber(String s) {
		for (int i = 0; i < s.length(); i++) {
			if (s.charAt(i) >= 48 && s.charAt(i) <= 57) {
				return true;
			}
		}
		return false;
	}

	public static void main(String[] args) {
		System.out.println(hasNUmber("string45"));

	}

}
