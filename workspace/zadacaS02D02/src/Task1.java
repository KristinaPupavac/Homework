import java.util.Scanner;


public class Task1 {
/* Write a program that draws a rectangle on the screen, whereby the date website and b rectangle. To draw using the signs: - (minus) on the horizontal line
 * | (pipe) to erect + (plus) for the angles.
 */
		public static void main(String[] args) {
			
			Scanner input = new Scanner(System.in);
			
			System.out.print("Input height: ");
			int maxHeight = input.nextInt();
			System.out.print("Input witdh: ");
			int maxWitdh = input.nextInt();
			
	
			for (int i = 0; i < maxHeight; i++) {
				for (int j = 0; j < maxWitdh; j++) {
					if ((i == 0 || i == maxHeight - 1) && (j == 0 || j == maxWitdh - 1)){ //coskovi (00), (05), (20), (25) za 6 
						System.out.print("+ ");
					} else if (i == 0 || i == maxHeight - 1){ 
						System.out.print("- ");
					} else if (j == 0 || j == maxWitdh - 1){
						System.out.print("| ");
					} else {
						System.out.print("  ");
					}
				}
				System.out.println();
			}
			input.close();
	
		
	}
}
