/*
 * Input to your program represents a String bin, and the number n. This string will appear as a series of 
 * zeros and ones (binary system), the number n is on how the figures fixed by a binary number. Do the second
 * complement only if the first digit from the left is 1, taking into account how much the figures that fixed 
 * binary number.
 */
public class Task1 {

	public static void main(String[] args) {
		String nib = "";
		String bin = ("11001100");
		int num = (8);
		int b = bin.length();
		char c = bin.charAt(0);
		if (c == '1' && num == b) {
			for (int i = 0; i < b; i++) {
				char d = bin.charAt(i);
				if (d == '1') {
					nib += 0;
				} else {
					nib += 1;
				}
			}
		// Invert 0 to 1, 1 to 0
		String compl = "";
		char s = nib.charAt(b-1);
		if (s == '0'){
		for (int i = 0; i < b; i++) {
			 s = nib.charAt(i);
			if (i == b - 1){
				compl += '1';
			} else
			compl += s;
		}
		System.out.print(compl);
		} else if(s=='1') {
			int counter = 0;
			for(int i = b-1; i>=0;i--){
				s = nib.charAt(i);
				if(s=='1'){
					compl += '0';
					counter ++;
				} else{
					compl +='1';
					counter ++;
				}
				int g = counter-1;
				if(compl.charAt(g)== '1'){
					counter=i-1;
					break;
				}
			}
			 	if(counter <b){
			 		for(int i = counter; i >= 0; i-- ){
					s = nib.charAt(i);
					compl += s;
			 		}
			 	}
			 String novi = "";
			 	for(int i = b-1; i>=0; i--){
				 char p = compl.charAt(i);
				 novi+=p;
			 }
			 	System.out.println(novi);	
			}
		} else
				System.out.println(bin);
	}
}
