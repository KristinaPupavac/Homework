import java.util.Arrays;

/*
 * Prilikom pokretanja programa procitati sve argumente date s komandne linije i protumaciti ih kao decimalne 
 * brojeve (float). Na ekran ispisati svaki decimalni broj formatiran koristeci sprintf() metodu, te format 
 * string za floating point brojeve ("%f"). Izracunati **proizvod** svih zadatih brojeva i ispisati ga na 
 * ekranu, formatiran na isti nacin. Ako jedan od argumenata nije ispravan decimalni broj, prikazati poruku o 
 * gresci. Prekinuti citanje ako korisnik ne unese broj (prazan string) ili unese nulu.
 * Napomena: decimalni brojevi pri unosu trebaju biti razdvojeni decimalnom tackom, a ne zarezom.
 */
public class ArgumentsExercise {

	public static void main(String[] args) {

		float[] arr = new float[args.length];
		try {
			for (int i = 0; i < args.length; i++) {
				arr[i] = Float.parseFloat(args[i]);
			}
		} catch (NumberFormatException ex) {
			System.out.println("NumberFormatException");
		}
		System.out.println("Input arguments are: " + Arrays.toString(arr));

		if (args.length == 0) {
			throw new ArrayIndexOutOfBoundsException();
		}

		if (args.length < 2) {
			System.out.println("Hey, you need more arguments.");
			System.out.println("At least two.");
			System.exit(0);
		} else if (args.length > 2) {
			System.out.println("Hey, you need less arguments.");
			System.out.println("Only two.");
			System.exit(0);
		}

		float a = Float.parseFloat(args[0]);
		float b = Float.parseFloat(args[1]);

		System.out.printf("Result is : %f\n", a * b);
	}

}
