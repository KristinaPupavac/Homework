package ba.bitcamp.kristina;

import java.util.Scanner;

/*
 * Vas zadatak kao sto smo se i dogovorili je da napravite X-O igru. Kada se program pokrene prvo treba da pita
 *  za velicinu ploce (dimenzije tabele). Nakon toga program pita korisnike (igraca X i igraca O) da naizmjenicno
 *  unose koordinate na koje se treba upisati njihov potez (X ili O). Igra zavrsava kada jedan od igraca pobjedi
 *  (treba da ispisete ko je pobjedio) ili ako se popuni ploca. Ako nema pobjednika treba to da ispisete.
 */
public class Game {
	/**
	 * Method printing game board
	 * 
	 * @param size
	 *            - size game board size X size
	 */
	public static void printBoard(int size) {
		char board[][] = new char[size][size];
		for (int i = 0; i < size; i++) {
			System.out.println();
			for (int j = 0; j < size; j++) {
				if (j == 0)
					System.out.print("| ");
				System.out.print(board[i][j] + "_");
				System.out.print(board[i][j] + " | ");
			}
		}
		System.out.println();
	}
	/**
	 * 
	 * @param size
	 */
	public static void play(int size, char board[][]) {
		@SuppressWarnings("resource")
		Scanner input = new Scanner(System.in);
		System.out.println("Enter row and column: ");
	    char sign = 'X';
		boolean playing = true;
		printBoard(size);
		while (playing) {
			int row = input.nextInt();
			int column = input.nextInt();
			board[row][column] = sign;
			
			if (gameOver(size, row, column, sign)) {
				playing = false;
				System.out.println("Game over! Player " + sign + " wins! ");
			}

			printBoard(size);
			if (sign == 'X') {
				sign = 'O';
			} else if (sign == 'O'){
				sign = 'X';
			} 
		}
	}
	
	/**
	 * check rows
	 * @param size
	 * @param row
	 * @param column
	 * @param c
	 * @return
	 */
	private static boolean checkRowsForWin(int size, int row, char sign) {
		char board[][] = new char[size][size];
		for (int j = 0; j < board.length; j++) {
			if (board[row][j] != sign) {
				return false;
			}
		}
		return true;
	}
	/**
	 * check column
	 * @param size
	 * @param column
	 * @param c
	 * @return
	 */
	public static boolean checkColumnForWin(int size, int column, char sign) {
		char board[][] = new char[size][size];
		for (int i = 0; i < board.length; i++) {
			if (board[i][column] != sign) {
				return false;
			}
		}
		return true;
	}
	/**
	 * 
	 * @param size
	 * @param row
	 * @param column
	 * @param c
	 * @return
	 */
	public static boolean checkDiagonal1ForWin(int size, int row,
			int column, char sign) {
		char board[][] = new char[size][size];
		if (row != column) {
			return false;
		} else {
			for (int i = 0; i < board.length; i++) {
				if (board[i][i] != sign) {
					return false;
				}
			}
		}
		return true;
	}
	/**
	 * 
	 * @param size
	 * @param row
	 * @param column
	 * @param c
	 * @return
	 */
	public static boolean checkDiagonal2ForWin(int size, int row,
			int column, char sign) {
		char board[][] = new char[size][size];
		int temp = board.length - 1;
		if (row + column != temp) {
			return false;
		} else {
			for (int i = 0, j = board.length - 1; i < board.length; i++, j--) {
				if (board[i][j] != sign) {
					return false;
				}
			}
		}
		return true;
	}

	/**
	 * 
	 * @param size
	 * @param row
	 * @param column
	 * @param sign
	 * @return
	 */
	public static boolean gameOver(int size ,int row, int column, char sign) {
		if (checkRowsForWin(size, row, sign) || checkColumnForWin(size,
				column, sign) || checkDiagonal1ForWin(size, row,
				column, sign) || checkDiagonal2ForWin(size, row,
						column, sign)){
			return true; 
	}
	return false;
	}

	/**
	 * main
	 * @param args
	 */
	@SuppressWarnings("resource")
	public static void main(String[] args) {
		System.out.println("Welcome to XO game!");
		Scanner input = new Scanner(System.in);
		System.out.print("Enter size of board: ");
		int size = input.nextInt();
		char board[][] = new char[size][size];
		if (size < 0) {
			throw new ArrayIndexOutOfBoundsException(
					"Size can't be naegativ number");
		}

		// calling method print board
		play(size, board);
		
		input.close();
	}

}
