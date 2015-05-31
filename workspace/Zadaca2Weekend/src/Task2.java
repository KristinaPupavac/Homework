/*
 * Java is known to each bracket should have its own bracket. Your task is to make sure you have all the 
 * brackets closed properly. One bracket fits exactly a one closed bracket. In addition, the bracket can not be 
 * closed if there is no any which will close. With the console receiving a String, which is a series of 
 * brackets. Determine whether all brackets open and closed properly. If so, print true, otherwise false
 */
public class Task2 {

	public static void main(String[] args) {
		//Initialization of variables
	    String bracketSeries = ("{}}{{");
		int bracketLength = bracketSeries.length();
		int counter2 = 0;
		int counter1 = 0;
		
		for (int i = 0; i < bracketLength; i++){
			char c = bracketSeries.charAt(i);
			char first = '{';
			char second = '}';
			
			if (c == first){
				counter1++;
			} 
			else if (c == second){
				counter2++;
			}
		}
		//Printing
		if (counter1 != counter2){
			System.out.println("Bracket is not closed.");
		} else {
			System.out.println("All brackets are closed.");	
		}
	}

}

