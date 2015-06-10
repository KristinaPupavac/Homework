package zadacaS04D03;

/*
 * Napisati metodu koja prima jednu matricu i jedan broj. Odrediti koliko se puta dati broj ponavlja u matrici.
 * Metoda: int countNumber(int[][] matrix, int number)
 * PRIMJERI
 * int[][] arr2d = {{1, 2, 1}, {5, 2, 8}, {-4, 2, 3}}
 * countNumber(arr2d, 1) => 2
 * countNumber(arr2d, 9) => 0
 * countNumber(arr2d, 2) => 3
 */
public class Task1 {
    /**
     * How many times are given number repeats in the matrix
     * @param matrix - input matrix
     * @param number - number which we want to find in matrix
     * @return counter - number of repetitions of the number in the matrix  
     */
	public static int countNumber(int[][] matrix, int number) {
		//seting counter on zero
		int counter = 0;
		//array passing through
		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix[i].length; j++) {
				//finding number in matrix
				if (matrix[i][j] == number) {
					counter++;
				}

			}
		}
		return counter;
	}
	/**
	 * main
	 * @param args
	 */
	public static void main(String[] args) {
		//2D array initialization
		int[][] arr2d = { { 1, 2, 1 }, { 5, 2, 8 }, { -4, 2, 3 } };
		//Printing 
		System.out.print("Number of number repetitions of number in the matrix is: ");
		System.out.println(countNumber(arr2d, 9));
	}

}
