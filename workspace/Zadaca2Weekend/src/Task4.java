/*
 * Your task is to decode (decrypt) given file encodedFile.in I gave you. The first line of the file contains a
 *  number n. Number n indicates how many lines appear after the number. Encrypted so that each character
 *   (even spacing) changed one more to the ASCII character. So the letter 'K' became the letter 'L', because the 
 *   'L' is the one place in relation to the 'K'. The phrase "Hello World." Has become so "Ifmmp! Xpsme /". 
 *   According to the ASCII space would be replaced with a '!' because it comes right after.
 */
public class Task4 {

	public static void main(String[] args) {
	//Reading encodingFile.in 
	 TextIO.readFile("src/encodedFile.in");
	 int n = TextIO.getlnInt();
	 
	 	for (int i = 1; i <= n; i++) {
	 		//Reading paragraph string form file
	 		String paragraph = TextIO.getln();
			int paragraphLength = paragraph.length();
			
				for (int j = 0; j < paragraphLength; j++){
					//Taking a character from a string
					char character = paragraph.charAt(j);
					int broj = character - 1;
					//Casting integer to char
					character = (char)broj;
					//Printing
					System.out.print(character);
				}
				System.out.println();
	 	}	
	}
}
