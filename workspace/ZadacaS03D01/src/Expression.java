/*
 * Dio I:
 * Napisite program koji od korisnika primi unos u vidu stringa. Taj bi izraz(string) trebao biti formata “integer
 * operator integer” , gdje integer predstavlja neki cijeli broj, operator jedan od operatora +, ,/, *. Vas 
 * program treba da uradi evaluaciju tog izraza i ispise rezultat. Npr za unos 1+3 vas program treba da ispise 4,
 * a za unos 4*5 program treba da ispise 20.
 * Dio II:
 * Popravite vas program tako da ne crash sa slucajevima gdje korisnik unese a+3, ili “”(prazan string).
 * Dio III:
 * Prepravite kod tako da program tako da string “ 1 + 6 “ (ova prazna mjesta su razmaci) nece prouzrokovati
 * prestanak rada programa nego ce program raditi kako bi radio za unos “1+6”.
 * Dio IV:
 * Sredite svoj kod tako da program moze evaluirate izraze proizvoljne duzine, tj da unos moze biti: 1+2+43+67...
 * Za izradu zadatka treba da koristite metode iz String i Integer klase. Konkretno ce vam trebati: 
 * indexOf(parametar), substring(start, end), replace() i mozda trim() zavisno od vase implementacije. Prije 
 * izrade otvorite dokumentaciju i/ili primjere za gore navedene metode.
 */
import java.util.Scanner;

public class Expression {

	public static void main(String[] args) {
		System.out.println("Enter a expression: ");
		Scanner in = new Scanner (System.in);
	
		String str1 = "";
		String str2 = "";
		int counter = 0;
		char operator='a';
		String  expression = in.nextLine();
		
		for(int i = 0; i < expression.length(); i++){
			char operatorIndex = expression.charAt(i);
			if(operatorIndex =='+' || operatorIndex == '-' || operatorIndex == '*' || operatorIndex == '/'){
				operator = expression.charAt(i);
				counter++;
			} else if (counter == 0) {
				str1 += operatorIndex;
			} else if (counter == 1) {
				str2 += operatorIndex;
			}
		}
		int num1 = 0;
		int num2 = 0;
		str1 = str1.trim();
		str2 = str2.trim();
		try{
		 num1 = Integer.parseInt(str1);
		 num2 = Integer.parseInt(str2);
		} catch (NumberFormatException e){
			System.out.println("Wrong input!");
			e.printStackTrace();
		}
		
		int result = 0; 
		
		switch (operator){
		case '+':
			result = num1 + num2;
			break;
		case '-':
			result = num1 - num2;
			break;
		case '*':
		result = num1 * num2;
				break;
		case '/':
			result = num1 / num2;
			break;
		}
		System.out.println(num1 + " " + operator + " " + num2 + " Result is: " + result);
		in.close();
	}

}
