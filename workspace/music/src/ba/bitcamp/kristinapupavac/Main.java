package ba.bitcamp.kristinapupavac;

import java.util.Arrays;

/*
 * Napisati metodu (u klasi gdje je main metoda) koja prima, kao parametre, dvije pjesme i vraca
 * true ukoliko je isti autor obje pjesme, a false ako su autori razliciti.
 * Metoda: boolean isSameAuthor(Song s1, Song s2)
 * 
 * Napisati metodu koja prima, kao parametar, jednu pjesmu i odredjuje da li je izvodjac pjesme 
 * solo ili grupa (true ako je solo izvodjac, false ako je grupa).
 * Metoda: boolean isFromSoloAuthor(Song s)
 * 
 * Napisati metodu koja prima, kao parametre, dvije pjesme i vraca koja je starija.
 * Metoda: Song getOlderSong(Song s1, Song s2)
 * 
 * Napisati metodu koja prima, kao parametar, jedan album i jedan String, koji predstavlja zanr.
 * Vratiti iz metode broj, koji predstavlja broj pjesama koje su datog zanra.
 * Metoda: int countGenreNumber(Album a, String genre)
 * 
 * Napisati metodu koja prima, kao parametar, niz albuma i jednu pjesmu. Ispisati na ekran ime
 * albuma u kojem se pjesma nalazi. Ukoliko nema pjesme onda isprintati null.
 * Metoda: void printAlbumInformation(Album[] a, Song s)
 * 
 * Napisati metodu koja prima, kao parametar, jedan koncert i jedan niz albuma. Vratiti iz metode
 * int niz koji predstavlja koliko je pjesama iz svakog tog albuma bilo na koncertu.
 * Metoda: int[] getNumberOfSongsPerAlbum(Concert c, Album[] a)
 *
 */
public class Main {
	/**
	 * Method receives, two songs, as parameters, and returns true if the same
	 * author in both songs, and false if the authors are different.
	 * 
	 * @param s1
	 *            - song
	 * @param s2
	 *            - song
	 * @return true if author is same, else false
	 */
	public static boolean isSameAuthor(Song s1, Song s2) {
		if (s1.performer.name.equals(s2.performer.name)) {
			return true;
		}
		return false;
	}

	/**
	 * Method receives one song as a parameter, and determines whether the songs
	 * solo performer or group (true if the solo performer, false if the group).
	 * 
	 * @param s
	 *            - song
	 * @return true if the solo performer, false if the group
	 */
	public static boolean isFromSoloAuthor(Song s) {
		if (s.performer.isGroup == true) {
			return true;
		}
		return false;
	}

	/**
	 * Method receives two songs as parameters and returns which is older.
	 * 
	 * @param s1
	 *            - song
	 * @param s2
	 *            - song
	 * @return older song
	 */
	public static Song getOlderSong(Song s1, Song s2) {
		if (s1.songYear > s2.songYear) {
			return s2;
		}
		return s1;
	}

	/**
	 * Method receives an album and a String which represents the genre, as a
	 * parameters. Returns number of songs which are the given genre.
	 * 
	 * @param a
	 *            - album
	 * @param genre
	 *            - genre
	 * @return counter - number of songs from album which are the same genre
	 */
	public static int countGenreNumber(Album a, String genre) {
		int counter = 0;
		for (int i = 0; i < a.arraySong.length; i++) {
			if (a.arraySong[i] == genre) {
				counter++;
			}
		}
		return counter;
	}

