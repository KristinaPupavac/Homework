/*
 * Napisati metodu koja konvertuje C u K. Parametar je double i izlaz je double. Napisati javadoc za tu metodu!
 * PRIMJERI
 * convertToKelvins(100.0) => 373.15
 * convertToKelvins(15.85) => 289.00
 * convertToKelvins(-15.15) => 258.00
 */
public class Task1 {
	/**
	 * Convert Celsius to Kelvin
	 * @param c - temperature in Celsius
	 * @return - temperature in Kelvin
	 */
	public static double temperatureConvertor(double c) {
		double kelvin = c + 273.15;
		return kelvin;
	}
    /**
     * main
     * @param args
     */
	public static void main(String[] args) {
		System.out.println(temperatureConvertor(-15));

	}

}
