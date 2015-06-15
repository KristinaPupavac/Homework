package ba.bitcamp.kristina.zadaca;
/*
 * Bonus
Napisati sto konfuzniji code tako sto koristite pre/post-increment/
decrement operatore. Code mora da prati sve JAVA konvencije 
(osim pravila koje kaze da se takvi operatori ne nalaze u sastavu 
drugih komandi). Code ne smije imati nikakvih gresaka i mora se moci
 pokrenuti.
 */

public class Confusion {
	public static void main(String[] args){
		int error1 = 5;
		double error2 = 0.456;
		
		double conf1 = error1++ - 4;
		double conf2 = --error2;
		double conf3= conf1++ + conf2;
		
		System.out.println("Konfuzija: " + conf3);
	}

}
