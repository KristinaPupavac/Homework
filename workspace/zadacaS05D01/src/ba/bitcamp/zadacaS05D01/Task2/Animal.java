package ba.bitcamp.zadacaS05D01.Task2;

public class Animal {
	private String name;
	private int active;
	private int woterState;
	private static int howMuchWoter = 1;
	private static int dayOrNigth = 1;

	/**
	 * Constructor seting animal name, acitvity is day or nigth animal and woter
	 * state
	 * 
	 * @param name
	 * @param active
	 * @param thirsty
	 */
	public Animal(String name, int active, int woterState) {
		if (active >= 1 && active <= 2 && woterState >= 1 && woterState <= 3) {
			this.active = active;
			this.woterState = woterState;
			this.name = name;
		}
	}

	/**
	 * Method of printing messages depending on the value of water and is it day
	 * or nigth
	 */
	public void printStatus() {
		if (active == dayOrNigth && woterState == howMuchWoter) {
			System.out
					.println("It’s fine. The animal is active and has water.");
		} else if (active != dayOrNigth && woterState == howMuchWoter) {
			System.out
					.println("The animal is not active, but has enough water.");
		} else if (active == dayOrNigth && woterState != howMuchWoter) {
			System.out
					.println("The animal is active, but does not have enough water.");
		} else if (active != dayOrNigth && woterState != howMuchWoter) {
			System.out
					.println("The animal is not active and it does not have enough water.");
		}

	}

	/**
	 * Change the time of day if it was the night he becomes a day after the
	 * method call
	 */
	public static void cycleDayNight() {
		if (dayOrNigth == 1) {
			dayOrNigth = 2;
		} else {
			dayOrNigth = 1;
		}
	}

	/**
	 * Seting woter 0-no woter, 1-little woter 2-little more woter 3-much more
	 * woter
	 * 
	 * @param woter
	 */
	public static void setAmountOfWater(int woter) {
		if (howMuchWoter >= 0 && howMuchWoter <= 3) {
			howMuchWoter = woter;
		} else {

		}
	}

}
