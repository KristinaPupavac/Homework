package ba.bitcamp.kristina.football;

/*
 * Napisati metodu (u klasi gdje je main metoda) koja prima, kao parametre, jedan tim i jednu
 *  godinu. Metoda vraca koliko ima igraca u datom timu toga godista.
 * Metoda: int countPlayers(Team t, int year)
 * 
 * Napisati metodu (u klasi gdje je main metoda) koja prima, kao parametre, jedan tim i jednu 
 * poziciju. Metoda vraca koliko ima igraca u datom timu da igra tu poziciju.
 * Metoda: int countPlayers(Team t, String position)
 * 
 * Napisati metodu (u klasi gdje je main metoda) koja prima, kao parametar, jedan tim. Metoda 
 * vraca igraca koji je najmladji u timu.
 * Metoda: Player getYoungestPlayer(Team t)
 * 
 */
public class Main {
	/**
	 * main
	 * @param args
	 */
	public static void main(String[] args) {
		//Players
		Player player1 = new Player("PETR CHECH", 1982,
				"Goalkeeper");
		Player player2 = new Player("JOHN OBI MIKEL", 1987,
				"Midfielderr");
		Player player3 = new Player("ANDREAS CHRISTENSEN",
				1996, "Defender");
		Player player4 = new Player("DIDIER DROGBA", 1982,
				"Forward");
		Player player5 = new Player("JOHN TERRY", 1980,
				"Defender");
		Player player6 = new Player("RAMIRES", 1987,
				"Midfielderr");
		Player player7 = new Player("OSCAR", 1991,
				"Midfielderr");
		Player player8 = new Player("DIEGO COSTA", 1988,
				"Forward");
		Player player9 = new Player("JUAN CUADRADO", 1988,
				"Midfielderr");
		Player player10 = new Player("BRANISLAV IVANOVIC",
				1984, "Defender");
		Player player11 = new Player("GARY CAHILL", 1985,
				"Defender");

		Player[] players = new Player[] { player1, player2,
				player3, player4, player5, player6, player7, player8, player9,
				player10, player11 };
		//team constructor
		Team team1 = new Team("Chelsea", players);

		System.out.println("Number of players in team with same age is: "
				+ countPlayers(team1, 1987));
		System.out.println("Number of player on same position is: " + 
				countPlayers(team1, "Midfielderr"));
		System.out.println("Yungest player is: " + getYoungestPlayer(team1));

	}

	/**
	 * The method inputs are football team and player year of birth. The method
	 * returns number of team players with same age.
	 * 
	 * @param t
	 *            - football team
	 * @param year
	 *            - player year of birth
	 * @return palyerSameAgeCounter - number of same age player in team
	 */
	public static int countPlayers(Team t, int year) {
		int palyerSameAgeCounter = 0;
		for (int i = 0; i < t.FootballPlayer.length; i++) {
			if (t.FootballPlayer[i].yearOfBirth == year) {
				palyerSameAgeCounter++;
			}
		}
		return palyerSameAgeCounter;
	}
	/**
	 * Method receives, one team and one position, as parameters. The method returns number
	 * of players in team on same position.
	 * @param t - team
	 * @param position - football player position
	 * @return playerOnSamePosition - number of player on same position
	 */
	public static int countPlayers(Team t, String position) {
		int playerOnSamePosition = 0;
		for (int i = 0; i < t.FootballPlayer.length; i++) {
			if (t.FootballPlayer[i].position == position) {
				playerOnSamePosition ++;
			}
		}
		return playerOnSamePosition ;
	}
	/**
	 * Method accepts one team as a parameter. The method returns the player who is the youngest
	 * in the team.
	 * @param t - football team
	 * @return yungestPalye - yungest palyer in team
	 */
	public static Player getYoungestPlayer(Team t) {
		Player yungestPalyer = t.FootballPlayer[0];
		for (int i = 0; i < t.FootballPlayer.length; i++) {
			if (yungestPalyer.yearOfBirth <  t.FootballPlayer[i].yearOfBirth) {
				yungestPalyer.yearOfBirth = t.FootballPlayer[i].yearOfBirth;
				yungestPalyer.name = t.FootballPlayer[i].name;
				yungestPalyer.position = t.FootballPlayer[i].position;
			}
		}
		return  yungestPalyer;
	}

}
