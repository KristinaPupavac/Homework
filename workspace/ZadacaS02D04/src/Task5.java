/*
 * Load number of decimal.txt (consist only one number), convert that
 * number into binary and put it in binary.txt file
 */
public class Task5 {

	public static void main(String[] args) {
		//Reading decimal.txt file
	    TextIO.readFile("src/decimal.txt");
	    //Geting value decimal.txt file
	    int decimal = TextIO.getInt();
	    //Converting decimal to binary
	    String binary = Integer.toBinaryString(decimal);
	    //Writing value in binary.txt file
	    //We can call file binary.txt
	    TextIO.writeUserSelectedFile();
	    // Other way TextIO.writeFile("src/binary.txt");
	    TextIO.putln("*Convert decimal to binary*");
	    TextIO.put(decimal + " = " + binary);
	}

}
