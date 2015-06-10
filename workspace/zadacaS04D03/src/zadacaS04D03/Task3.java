package zadacaS04D03;
/*
 * Napisati metodu koja prima jednu matricu 3x3 i dva broja, X i Y. Dati brojevi predstavljaju koordinate skakaca
 * u sahu. Odrediti koliko najvise bodova moze skakac pokupiti sa jednim potezom (jedan potez se broji i kada 
 * skakac ostane na istom mjestu). Skakac prati pravila saha.
 * Metoda: int getMaxPoints(int[][] matrix, int x, int y)
 * PRIMJERI
 * int[][] arr2d = {{1, 2, 1}, {5, 2, 8}, {-4, 2, 3}}
 * getMaxPoints(arr2d, 0, 0) => 8
 * getMaxPoints(arr2d, 1, 1) => 2
 * getMaxPoints(arr2d, 2, 0) => 5
 */
public class Task3 {
	/**
	 * Maximum points of jumper figure in chess in one jump.
	 * @param matrix - input matrix (chess table) 
	 * @param x - jumper coordinate
	 * @param y - jumper coordinate
	 * @return max - Maximum points in one jump is
	 */
	public static int getMaxPoints(int[][] matrix, int x, int y) {
		String position = x + "" + y;
		int max = 0;
		switch (position) {
		case "00":
			max = Math.max(matrix[0][0], Math.max(matrix[1][2], matrix[2][1]));
			break;
		case "01":
			max = Math.max(matrix[0][1], Math.max(matrix[2][0], matrix[1][2]));
			break;
		case "02":
			max = Math.max(matrix[0][2], Math.max(matrix[1][0], matrix[2][1]));
			break;
		case "10":
			max = Math.max(matrix[1][0], Math.max(matrix[0][2], matrix[2][2]));
			break;
		case "11":
			return matrix[1][1];
		case "12":
			max = Math.max(matrix[1][2], Math.max(matrix[0][0], matrix[2][0]));
			break;
		case "20":
			max = Math.max(matrix[2][0], Math.max(matrix[1][2], matrix[0][1]));
			break;
		case "21":
			max = Math.max(matrix[2][1], Math.max(matrix[0][0], matrix[0][2]));
			break;
		case "22":
			max = Math.max(matrix[2][2], Math.max(matrix[2][0], matrix[0][1]));
			break;
		}
		return max;

	}

	public static void main(String[] args) {
		//2D array initialization
		int[][] arr2d = {{1, 2, 1}, {5, 2, 8}, {-4, 2, 3}};
		//Printing
		System.out.print("Maximum points in one jump is: ");
		System.out.println(getMaxPoints(arr2d, 0, 0));
		

	}

}
