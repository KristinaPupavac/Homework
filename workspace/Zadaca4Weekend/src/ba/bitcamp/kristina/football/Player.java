package ba.bitcamp.kristina.football;
/*
 * Napisati klasu koja predstavlja jednog fudbalskog igraca. Klasa ima sljedece atribute:
 * Ime igraca
 * Godiste
 * Pozicija (npr. „Forward“ ili „Goalkeeper“)
 */
public class Player {

	String name;
	int yearOfBirth;
	String position;
	
	//constructor 
	public Player(String name, int yearOfBirth, String position) {
		super();
		this.name = name;
		this.yearOfBirth = yearOfBirth;
		this.position = position;
	}
	//printing string
	public String toString() {
		String s = "\n";
		s += "Player name: " + name + "\n";
		s += "Year of birth: " + yearOfBirth + "\n";
		s += "Position: " + position + "\n";
		return s;
	}
}
