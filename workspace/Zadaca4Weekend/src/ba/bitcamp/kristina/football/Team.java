package ba.bitcamp.kristina.football;
/*
 * Napisati klasu koja predstavlja jedan fudbalski tim. Klasa sadrzi sljedece atribute:
 * Ime tima
 * Niz igraca (koristiti predhodnu klasu)
 */
public class Team {
	String timName;
	Player [] FootballPlayer;
	
	//constructor
	public Team(String timName, Player[] footballPlayer) {
		super();
		this.timName = timName;
		FootballPlayer = footballPlayer;
	}
}
