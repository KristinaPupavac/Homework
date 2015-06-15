package ba.bitcamp.zadacaS05D01.Task1;

public class Main {

	public static void main(String[] args) {
		// Creating new safe
		Safe s = new Safe("Crni fond");
		// printing sef state
		s.printInformation();
		// adding money in the safe anda printing sate
		s.addMoney(30);
		s.printInformation();

		s.addMoney(100);
		s.printInformation();
		// celar safe and printing state
		s.clear();
		s.printInformation();
	}

}
