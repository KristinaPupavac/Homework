package zadacaS04D03;

/*
 * Napisati metodu koja prima jednu matricu i odredjuje koliko ukupno redova i kolona ima zbir jednak nuli.
 * Metoda: int getNumOfZeroRowsAndColumns(int[][] matrix)
 * PRIMJERI
 * int[][] arr2d = {{1, -2, 1}, {5, 0, 4}, {-4, 2, 2}}
 * getNumOfZeroRowsAndColumns(arr2d) => 4
 */
public class Task2 {
	/**
	 * Finding number of rows and columns which sum is zero
	 * @param matrix - input matrix
	 * @return counter - number of rows and columns which sum is zero 
	 */
	public static int getNumOfZeroRowsAndColumns(int[][] matrix) {
		//setting counter to zero and sum initialization
		int counter = 0;
		int sumRow = 0;
		int sumColumn = 0;
		//array passing through
		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix[i].length; j++) {
				//summing rows and columns
				sumRow += matrix[i][j];
				sumColumn += matrix[j][i];
				//checking is sum zero
				if (sumRow == 0 || sumColumn == 0) {
					counter++;
				}
			}
		}
		return counter;
	}

	/**
	 * main
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		//2D array initialization
		int[][] arr2d = { { 1, -2, 1 }, { 5, 0, 4 }, { -4, 2, 2 } };
		//Printing
		System.out.print("Total number of rows and columns which sum is zero: ");
		System.out.println(getNumOfZeroRowsAndColumns(arr2d));

	}

}
