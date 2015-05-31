/*
 * Mujo K Mujo N Mujo container K Mujo N...........................................
 */
import java.util.Scanner;
public class Task7 {
	
		public static void main(String[] args) {
			Scanner input = new Scanner(System.in);
			//Initializing variables
			System.out.print("Input number of containers: ");
			int containers = input.nextInt();
			int numOfContainers = containers;
			System.out.print("Input capacity: ");
			int capacity = input.nextInt();
			int addContainers = 0;
			boolean canFit = true;
			//Is number of containers is more than the capacity 
			while(numOfContainers > capacity){
				if(!canFit){
					//Adding containers 
					numOfContainers = containers + addContainers;
					canFit = true;
				}
				if(numOfContainers % 2 == 0){
					numOfContainers /= 2;
				} else {
					canFit = false;
					addContainers++;		
				}
			}
			//Printing 
			System.out.println("Number of added containers: " + addContainers);
			input.close();
	}
}
