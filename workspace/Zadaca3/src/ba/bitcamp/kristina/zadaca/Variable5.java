package ba.bitcamp.kristina.zadaca;

public class Variable5 {
	/*
	 * Task 4
Napisati program koji sadri pet varijabli
 (kojima vi vrijednosti stavite). Ispisati sumu i prosjek tih
  varijabli.
	 */

	public static void main(String[] args) {
		int var1 = 5;
		int var2 = 4;
		int var3 = 5;
		int var4 = 5;
		int var5 = 3;
		
		int sum = var1 + var2 + var3 + var4 + var5;
		double average = (double)sum / 5;
		
		System.out.println("Suma pet varijabli je: " + sum);
		System.out.println("Prosjek pet varijabli je: " + average);

	}

}
