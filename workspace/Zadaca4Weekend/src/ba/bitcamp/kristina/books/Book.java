package ba.bitcamp.kristina.books;
/*
 * Napisati klasu koja predstavlja jednu knjigu. Atributi su sljedeci:
 * Ime knjige
 * Godina
 * Zanr
 * Da li je bestseller?
 */
public class Book {

	String name;
	int editionYear;
	String genre;
	boolean isBestseller;
	
	//constructor
	public Book(String name, int editionYear, String genre, boolean isBestseller) {
		super();
		this.name = name;
		this.editionYear = editionYear;
		this.genre = genre;
		this.isBestseller = isBestseller;
	}
}
