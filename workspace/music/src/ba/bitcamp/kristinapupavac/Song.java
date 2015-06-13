package ba.bitcamp.kristinapupavac;
/*
 * Napisati klasu koja predstavlja jednu pjesmu. Pjesma sadrzi sljedece atribute:
 * Izvodjac (koristiti prethodnu klasu)
 * Ime pjesme
 * Godina pjesme
 * Zanr pjesme
 */
public class Song {
	Performer performer;
	String songName;
	int songYear;
    String songGenere;
    
    public String toString() {
		String s = "";
		s += "Older song is: " + songName + "\n";
		return s;
	}


}
