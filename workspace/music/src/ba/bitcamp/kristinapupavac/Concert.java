package ba.bitcamp.kristinapupavac;

import java.util.Arrays;

public class Concert {
	String[] performers;
	String[] arrayConcertSongs;
	
	//constructor
	public Concert(String[] performers, String[] arrayConcertSongs) {
		super();
		this.performers = performers;
		this.arrayConcertSongs = arrayConcertSongs;
	}

	@Override
	public String toString() {
		return "Concert [performers=" + Arrays.toString(performers)
				+ ", arrayConcertSongs=" + Arrays.toString(arrayConcertSongs)
				+ "]";
	}

}
