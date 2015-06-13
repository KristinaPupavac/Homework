package ba.bitcamp.kristinapupavac;

import java.util.Arrays;

/*
 * Napisati klasu koja predstavlja jedan album. Klasa sadrzi sljedece atribute:
 * Ime albuma
 * Izvodjaca (koristiti klasu iz prvog zadatka)
 * Jedan niz pjesama (koristiti klasu iz drugog zadatka)
 * Zanr albuma
 */
public class Album {
	String name;
	Performer performer;
	String[] arraySong; 
	String genere;
	
	public Album(String name, Performer performer, String[] arraySong, String genere) {
		super();
		this.name = name;
		this.performer = performer;
		this.arraySong = arraySong;
		this.genere = genere;
	}

	@Override
	public String toString() {
		return "Album [name=" + name + ", performer=" + performer
				+ ", arraySong=" + Arrays.toString(arraySong) + ", genere="
				+ genere + "]";
	}

}
