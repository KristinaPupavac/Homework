/*
 * Potrebno je kreirati Java klasu "Zivotinja", koja pokriva sve zivotinje na planeti Zemlji.
 * Nakon kreirane klase, potrebno je instancirati istu, ali svaka instanca te klase (Zivotinja) predstavlja drugu
 * zivotinju. Svaka zivotinja proizvodi drugaciji zvuk, tako da je potrebno implementirati metodu napraviZvuk u
 * klasu Zivotinja, a ta metoda ispisuje String, koji predstavlja zvuk te zivotinje.
 * String koji predstavlja zvuk zivotinje je "private String zvuk", koji je potrebno promijeniti pri svakom
 * instanciranju klase Zivotinja (kroz konstruktor ili metodu setZvuk).
 */
public class Main {
	public static void main(String[] args) {
		//Animals(String sound, String name, boolean wild, Integer numberOfExtremities)
		Animals animal1 = new Animals("grrrrrawww", "Leon", true, 4);
		Animals animal2 = new Animals("av-av", "Dog", false, 4);
		Animals animal3 = new Animals("ssss", "Snake", true, 0);
		
		//Printing
		System.out.println(animal1);
		System.out.println(animal2);
		System.out.println(animal3);
	}
}
