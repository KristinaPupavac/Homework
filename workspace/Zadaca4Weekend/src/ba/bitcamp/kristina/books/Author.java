package ba.bitcamp.kristina.books;

/*
 * Napisati klasu koja predstavlja jednog autora. Atributi su sljedeci:
 * Ime autora
 * Godiste
 * Niz knjiga koje je autor napisao
 */
public class Author {
	String authorName;
	int yearOfBirth;
	Book[] books;

	// constructor
	public Author(String authorName, int yearOfBirth, Book[] books) {
		super();
		this.authorName = authorName;
		this.yearOfBirth = yearOfBirth;
		this.books = books;
	}

	// to string
	public String toString() {
		return "Author: " + authorName + ", year Of Birth: " + yearOfBirth;
	}

}
