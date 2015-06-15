package ba.bitcamp.kristina.zadaca;

/*
 * Task 2
Napisati program u kojem se nalaze tri String varijable sa 
proizvoljnim vrijednostima. Zadatak je da na
ekran ispišete ta tri String-a zajedno.

 */

public class Sentence {

	public static void main(String[] args) {
		
		String str1 = "Fabrika ";
		String str2 = "duhana ";
		String str3 = "Sarajevo.";
		
		String sentence = str1 + str2 + str3;
		System.out.println(sentence);
	}

}
