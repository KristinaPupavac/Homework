package ba.bitcamp.zadacaS05D01.Task1;

public class Safe {
	private String myCashBox;
	private int savedMoney;

	/**
	 * Constructor seting name of safe
	 * 
	 * @param myCashBox
	 *            - String name of safe
	 */
	public Safe(String myCashBox) {
		this.myCashBox = myCashBox;
	}

	/**
	 * Method adding mony in the cashbox.
	 * 
	 * @param money
	 *            - integer money that is added to the cashbox
	 * 
	 */
	public void addMoney(int money) {
		savedMoney = savedMoney + money;
	}

	/**
	 * Method sets the value of the money in the safe at zero.
	 */
	public void clear() {
		savedMoney = 0;
	}

	/**
	 * Method of printing messages depending on the value of the money in the
	 * safe
	 * 
	 * @param savedMoney
	 *            - money in safe
	 */
	public void printInformation() {
		if (savedMoney == 0) {
			System.out.println("It is empty...");
		} else if (savedMoney >= 1 && savedMoney <= 20) {
			System.out.println("There’s some, but not much.”");
		} else if (savedMoney >= 21 && savedMoney <= 100) {
			System.out.println("There’s some.");
		} else if (savedMoney >= 101) {
			System.out.println("There’s a lot.");
		}

	}

}