	/**
	 * Method receives a string of albums and one song, as a parameter. Prints
	 * the name of the album where the track is located. If no song then print
	 * null.
	 * 
	 * @param a
	 *            - album
	 * @param s
	 *            - song
	 */
	public static void printAlbumInformation(Album[] a, Song s) {
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a[i].arraySong.length; j++) {
				if (a[i].arraySong[j] == s.songName) {
					System.out.println("Song is in album : " + a[i].name);
					return;
				}
				System.out.println("null");
			}
		}

	}

	/**
	 * Method receives a concert and a series of albums, as a parameter. Returns
	 * identification string that represents how many songs from each album that
	 * was at the concert.
	 * 
	 * @param c
	 *            - concert
	 * @param a
	 *            - album
	 * @return string that represents how many songs from each album that was at
	 *         the concert
	 */
	public static int[] getNumberOfSongsPerAlbum(Concert c, Album[] a) {
		int[] arrayOfConcertSongs = new int[a.length];
		int counter = 0;
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a[i].arraySong.length; j++) {
				counter = 0;
				for (int k = 0; k < c.arrayConcertSongs.length; k++) {
					if (c.arrayConcertSongs[k] == a[i].arraySong[j]) {
						counter++;
					}
				}
				arrayOfConcertSongs[i] = counter;
			}
		}
		return arrayOfConcertSongs;
	}

	/**
	 * main
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		// First performer
		Performer p1 = new Performer();
		p1.name = "Eric Patrick Clapton";
		p1.isGroup = false;
		p1.since = 1962;
		p1.genere = "blues rock";

		Song s1p1 = new Song();
		s1p1.performer = p1;
		s1p1.songName = "Layla";
		s1p1.songYear = 1971;
		s1p1.songGenere = "bluse rock";

		Song s2p1 = new Song();
		s2p1.performer = p1;
		s2p1.songName = "Tears in Heaven";
		s2p1.songYear = 1992;
		s2p1.songGenere = "soft rock";

		// album1
		String[] albumArrayp1 = new String[2];
		albumArrayp1[0] = s1p1.songName;
		albumArrayp1[1] = s2p1.songName;

		// Second performer
		Performer p2 = new Performer();
		p2.name = "Muse";
		p2.isGroup = true;
		p2.since = 1994;
		p2.genere = "alternative rock";

		Song s1p2 = new Song();
		s1p2.performer = p2;
		s1p2.songName = "Histerya";
		s1p2.songYear = 2003;
		s1p2.songGenere = "alternative rock";

		Song s2p2 = new Song();
		s2p2.performer = p2;
		s2p2.songName = "Undisclosed Desires";
		s2p2.songYear = 2009;
		s2p2.songGenere = "alternative dance";

		// album2
		String[] albumArrayp2 = new String[2];
		albumArrayp2[0] = s1p2.songName;
		albumArrayp2[1] = s2p2.songName;

		// Third performer
		Performer p3 = new Performer();
		p3.name = "Janis Joplin";
		p3.isGroup = false;
		p3.since = 1962;
		p3.genere = "blues rock";

		Song s1p3 = new Song();
		s1p3.performer = p3;
		s1p3.songName = "Cry Baby";
		s1p3.songYear = 1963;
		s1p3.songGenere = "blues rok";

		Song s2p3 = new Song();
		s2p3.performer = p3;
		s2p3.songName = "Mercedes benz";
		s2p3.songYear = 1971;
		s2p3.songGenere = "soul";

		// album3
		String[] albumArrayp3 = new String[2];
		albumArrayp1[0] = s1p3.songName;
		albumArrayp1[1] = s2p3.songName;

		// albums
		Album a1 = new Album("Darker and dominos", p1, albumArrayp1,
				"bluse rock");
		Album a2 = new Album("Hysteria", p2, albumArrayp2, "alternative rock");
		Album a3 = new Album("Peral", p3, albumArrayp3, "bluse rock");

		// concert songs array
		String[] concertSongs = new String[9];
		concertSongs[0] = s1p1.songName;
		concertSongs[1] = s2p1.songName;
		concertSongs[2] = s1p2.songName;
		concertSongs[3] = s2p2.songName;
		concertSongs[4] = s1p3.songName;
		concertSongs[5] = s2p3.songName;

		// concert performers
		String[] concertPerformeres = new String[3];
		concertPerformeres[0] = p1.name;
		concertPerformeres[1] = p2.name;
		concertPerformeres[2] = p3.name;

		// concert
		Concert c = new Concert(concertPerformeres, concertSongs);

		// printing
		System.out.println("Is these two songs from the same author? "
				+ isSameAuthor(s2p3, s1p3));

		System.out.println("Is song from solo author? "
				+ isFromSoloAuthor(s2p1));

		System.out.println(getOlderSong(s1p1, s2p2));

		System.out.println("Number of same genre songs on album: " + countGenreNumber(a1, "bluse rock"));

		printAlbumInformation(new Album[] { a1, a2, a3 }, s2p2);

		System.out
				.println("Array of how much songs from albums is performed on concert: "
						+ Arrays.toString(getNumberOfSongsPerAlbum(c,
								new Album[] { a1, a2, a3 })));

	}

}
