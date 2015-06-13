package ba.bitcamp.kristina.books;

/*
 * Napisati metodu (u klasi gdje je main metoda) koja prima, kao parametar, jednog autora. 
 * Metoda vraca broj koji odgovara broju bestseller knjiga od tog autora.
 * Metoda: int countBestsellingBooks(Author a)
 * 
 * Napisati metodu (u klasi gdje je main metoda) koja prima, kao parametre, jednog autora i dvije
 *  godine. Metoda vraca broj koji odgovara broju knjiga objavljenih izmedju date dvije godine 
 *  (ukljucujuci obije) od strane datog autora.
 * Metoda: int getNumberOfWrittenBooks(Author a, int year1, int year2)
 * 
 * Napisati metodu (u klasi gdje je main metoda) koja prima, kao parametar, niz autora. Metoda 
 * vraca autora koji je autor imao najvise bestsellera iz datog niza autora.
 * Metoda: Author getAuthorWithMostBestsellers(Author[] authors)
 */
public class Main {
	/**
	 * main
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		// Book constructor
		Book b1 = new Book("Women", 1978, "novel", true);
		Book b2 = new Book("Shakespeare Never Did This", 1979,
				"autobiographical novel", false);
		Book b3 = new Book("Post Office", 1971, "autobiographical novel", false);
		// array of books
		Book[] books1 = new Book[] { b1, b2, b3 };
		// Author constructor
		Author author1 = new Author("Henry Charles Bukowski ", 1920, books1);

		// Book constructor
		Book b4 = new Book(" When Nietzsche Wept", 1992, "novel", true);
		Book b5 = new Book(" The Schopenhauer Cure", 2005, "novel", true);
		Book b6 = new Book(" The Spinoza Problem", 2012, " novel", false);
		// array of books
		Book[] books2 = new Book[] { b4, b5, b6 };
		// Author constructor
		Author author2 = new Author("Irvin D. Yalom ", 1931, books2);
		// Author array
		Author[] authorArray = new Author[] { author1, author2 };

		// printing and method calling
		System.out.println("Number of author bestsellers is: " + countBestsellingBooks(author2));

		System.out.println("Number of books between two years is: " + getNumberOfWrittenBooks(author1, 1971, 1979));

		System.out.println("Author with the most bestsellers is: " + getAuthorWithMostBestsellers(authorArray));
	}

	/**
	 * Method receives one author, as a parameter.The method returns a number of
	 * bestseller books from this author.
	 * 
	 * @param a
	 *            - author
	 * @return bestSellerCounter - number of author bestsellers
	 */
	public static int countBestsellingBooks(Author a) {
		int bestSellerCounter = 0;
		for (int i = 0; i < a.books.length; i++) {
			if (a.books[i].isBestseller == true) {
				bestSellerCounter++;
			}
		}
		return bestSellerCounter;
	}

	/**
	 * Method receives, one author and two years, as parameters. The method
	 * returns a number that corresponds to the number of books published
	 * between the date two years (including both) by a given author.
	 * 
	 * @param a
	 *            - author
	 * @param year1
	 *            - from year
	 * @param year2
	 *            - to year
	 * @return numberOfBooks - number of author books between two years
	 */
	public static int getNumberOfWrittenBooks(Author a, int year1, int year2) {
		int numberOfBooks = 0;
		for (int i = 0; i < a.books.length; i++) {
			if (year1 <= a.books[i].editionYear
					&& a.books[i].editionYear <= year2) {
				numberOfBooks++;
			}
		}
		return numberOfBooks;
	}
	/**
	 * Method receives a number of authors, as a parameter. The method returns the authors who had 
	 * wrote the most bestsellers of a given number of authors.
	 * @param authors - array of authors
	 * @return authorWithMostBestsellers - name of author with most bestsellers
	 */
	public static Author getAuthorWithMostBestsellers(Author[] authors) {
		Author authorWithMostBestsellers = authors[0];
		for (int i = 0; i < authors.length; i++) {
			if (countBestsellingBooks(authorWithMostBestsellers) < countBestsellingBooks(authors[i])) {
				authorWithMostBestsellers.authorName = authors[i].authorName;
				authorWithMostBestsellers.yearOfBirth = authors[i].yearOfBirth;
			}
		}
		return authorWithMostBestsellers;
	}
}
