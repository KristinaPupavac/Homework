package ba.bitcamp.zadacaS05D01.Task2;

public class Main {

	public static void main(String[] args) {

		// creating new animals
		Animal a1 = new Animal("Animal 1", 1, 1);
		Animal a2 = new Animal("Animal 2", 2, 3);
		// printing animal state
		a1.printStatus();
		a2.printStatus();
		// seting day and water
		Animal.cycleDayNight();
		Animal.setAmountOfWater(3);
		// printing animal state
		a1.printStatus();
		a2.printStatus();
	}

}
