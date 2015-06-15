package ba.bitcamp.kristina.zadaca;

/*
 * Task 5
Napisati (jos) jedan program koji izracunava kolika je brzina u km/h,
ako vi na pocetku imate dvije varijable, jedna varijabla u kojoj se 
nalazi distanca predjena (u metrima), a druga varijabla sadrzi u sebi 
potrebno vrijeme (u sekundama) da se predje distanca.
 */

public class Speed {
	public static void main(String[] args){
		int distance = 5000;
		int time = 30;
		
		double speed = (distance / 1000) / ((double)time / 3600);
		System.out.println("Brzina je: " + speed + " [km/h]");	
	
	}

}
